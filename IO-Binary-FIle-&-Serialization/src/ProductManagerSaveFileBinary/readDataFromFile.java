package ProductManagerSaveFileBinary;

import WriteReadStudentListFileBinary.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class readDataFromFile {
    public readDataFromFile() {

    }

    public List<Product> readDataFromFile(String path) {

        List<Product> products = new ArrayList<Product>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            products = (ArrayList<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return products;
    }
}
