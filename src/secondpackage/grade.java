package secondpackage;

public class grade {
    public static void main(String[] args){

        String name_1= "John";
        String name_2= "Kimberly";
        String grade= "A";

        System.out.println("Name \t\t\t Grade");
        System.out.println("------- \t\t-------");
        System.out.format("%s\t\t:\t\t%s\n",name_1,grade);
        System.out.format("%s\t:\t\t%s\n",name_2,grade);

    }
}
