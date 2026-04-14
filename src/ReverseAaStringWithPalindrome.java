import java.util.Scanner;

public class ReverseAaStringWithPalindrome {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line: ");
        String input = scanner.nextLine();

        String rev = "";

        for (int i = input.length() -1; i>= 0; i--)
            rev = rev + input.charAt(i);

        System.out.println("Reversed String is: " + rev);

    }
}



// Solution for Checking whether the string is a palindrome or not!!
/* import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return input.equalsIgnoreCase(reversed);
    }
}*/
