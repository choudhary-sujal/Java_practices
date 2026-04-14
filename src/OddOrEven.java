import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

    }
}


/*Extra here is that the same thing can be done with the for loop, while loop, etc + You can also add some methods here
that are count total even and total odd in it after using for or while loop
 */

//Solution for the same using for loop.

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }

        }

    }
}*/

//Solution of the same with while loop including the total evenCount and oddCount methods.

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        while (true) {

            System.out.print("Enter a number (0 to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                System.out.println(number + " is even");
                evenCount++;
            } else {
                System.out.println(number + " is odd");
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}*/

