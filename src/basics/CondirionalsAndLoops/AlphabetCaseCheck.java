package basics.CondirionalsAndLoops;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character ");
        char ch =input.next().trim().charAt(0);
        if (ch == 'a' && ch == 'z')
        {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}
