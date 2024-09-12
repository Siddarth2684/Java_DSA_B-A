package basics.Functions;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
        //String msg = greet();
        //System.out.println(msg);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name=in.nextLine();
        System.out.println(greet(name));

        System.out.println(greet());
    }

    static String greet(){
        String greeting = "How Are You";
        return greeting;
    }


    static String greet(String name){
        String msg = " Hii "+name;
        return msg;
    }
}
