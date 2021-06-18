package vehicle;

public class Main {
    public static void main(String[] args) {
        Toyota vios = new Toyota("Toyota", "vios E", "MT", 531000000);
        Honda  city = new Honda("Honda", "City 1.5G", "MT", 559000000);

        vios.getInfo();
        System.out.println("----------------");
        city.getInfo();

        vios.setGearBox("CVT");
        vios.setPrice(569000000);

        System.out.println("----------------");
        vios.getInfo();
        }
}

