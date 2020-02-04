package secondpackage;
import java.util.Scanner;
public class OddTask {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        System.out.println("give an integer");
        int number;
       number = myScan.nextInt();
       // int remainder=number%2;
        //if(remainder==1){..}
       if(!(0==number%2)){
           System.out.println("number is odd");
       }
        System.out.println("number is even");
    }
}
