package Second;

import java.util.Scanner;

public class GivenTEmp {
    public static void main(String[]args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Temperature:");
        int temp = myScan.nextInt();
        if (temp < 20) {
            System.out.println("Winter");
        }
        else if (temp >= 21 && temp <= 60){ ;
        System.out.println("Spring");
    }
    else {
        System.out.println("Summer");
        }
}
}
