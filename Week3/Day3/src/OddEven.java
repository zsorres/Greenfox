import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner sc = new Scanner(System.in);
        System.out.println("Odd or Even. I am telling to you. What is your number? ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is Even.");
        }else {
            System.out.println("Your number is Odd.");
        }
    }

}
