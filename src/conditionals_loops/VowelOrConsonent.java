package conditionals_loops;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Alphabet to now vowel or consonent :");
        char ch = sc.next().charAt(0);
        

        switch (ch) {
            case 'a', 'A':
            case 'e', 'E':
            case 'i', 'I':
            case 'o', 'O':
            case 'u', 'U':
                System.out.println("The Given Alphabet is Vowel");
                break;
            default:
                System.out.println("The Given Alphabet is Consonent");
                break;
        }
    }
}
