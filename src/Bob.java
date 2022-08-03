import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        String bobHello = ("Hi, let's talk...");
            System.out.println("Bob: " + bobHello);
        for (int i = 0; i < 300; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Talk to Bob: ");
            String uI = scanner.nextLine();
            if (uI.endsWith("?")) {
                System.out.println("Bob: Yeah, same here.");
            } else if (uI.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (uI.equals("")) {
                System.out.println("Bob: Fine..Be that way!");
            } else if (uI.equalsIgnoreCase("bye") || uI.equalsIgnoreCase("exit") || uI.equalsIgnoreCase("close")) {
                System.out.println("Bob: Nice talking with you. See you laterz");
                break;
            } else {
                System.out.println("Bob: Whatever.");
            }
        }
    }
}
