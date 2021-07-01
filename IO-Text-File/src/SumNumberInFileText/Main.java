package SumNumberInFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int size = 5;

        ArrayList<String> arr = new ArrayList<String>(5);

        for (int i = 0; i < size; i++) {
            String str = scan.next();
            arr.add(str);
        }
//        System.out.print("Day so: ");
//        for(int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.get(i) + " ");
//        }
//        Double i = Double.parseDouble()
        WriteFile(arr);
        ReadFile();
    }

    public static void WriteFile(ArrayList<String> arr) throws IOException {

        try {
            File inFile = new File("number.txt");
            FileWriter fw = new FileWriter(inFile);
            BufferedWriter bw = new BufferedWriter(fw);

            if (inFile.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            for (int i = 0; i < arr.size(); i++) {
                bw.write(arr.get(i) + "\n");
            }

            System.out.println("Success!");
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadFile() {
        try {
            File file = new File("number.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            String line = null;
            int sum = 0;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

            br.close();
            fr.close();
            System.out.println("Tổng = " + sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
