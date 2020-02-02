package secondpackage;
import java.util.Scanner;
public class GivenRectangle {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("please enter the width:");
        int a;
        a = myScan.nextInt();
        System.out.println("please enter the height:");
        int b;
        b = myScan.nextInt();
        System.out.println("area:"+ a*b);
    }
}
