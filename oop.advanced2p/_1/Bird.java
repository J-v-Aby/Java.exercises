package javabasics._2.oop.advanced2p._1;

public class Bird extends Animal{
    private Double wingSpan;
    public Bird(double height, double weight, Double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public Double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Double flySpeedMetersPerSecond(){

        return getWingSpan() * 4;

    }
}
