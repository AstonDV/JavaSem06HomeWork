public class Notebook {
    private String brand;
    private String model;
    private int ramSize;
    private int hddSize;
    private String os;
    private String color;
    private double price;

    public Notebook(String brand, String model, int ramSize, int hddSize, String os, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
