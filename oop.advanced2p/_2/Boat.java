package javabasics._2.oop.advanced2p._2;

public class Boat implements Movable{
    @Override
    public void moveForward() {
        System.out.println("puoi andare");

    }

    @Override
    public void moveBackward() {
        System.out.println("totna indietro");

    }
}
