package basics;

import java.util.Scanner;

public class ReversingDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = input.nextInt();
        System.out.printf("The Reverse of %d is %d",n,revFunc(n));
    }
    public static int revFunc(int num)
    {
        int reversed = 0;
        while(num >0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }
}
