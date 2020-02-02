package secondpackage;
import java.util.Scanner;
public class KeyboardInput2 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String name;
        name = myScan.nextLine();
        System.out.println(name);
        int age;
        age=myScan.nextInt();
        System.out.println(age);
        double weight;
        weight=myScan.nextDouble();
        System.out.println(weight);
        String hairColor;
        hairColor=myScan.nextLine();
        System.out.println(hairColor);


    }
}
