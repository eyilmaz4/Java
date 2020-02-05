package secondpackage;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String ID1;
        String ID2;
        String ID3;
        String ID4;
        String ID5;

        ID1="123";
        ID2="124";
        ID3="125";
        ID4="126";
        ID5="127";
        float price1;
        price1 = 2.49f;
        float price2;
        price2 = 4.79f;
        float price3;
        price3 = 1.65f;
        float price4;
        price4 = 7.88f;
        float price5;
        price5 = 0.99f;

        System.out.println("what is ID number");
        float item1;
        item1 = myScan.nextFloat();
        System.out.println("what is Quantity");
        float quantity1;
        quantity1 = myScan.nextFloat();

        float item2;
        item2 = myScan.nextFloat();
        System.out.println("what is Quantity");

         float item3;
        item3 = myScan.nextFloat();
        System.out.println("what is Quantity");
        float quantity3;
        quantity3 = myScan.nextFloat();

        if (item1 == 123) {
            System.out.println("ItemID"+"      "+"Quantity"+"     "+"Price");
            System.out.println("-------------------------------");
            System.out.println(" "+ID1+"          "+quantity1+"       "+"$"+(quantity1 * price1));
        }
        if()
    }
}