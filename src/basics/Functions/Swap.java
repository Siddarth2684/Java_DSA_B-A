package basics.Functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int first = in.nextInt();
        System.out.println("Enter the Second Number");
        int second= in.nextInt();
        System.out.printf("Numbers before swapping %d  %d \n",first,second);
        swap(first,second);
    }
    static void swap(int a, int b)
    {
        int temp =a;
        a = b;
        b = temp;
        System.out.printf("Numbers after swapping %d  %d\n",a,b);
    }
}
