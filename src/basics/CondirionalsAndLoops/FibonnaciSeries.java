package basics.CondirionalsAndLoops;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.print(+first+ " " +second);
        int third;
        int count=2;
        while(count<n)
        {
            third = first + second;
            System.out.print(" " + third);
            first=second;
            second=third;
            count++;
        }

    }
}
