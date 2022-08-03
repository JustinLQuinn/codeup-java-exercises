
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        for(int i=2; i < 1000000; i *= i) {
            System.out.println(i);
            if(i >60000){
                break;
            }
        }
    }
}


