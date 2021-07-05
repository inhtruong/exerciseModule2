import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();

            FileWriter fw = new FileWriter("ListMusic.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            // remove all new line
            content = content.replaceAll("\\n+", "");

            // regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);

            bw.write("<html>\n" +
                    "<head>\n" +
                    "<title> List Music </title>\n" +
                    "</head>\n" +
                    "<body>\n");
            while (m.find()) {
                bw.write("<a href=\"#\">"+ m.group(1) +"</a>\n");
            }
            bw.write("</body>\n" +
                    "</html>");
            bw.close();
            fw.close();
            System.out.println("Done!");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
