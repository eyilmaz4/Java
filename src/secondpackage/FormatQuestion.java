package secondpackage;

public class FormatQuestion {
    public static void main(String[]args) {
        String java="Java is fun ?";
        float first=78.98f;
        double second=78.98000;



        System.out.format("do you think %s \n ", java);
        System.out.format("\t Yes %% %f of the people think it is fun \n",first);
        System.out.format("\t \t yes %% %.2f of the people thinks it is fun",second);

    }
}
