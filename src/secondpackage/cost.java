package secondpackage;

import java.io.PrintStream;

public class cost {
    public static void main(String[] args){
        float item_1=1.99f;
        float item_2=2.49f;
        System.out.format("\t\t\t\t Receipt \n");
        System.out.format("\t\titem 1\t: \t $% .2f\n", item_1);
        System.out.format("\t\titem 2\t: \t $% .2f", item_2);

    }
}