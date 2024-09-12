package basics.CondirionalsAndLoops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //user inputs
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("The Largest Number is  "+largestnum(a,b,c));
    }
    // Function to return the largest of three numbers
    public static int largestnum(int n1, int n2, int n3){
        //using nested Ternery Operator
        return (n1>n2 || n1>n3)? n1 :(Math.max(n2, n3));


//        using a inbuit function Math.max
//        int max=Math.max(Math.max(n1,n2),n3);
//        return max;
    }
}