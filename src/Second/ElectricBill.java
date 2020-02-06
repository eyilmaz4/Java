package Second;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[]args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Consumption:");
        float consumption = myScan.nextFloat();
        if (consumption<500) {
            System.out.println("Rate is:$0.3kw"+" and your Bill is "+"$"+(consumption*0.3)+"kw");
        }
            else if(consumption>=500 && consumption<=1000){
                System.out.println("Rate is:$0.4kw"+" and your Bill is "+"$"+(consumption*0.4)+"kw");
                            }
            else if(consumption>1000 && consumption<=2000){
                System.out.println("Rate is:$0.5kw"+" and your Bill is "+"$"+(consumption*0.5)+"kw");
            }
            else {
                System.out.println("Rate is:$0.6kw"+" and your Bill is "+"$"+(consumption*0.6)+"kw");
            }

            }
        }

