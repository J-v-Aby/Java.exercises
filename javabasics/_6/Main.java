package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int value = 51;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println(valueSquareRoot);

    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        System.out.println("Max=" + Math.max(valueA,valueB));
        System.out.println("Min="+ Math.min(valueA,valueB));

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        System.out.println("Remainder="+ totalMoney % costPerBurger);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Replace with your comment 1
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
                                        //usando il comando ceil il numero é stato arrotondato a 5 formato double
        // Replace with your comment 2
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
                                        //usando il comando floor il numero é stato arrotondato a 4 formato double
        // Replace with your comment 3
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
                                        // usando il com. round il numero é stato arrotondato a 5 formato int
        // Replace with your comment 4
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
                                        //ho guardato la soluzione
        // Replace with your comment 5
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
                                        // ho guardato la soluzione
        // Replace with your comment 6
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
                                        // ho guardato la soluzione
    }
}