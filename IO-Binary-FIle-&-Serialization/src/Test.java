import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test {
//    public static void main(String[] args)
//    {
//        Demo object = new Demo(1, "Dat");
//        String filename = "file.txt";
//
//        // Serialization
//        try
//        {
//            //Saving of object in a file
//            FileOutputStream file = new FileOutputStream(filename, StandardCharsets.UTF_8);
//            ObjectOutputStream out = new ObjectOutputStream(file);
//
//            // Method for serialization of object
//            out.writeObject(object);
//
//            out.close();
//            file.close();
//
//            System.out.println("Object has been serialized");
//
//        }
//
//        catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }
//
//
//        Demo object1 = null;
//
//        // Deserialization
//        try
//        {
//            // Reading the object from a file
//            FileInputStream file = new FileInputStream(filename);
//            ObjectInputStream in = new ObjectInputStream(file);
//
//            // Method for deserialization of object
//            object1 = (Demo)in.readObject();
//
//            in.close();
//            file.close();
//
//            System.out.println("Object has been deserialized ");
//            System.out.println("a = " + object1.a);
//            System.out.println("b = " + object1.b);
//        }
//
//        catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }
//
//        catch(ClassNotFoundException ex)
//        {
//            System.out.println("ClassNotFoundException is caught");
//        }
//
//    }

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true) {
            System.out.print("Nhập 1 ký tự: ");
            int ch = is.read();
            if (ch == 'q') {
                System.out.println("Finished!");
                break;
            }
            is.skip(2); // Loại bỏ 2 ký tự \r và \n
            System.out.println("Ký tự nhận được: " + (char) ch);
        }
    }
}
