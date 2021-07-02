package ProductManagerSaveFileBinary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 6", "Iphone", 4500000, "SmartPhone"));
        products.add(new Product(2, "Samsung S20", "Samsung", 23500000, "SmartPhone"));
        products.add(new Product(1, "Iphone 12 Pro", "Iphone", 24500000, "SmartPhone"));
        products.add(new Product(1, "Xiaomi K30 Pro", "Xiaomi", 12000000, "SmartPhone"));

        WriteToFile wToFile = new WriteToFile();
        wToFile.writeToFile("src\\ProductManagerSaveFileBinary\\product.txt", products);

        readDataFromFile readData = new readDataFromFile();
        List<Product> productsDataFromData = readData.readDataFromFile("src\\ProductManagerSaveFileBinary\\product.txt");
        for(int i = 0; i < productsDataFromData.size(); i++) {
            System.out.println(productsDataFromData.get(i) + " ");
        }
    }
}
