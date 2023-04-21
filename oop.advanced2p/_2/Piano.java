package javabasics._2.oop.advanced2p._2;

public class Piano extends Instrument implements Playable{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("suona la 5' sinfonia di Beethoven");
    }
}
