package basics;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("The Largest Number is  "+largestnum(a,b,c));
    }
    public static int largestnum(int n1, int n2, int n3){
        return (n1>n2 || n1>n3)? n1 :(Math.max(n2, n3));
    }
}