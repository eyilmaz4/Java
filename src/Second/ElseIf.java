package Second;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter age:");
        int age= myScan.nextInt();
        if (age<0) {
            System.out.println("cant be negative");
        }
            else if(age>120) {
                System.out.println("CAnt be larger than 120");
            }
            else {
                    System.out.println("ok");
                }
            }
        }


