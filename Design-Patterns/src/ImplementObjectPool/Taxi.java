package ImplementObjectPool;

public class Taxi {
    private String name;

    public Taxi() {

    }

    public Taxi(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                '}';
    }
}
