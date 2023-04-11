package javabasics._2.oop.advanced._6;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,

    }
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Days[] arrDay= Days.values();
        for(Days day: arrDay){
            System.out.println(day+ " "+ day.ordinal());// .ordinal serve ad stamapre i numeri di ordine
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    public enum Season {
        SPRING, SUMMER, FALL, WINTER
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Season season= Season.WINTER;
        switch (season){
            case SPRING -> System.out.println("Primavera dal 21 Marzo al 20 Giugno");
            case SUMMER -> System.out.println("Estate dal 21 Giugno al 23 Settembre");
            case FALL -> System.out.println("Autunno dal 24 Settembre al 20 Dicembre");
            case WINTER -> System.out.println("Inverno dal 21 Dicembre al 20 Marzo");
            default -> System.out.println("riprova");


        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    public enum  TrafficLight{
        RED, YELLOW, GREEN
    }
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight trafficLight= TrafficLight.YELLOW;
        if(trafficLight==TrafficLight.GREEN){
            System.out.println("vai");
        }else if(trafficLight.equals(TrafficLight.YELLOW)){
            System.out.println("attento");
        } else {
            System.out.println("fermo");
        }
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private enum Days2{
        MONDAY (false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(true),
        SATURDAY(true),
        SUNDAY(true),
        ;

        private final boolean Weekend;

        Days2(boolean Weekend) {
            this.Weekend= Weekend;
        }

        public boolean getWeekend() {
            return Weekend;
        }
    }

    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
     /*   boolean isWeekend= true;
      if(isWeekend){
          System.out.println(Days.FRIDAY+" "+Days.SATURDAY+ " "+Days.SUNDAY);
      } else {
          System.out.println(Days.MONDAY+" "+Days.TUESDAY+" "+Days.WEDNESDAY+" "+Days.THURSDAY);
      }
*/
        Days2[] arr= Days2.values();
        for(Days2 day:arr){
            if(day.getWeekend()==false){
                System.out.println(day+" is weekdays");
            }else {
                System.out.println( day+ " is weekend");
            }
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the
     * integers, and returns the result.
     */
    public enum Operator{
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        Operator operator=Operator.ADD;
        switch (operator){
            case ADD:
                double op=num1+num2;
                System.out.println(op);
                break;
            case SUBTRACT:
                double ops=num1-num2;
                System.out.println(ops);
                break;
                case MULTIPLY:
                double opm=num1*num2;
                System.out.println(opm);
                break;
                case DIVIDE:
                double opd=num1/num2;
                System.out.println(opd);
                break;

        }

    }

}
