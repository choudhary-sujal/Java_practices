import java.util.Scanner;

public class PracticeNew {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number= ");

        int input = sc.nextInt();

        int sum = 0;

        while (input!=0){
            sum = sum + input%10;
            input=input/10;
        }
        System.out.println("sum of digits is= "+ sum);



    }
}
