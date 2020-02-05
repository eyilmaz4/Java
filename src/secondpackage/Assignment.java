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

        ID1 = "123";
        ID2 = "124";
        ID3 = "125";
        ID4 = "126";
        ID5 = "127";
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

        System.out.println("what is 2nd ID number");
        float item2;
        item2 = myScan.nextFloat();
        System.out.println("what is Quantity");
        float quantity2;
        quantity2 = myScan.nextFloat();

        System.out.println("what is 3rd ID number");
        float item3;
        item3 = myScan.nextFloat();
        System.out.println("what is Quantity");
        float quantity3;
        quantity3 = myScan.nextFloat();

        //float item4;
      //  item4 = myScan.nextFloat();
        //System.out.println("what is Quantity");
       // float quantity4;
       // quantity4 = myScan.nextFloat();

       // float item5;
        //item5 = myScan.nextFloat();
      //  System.out.println("what is Quantity");
       // float quantity5;
        //quantity5 = myScan.nextFloat();
       // float item;


        System.out.println("ItemID" + "      " + "Quantity" + "     " + "Price");
        System.out.println("-------------------------------");

        if (item1 == 123) {

            System.out.println(" " + ID1 + "          " + quantity1 + "       " + "$" + (quantity1 * price1));
        }
        if (item1 == 124) {

            System.out.println(" " + ID2 + "          " + quantity1 + "       " + "$" + (quantity1 * price2));
        }
        if (item1 == 125) {

            System.out.println(" " + ID3 + "          " + quantity1 + "       " + "$" + (quantity1 * price3));
        }
        if (item1 == 126) {

            System.out.println(" " + ID4 + "          " + quantity1+ "       " + "$" + (quantity1* price4));
        }
        if (item1 == 127) {

            System.out.println(" " + ID5 + "          " + quantity1 + "       " + "$" + (quantity1 * price5));
        }

        if (item2 == 123) {

            System.out.println(" " + ID1 + "          " + quantity2 + "       " + "$" + (quantity2* price1));
        }
        if (item2 == 124) {

            System.out.println(" " + ID2 + "          " + quantity2 + "       " + "$" + (quantity2 * price2));
        }
        if(item2 ==125) {

            System.out.println(" " + ID3 + "          " + quantity2 + "       " + "$" + (quantity2 * price3));
        }
        if(item2 ==126){

            System.out.println(" " + ID4 + "          " + quantity2 + "       " + "$" + (quantity2 * price4));
        }
        if (item2 == 127) {

            System.out.println(" " + ID5 + "          " + quantity2 + "       " + "$" + (quantity2 * price5));
        }
        if (item3 == 123) {

            System.out.println(" " + ID1 + "          " + quantity3 + "       " + "$" + (quantity3* price1));
        }
        if (item3 == 124) {

            System.out.println(" " + ID2 + "          " + quantity3 + "       " + "$" + (quantity3 * price2));
        }
        if(item3==125) {

            System.out.println(" " + ID3 + "          " + quantity3 + "       " + "$" + (quantity3 * price3));
        }
        if(item3 ==126){

            System.out.println(" " + ID4 + "          " + quantity3 + "       " + "$" + (quantity3 * price4));
        }
        if (item3 == 127) {

            System.out.println(" " + ID5 + "          " + quantity3 + "       " + "$" + (quantity3 * price5));
        }
    }
}




