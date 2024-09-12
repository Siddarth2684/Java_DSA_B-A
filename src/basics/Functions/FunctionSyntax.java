package basics.Functions;

import java.util.Scanner;

public class FunctionSyntax {
    public static void main(String[] args) {
        System.out.println("The Sum is " +sum());
        // arguments ----- The values that are passed to a paramterized function
        System.out.println("The Sum is " +sum(10,20));
    }

    /*
    Function Syntax :
    type 1
    access-modifier return-type funcName(arguments/parameters){
        body of the Function
        return;
    }


    type 2 :
    return-type funcname(){
        body
        return;
    }
        */

    // This functinon is of return type int its is going to return sum value to main method
    public static int sum(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=in.nextInt();
        System.out.println("Enter the second number");
        int n2=in.nextInt();
        int sum = n1+n2;
        return sum;
    }

    //a Function with parameters of type int
    //parameters ---- variables or identifiers that are defined in function
    static int sum(int a, int b)
    {
        System.out.println("This is from Paramterized function");
        int sum= a+b;
        return sum;
    }
}
