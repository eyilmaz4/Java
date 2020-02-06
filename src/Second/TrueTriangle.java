package Second;

import java.util.Scanner;

public class TrueTriangle {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("a:");
        int a;
        a = myScan.nextInt();
        System.out.println("b:");
        int b;
        b = myScan.nextInt();
        System.out.println("c:");
        int c;
        c = myScan.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("triangle");
        } else{
            System.out.println("not");
        }
    }
}