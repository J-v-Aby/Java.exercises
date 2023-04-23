package javabasics._2.opp.advanced3._1;

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
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Double x = Math.random()*10;

      String y=  x>=50?"x è maggiore o uguale a 50": "x è inferiore a 50";
        System.out.println(y);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Persona persona= new Persona("Valerio", 26,"Via cicala");
        System.out.println( persona.toString());
    }
    public record Persona(String nome, Integer age, String address){
        @Override
        public String toString() {
            return "Persona{" +
                    "nome='" + nome + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Integer bigInteger = 800;
        Double bigDecimal = 300.0;

       Double newBigDecimal= divisore(bigDecimal);
       Integer newBigInteger= divisore(bigInteger);

        System.out.println(newBigDecimal +"\n"+ newBigInteger);

    }
        public static Double divisore (Double x){
            Double risul = x / Math.PI;
            return risul;
        }
        public static Integer divisore (Integer x){
            Integer risul = x / 3;
            return risul;
        }

}
