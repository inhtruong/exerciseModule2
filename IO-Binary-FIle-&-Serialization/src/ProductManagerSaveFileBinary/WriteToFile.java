package ProductManagerSaveFileBinary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteToFile {

    public WriteToFile() {

    }

    public void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
