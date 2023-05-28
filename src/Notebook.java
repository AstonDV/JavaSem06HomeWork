public class Notebook {
    private String brand;
    private int ramSize;
    private int hddSize;
    private String operatingSystem;
    private String color;
    private double price;

    public Notebook(String brand, int ramSize, int hddSize, String operatingSystem, String color, double price) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
