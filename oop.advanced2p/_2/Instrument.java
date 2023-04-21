package javabasics._2.oop.advanced2p._2;

public class Instrument {
    private String name;
    private String brand;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
