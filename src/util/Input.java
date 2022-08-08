package util;

import java.awt.im.InputContext;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    public String getString(){
        String info = scanner.nextLine();
        return info;
    }
    public boolean yesNo(){
        String text = getString();
        if(text.equals("yes") || text.equals("y")){
            return true;
        }
            return false;
    }
    public int getInt(){
         boolean var = scanner.hasNextInt();
          if(var){
              return scanner.nextInt();
          }
          return 0;
    }
    public double getDouble(){
        boolean var = scanner.hasNextDouble();
        if(var){
            return scanner.nextDouble();
        }
        return 0;
    }

    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt());
        System.out.println(input.getDouble());
    }
}
