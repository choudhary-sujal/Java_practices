import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int input = scanner.nextInt();

        int sum = 0;

        while (input != 0) {
            int lastDigit = input % 10;
            sum = sum + lastDigit;
            input = input / 10;
        }

        System.out.println("The Sum of Digits is: " + sum);




    }
}
