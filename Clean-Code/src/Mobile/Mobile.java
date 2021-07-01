package Mobile;

public class Mobile {
    private String name;
    private String color;
    private int memory;
    private String msg;

    Mobile() {

    }

    Mobile(String name, String color, int memory) {
        this.name = name;
        this.color = color;
        this.memory = memory;
        this.msg = getMessage();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
