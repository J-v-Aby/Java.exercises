package oop._2;

public class Student {

     String name;
    Integer age=null;

     Student(String name,Integer age){


        this.name=name;
        this.age=age;
         System.out.println("costracting");
         System.out.println("costracted");





    }
    Student(String name){
         this.name=name;


    }
    Student(Integer age){
         this.age=age;


    }
    Student() {


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
