import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        Scanner sc = new Scanner(System.in);
        System.out.println("One or Two? Maybe zero? I am telling to you. What is your number? ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Not enough");
        }else if (number == 1) {
            System.out.println("Your number is One.");
        } else if (number == 2) {
            System.out.println("Your number is Two.");
        } else {
            System.out.println("Your number is a lot");
        }
    }
}