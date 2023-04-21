package javabasics._2.oop.advanced2p._2;

public class Guitar extends Instrument implements Playable{

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println(" suona l'assollo di innuendo");
    }
}
