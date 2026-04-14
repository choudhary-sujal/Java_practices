import java.util.Scanner;

public class MaxOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        int a = scanner.nextInt();

        System.out.println("Enter 2st Number:");
        int b = scanner.nextInt();

        System.out.println("Enter 3st Number:");
        int c = scanner.nextInt();

        int largest = a;

        if (b>largest) {
            largest = b;
        }
        if (c>largest) {
            largest = c;
        }


        //System.out.println(largest);

        System.out.println(Math.max(a, Math.max(b,c)));




    }
}
