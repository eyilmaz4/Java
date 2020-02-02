package secondpackage;
import java.util.Scanner;
public class Sample_Keyboard {
    public static void main(String[]args){
        Scanner readKeyboard=new Scanner(System.in);
        System.out.println("please enter your name");
        String myName=readKeyboard.nextLine();
        System.out.println("your name is:"+myName);
    }
}
