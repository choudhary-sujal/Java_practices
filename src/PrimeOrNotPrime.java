import java.util.Scanner;

public class PrimeOrNotPrime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is Not Prime");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }


    }
}
