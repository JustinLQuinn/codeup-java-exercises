
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 0;
        do {

                i++;
                if(i % 2 == 1) {
                    continue;
                }
                System.out.println(i);


        } while (i <= 100);

    }
}
