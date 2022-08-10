package arrays;

import people.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static String [] addPerson(String [] People){

return People;
    }
    public static void main(String[] args) {
        Person[] People = new Person [3];
        People [0] = new Person("John");
        People [1] = new Person("Sandy");
        People [2] = new Person("Melany");
        for (int i = 0; i < People.length; i++) {
            System.out.println(People[i].getName());
        }
    }

}
