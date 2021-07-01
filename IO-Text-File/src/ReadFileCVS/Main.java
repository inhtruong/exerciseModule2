package ReadFileCVS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create new Countrys objects
        Country country1 = new Country(1, "US", "United States");
        Country country2 = new Country(2, "VN", "Viet Nam");
        Country country3 = new Country(3, "AU", "Australia");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "CN", "China");
        Country country7 = new Country(7, "JP", "Japan");

        // Create a new list of Country objects
        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        countries.add(country7);

        WriteCsvFile wCsvFile = new WriteCsvFile();
        wCsvFile.writeCsvFile(countries);
        ReadCsvFile rCsvFile = new ReadCsvFile();
        rCsvFile.readCsvFile();
    }
}
