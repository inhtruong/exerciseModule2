import java.io.*;
import java.rmi.server.ExportException;

public class ExampleInputStream {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("OutStream/test_outputStream.txt");

            int i = -1;

            // Đọc lần lượt các byte trong luồng.
            // Mỗi lần đọc ra 8bit, chuyển nó thành số int.
            // Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
            while ((i = is.read()) != -1) {
                System.out.print( (char) i);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //        //Read file
//        try{
//            File f = new File("OutStream/test_outputStream.txt");
//            BufferedReader rd = new BufferedReader(new FileReader(f));
//            String line = "";
//            while ((line = rd.readLine()) != null) {
//                System.out.println(line);
//            }
//            rd.close();
//        }catch (ExportException | FileNotFoundException e){
//            e.printStackTrace();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
