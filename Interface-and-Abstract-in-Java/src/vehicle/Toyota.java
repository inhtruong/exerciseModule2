package vehicle;

public class Toyota extends vahicle {
    protected int price;

    public Toyota(String nameProduce, String series, String gearBox, int price) {
        super(nameProduce, series, gearBox);
        this.price = price;
    }

    public void setNameProduce(String nameProduce) {
        this.nameProduce = nameProduce;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public String getNameProduce() {
        return nameProduce;
    }

    public String getSeries() {
        return series;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void getInfo() {
        System.out.println("Name Produce: " + nameProduce);
        System.out.println("Series: " + series);
        System.out.println("Gear Box: " + gearBox);
        System.out.println("Price: " + price + "VND");
    }
}
