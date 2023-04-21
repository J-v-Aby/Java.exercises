package javabasics._2.oop.advanced2p._2;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("accellera");

    }

    @Override
    public void moveBackward() {
        System.out.println("frena");

    }
}
