import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.print(Add(12, 32));
//        System.out.print(Subtract(12, 32));
//        System.out.print(Multiply(12, 32));
//        System.out.println(Divide(40, 2));

        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = getInteger(1, 10, scanner.nextInt());


    }

    public static int Add(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int Divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int getInteger(int min, int max,int userInt) {
        if (userInt < min || userInt > max) {
            System.out.println("Not correct number, please try again.\n");
            Scanner scanner = new Scanner(System.in);
            int userInput = getInteger(1, 10, scanner.nextInt());
        } else {
            System.out.println(userInt);

        }
        return userInt;
    }

}

