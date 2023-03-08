package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        System.out.print("G, ");
        System.out.print("V, ");
        System.out.println('A');
        System.out.println("or in english version");
        System.out.print("J, ");
        System.out.print("V, ");
        System.out.print('A');

    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        System.out.print("la mia etá: ");
        System.out.println(33);
        System.out.print("Hai pranzato tardi? ");
        System.out.println(true);
        System.out.println("quanto é costato");
        System.out.print(3.54);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
      //   Write your code here
        int query1 = 33;
        boolean query2 = true;
        double query3 = 3.54;

        System.out.print("La tua etá? ");
       System.out.println(query1);
       System.out.print("Hai pranzato tardi? ");
       System.out.println(query2);
      System.out.print("quanto é costato? ");
      System.out.println(query3);
        }
    }

