
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(i);
        do {
//            both of these will work. prefer the i*i method.
                int p = i * i;
                i = p;
//            double p = Math.pow(i,2);
//            i = (int)p;
            System.out.println(i);
                continue;
        } while (i < 300);
    }
}
