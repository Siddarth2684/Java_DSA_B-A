package basics;

import java.util.Scanner;

public class CountNumInDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = input.nextInt();
        System.out.println("Enter the number to search for");
        int toSearch = input.nextInt();
        System.out.printf("The %d occured %d times in %d",toSearch,searchForOccurence(n,toSearch),n);
    }
    public static int searchForOccurence(int num,int toSearch)
    {
        int count=0;
        while(num>0) {
            int rem = num % 10;
            if (rem == toSearch) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

}
