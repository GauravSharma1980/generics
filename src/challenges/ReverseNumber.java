package challenges;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("Please enter a number to reverse");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        reverseTheNumber(number);
    }

    private static void reverseTheNumber(int number) {
       int rev =0;
       while(number != 0){
           rev = rev * 10 + number % 10;
           number = number/10;
       }
        System.out.println(rev);
    }
}
