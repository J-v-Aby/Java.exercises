package javabasics._2.oop.advanced2p._3;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Persona persona= new Persona("Simone", 25,"Via dei ginestri in fiore 83" );
        Persona persona1=new Persona();
        persona1.setName("Francesco");
        persona1.setAddress("Via dei cicloamini 11" );
        persona1.setAge(22);
        System.out.println(persona);
        persona1.toString();
    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Persona p1= new Persona("alberto", 35, "via taldeitali");
        Persona p3= new Persona("giulio", 30, "via taldeitali");

        System.out.println(p1.hashCode()==p3.hashCode());
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}
