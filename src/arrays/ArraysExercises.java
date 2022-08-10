package arrays;

import people.Person;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

    public static Person [] addPerson(Person [] People,Person newPerson){

        int length = People.length + 1;
        //this declaration reasigns People to the new array
       People = Arrays.copyOf(People, length);
       People [People.length -1] = newPerson;
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
        //you must change your array differentiation outside of the actual function.
        //this is what we are doing here.
        People = addPerson(People, new Person("Dave"));
        for (int i = 0; i < People.length; i++) {
            System.out.println(People[i].getName());
        }

    }

}
