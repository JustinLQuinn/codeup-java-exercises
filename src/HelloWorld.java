import javax.print.DocFlavor;
import java.awt.geom.Arc2D;
import java.util.Scanner;
public class HelloWorld {
        public static void main(String[] args) {
            System.out.print("Hello, World!");
            System.out.print("\n");

//            int myFavoriteNumber = 23;
//
//            System.out.println(myFavoriteNumber);
//            System.out.print("\n");
//
//            String myString = ("Whqt can we do to help today?");
//            System.out.println(myString);
//            System.out.print("\n");
//
//            myString = ("3.14159");
//            System.out.println(myString);
//            System.out.print("\n");

//            myString = (3.14159);
//            System.out.println(myString);
//            System.out.print("\n");

//            Long myNumber;
//            System.out.println(myNumber);
//            System.out.print("\n");

//            Long myNumber = 3.14;
//            System.out.println(myNumber);
//            System.out.print("\n");

//            long myNumber = 123L;
//            System.out.println(myNumber);
//            System.out.print("\n");

//            myNumber = 123;
//            System.out.println(myNumber);
//            System.out.print("\n");

//            float myNumber;
//            myNumber = (float) 3.14;
//            System.out.println(myNumber);
//            System.out.print("\n");

//            int x = 5;
//            System.out.println(x);

//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);

//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);
//            the (x++) increments behind the function, so you must then redeclare the variable.
//            In (++x) it increments in front of the variable so you see the outcome apon call.

//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter something: ");
            String userInput = scanner.nextLine();

            System.out.println("You entered: --> \"" + userInput + "\" <--");
        }

    };

