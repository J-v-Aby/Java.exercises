package javabasics._2.opp.advanced3._2;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    private static List<Integer> ourNumbers = IntStream.range(1, 12).boxed().toList();

    /**
     * 1:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use forEach to print the selected even numbers
     * <p>
     * %
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        System.out.println(proviamoComeVa(ourNumbers));
    }

    public static List<Integer> proviamoComeVa(List<Integer> x) {
        return x.stream().filter(y -> y % 2 == 0).toList();
    }

    /**
     * 2:
     * <p>
     * <p>
     * Use filter to select only odd numbers from the list 'ourNumbers'
     * <p>
     * Use the toSet() method to collect the selected odd numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        System.out.println(hoCapitoComeVa(ourNumbers));
    }

    public static Set<Integer> hoCapitoComeVa(List<Integer> x) {
        Set<Integer> j = x.stream().filter(y -> y % 2 != 0).collect(Collectors.toSet());
        return j;
    }

    /**
     * 3:
     * <p>
     * <p>
     * Use map to convert the strings to uppercase
     * <p>
     * Use the toSet() method to collect the resulting uppercase strings in a Set
     * <p>
     * Print the resulting Set
     * <p>
     * BONUS: do so without creating any variables!
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        List<String> alice = List.of("Alice", "Bob", "Charlie");
        // Your code here
        System.out.println(alice.stream().map(y -> y.toUpperCase(Locale.ROOT)).collect(Collectors.toSet()));

        // System.out.println(comeVa(alice));
    }
   /* public static Set<String> comeVa(List<String> x) {
        Set<String> j = x.stream().map(y -> y.toUpperCase(Locale.ROOT)).collect(Collectors.toSet());
        return j;
    }*/

    /**
     * 4:
     * <p>
     * <p>
     * Use filter to select only even numbers from the list 'ourNumbers'
     * <p>
     * Use map to multiply the even numbers by 2
     * <p>
     * Use the toSet() method to collect the resulting numbers in a Set
     * <p>
     * Print the resulting Set
     */
    private static void exercise4() {
        System.out.println("\nExercise 4");
        //Your code here
        System.out.println(va(ourNumbers));
    }

    public static Set<Integer> va(List<Integer> x) {
        Set<Integer> j = x.stream().filter(y -> y % 2 == 0).map(u -> u * 2).collect(Collectors.toSet());
        return j;
    }
}
