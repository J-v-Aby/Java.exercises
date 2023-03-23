package oop._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student studente=new Student("Giulio","Romano",23,"Rosso",4);
        System.out.print("nome:"+" "+studente.getNome()+" "+"cognome: "+studente.getCognome()+" " +
                "colore preferito: "+studente.getColorePreferito());
        System.out.println(" etá: "+studente.getEtá()+" \n"+" numero civico: "+ studente.getNumeroCivico());

        studente.setNome("Giorgia");
        studente.setCognome("Vassallo");
        studente.setEtá(25);
        studente.setColorePreferito("Viola");
        studente.setNumeroCivico(81);
        System.out.print("nome:"+" "+studente.getNome()+" "+"cognome: "+studente.getCognome()+" " +
                "colore preferito: "+studente.getColorePreferito());
        System.out.println(" etá: "+studente.getEtá()+" \n"+" numero civico: "+ studente.getNumeroCivico());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student studente2= new Student("Valnza",'A',true);
        Student studente3= new Student("Vnza",'B',false);
        Student studente4= new Student("Va",'F',true);
        Student studente5= new Student("za",'A',false);
        Student studente6= new Student("Valnzato",'C',false);





       System.out.println("sei stato tra i" +" che hanno ottenuto la maglietta" );





        //System.out.println(studente2.getNome());
    }

}
