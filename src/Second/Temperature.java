package Second;

import java.util.Scanner;

public class Temperature {


    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("give a temperarure");
        int temp;
        temp = myScan.nextInt();
        if (temp > 30) {
            System.out.println("wear hat");
        } else {
            System.out.println("wear jacket");
        }
    }
}