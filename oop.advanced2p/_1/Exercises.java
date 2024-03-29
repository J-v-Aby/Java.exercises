package javabasics._2.oop.advanced2p._1;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog malamute=new Dog(58,43, "malamute");
        System.out.println( malamute.runSpeedMetersPerSecond()+" malamute");


    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Bird falcoPellegrino = new Bird(58, 1.5, 120.0);
        Fish orca = new Fish(800, 400, "delfinide");

        System.out.println(orca.swimSpeedMetersPerSecond()+ " orca");
        System.out.println(falcoPellegrino.flySpeedMetersPerSecond()+" falco");
    }

    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Bird falcoPellegrino = new Bird(58, 1.5, 120.0);
        Fish orca = new Fish(800, 400, "delfinide");
        Dog malamute=new Dog(58,43, "malamute");

        if(orca.swimSpeedMetersPerSecond()> malamute.runSpeedMetersPerSecond()){
            System.out.println("lorca con una velocitá al secomndo di "+ orca.swimSpeedMetersPerSecond()+" é la piu veloce");
        } else if (malamute.runSpeedMetersPerSecond()> falcoPellegrino.flySpeedMetersPerSecond()) {
            System.out.println("il malamute con una velocitá al secomndo di "+ malamute.runSpeedMetersPerSecond()+" é la piu veloce");
        }else {
            System.out.println("il falco con una velocitá al secomndo di "+ falcoPellegrino.flySpeedMetersPerSecond()+" é la piu veloce");
        }

    }
}
