package secondpackage;

import java.util.Scanner;

public class monthlyPayment {
         public static void main(String[] args) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("what is MSRP");
            float msrp;
            msrp=myScan.nextFloat();
             System.out.println("what is discount");
            float discount;
            discount=myScan.nextFloat();
             System.out.println("what is downPayment");
            float downPayment;
            downPayment=myScan.nextFloat();

            System.out.format("montly payment: %.3f" , (((msrp*(100-discount))-downPayment)/12)  );

        }
}
