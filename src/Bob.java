import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        String bobHello = ("Hi, let's talk...");
            System.out.println("Bob: " + bobHello);
        Scanner scanner = new Scanner(System.in);
            System.out.print("Talk to Bob");
        String uI = scanner.nextLine();
        if(uI.endsWith("?")){
            System.out.println("Sure.");
        } else if (uI.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (uI.equals("")) {
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever.");
        }


    }
}
