import java.util.Scanner;


public class ReverseanumbernadPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number that you want to reverse: ");
        int input = scanner.nextInt();

        int rev = 0;

        int org_num =input;

        while (input != 0) {

            rev = rev * 10 + input%10;   // 0+1234%10=4    40+3=43    430+2=432   4320+1=4321
            input = input / 10;        //1234/10=123    123/10=12   12/10=1   1/10=0
        }

        if(org_num==rev)
            System.out.println(org_num+ " Is a Palindrome Number");
        else
            System.out.println(org_num+ " Is not a Palindrome Number");



    }
}