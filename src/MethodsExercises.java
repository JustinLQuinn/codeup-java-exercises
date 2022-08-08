import java.util.Scanner;
public class MethodsExercises {

    public static void main(String[] args) {
        System.out.print(Add(12, 32));
        System.out.println();
        System.out.print(Subtract(12, 32));
        System.out.println();
        System.out.print(Multiply(12, 32));
        System.out.println();
        System.out.println(Divide(40, 2));
        System.out.println();

        System.out.print("Enter a number between 1 and 10: ");
        Scanner scanner = new Scanner(System.in);
        getInteger(1, 10, scanner.nextInt());

        System.out.print("Find Factorial for # range 1 to 20: ");
        Scanner identInteger = new Scanner(System.in);
        lowFactorial(identInteger.nextInt());

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
            int userInput = getInteger(min, max, scanner.nextInt());
        } else {
            System.out.println(userInt);
        }
        return userInt;
    }
    public static long lowFactorial(int n) {
        long fact = 1;
        if(n < 1 || n > 20){
            System.out.println("Your number is not within range limitations");
            System.out.print("Find Factorial for # range 1 to 20: ");
            Scanner identInteger = new Scanner(System.in);
            return lowFactorial(identInteger.nextInt());
        }else{
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial "+n+"! = "+fact);
            System.out.print("Would you like to Continue?");
            Scanner questionFactorial = new Scanner(System.in);
            String answer = questionFactorial.nextLine();
            continueGame(answer);
        }
        return fact;
    }
      public static void continueGame(String g){
        if(g.equalsIgnoreCase("yes") || g.equalsIgnoreCase("continue")){
            System.out.print("Find Factorial for # range 1 to 20: ");
            Scanner identInteger = new Scanner(System.in);
            lowFactorial(identInteger.nextInt());
        }
    }

}

