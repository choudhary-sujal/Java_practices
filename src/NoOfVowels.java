import java.util.Scanner;

public class NoOfVowels {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a String to count No. Of VOWELS: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                count++;

        }
        System.out.println("The total number of vowels: " + count);

    }
}

//For counting both vowels and consonants, the code is here next:

/* import java.util.Scanner;

public class NoOfVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a String: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            // Check if it is a letter
            if (Character.isLetter(c)) {

                // Convert to lowercase for easier checking
                c = Character.toLowerCase(c);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels = " + vowelCount);
        System.out.println("Consonants = " + consonantCount);
    }
}*/
