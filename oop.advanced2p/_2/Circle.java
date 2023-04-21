package javabasics._2.oop.advanced2p._2;

public class Circle extends Shape{


    public Circle(Double height, Double width) {
        super(height, width);
    }

    Double calculateArea(){
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
