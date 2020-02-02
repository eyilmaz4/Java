package secondpackage;
import java.util.Scanner;
public class GivenCircle {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("what is radius");
        float radius;
        double pi;
        pi = 3.14;
        radius = myScan.nextFloat();
        System.out.print("perimeter:" + 2 * pi * radius+"\n" );
        System.out.format("perimeter with 3 part: %.7f",2*pi*radius);
    }
}