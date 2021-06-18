package vehicle;

public abstract class vahicle {
    protected String nameProduce;
    protected String series;
    protected String gearBox;

    public vahicle(String nameProduce, String series, String gearBox) {
        this.nameProduce = nameProduce;
        this.series = series;
        this.gearBox = gearBox;
    }

    public abstract void getInfo();
}
