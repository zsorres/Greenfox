import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner sc = new Scanner(System.in);
        System.out.println("Which is the bigger? Give me two numbers!");
        System.out.println("First: ");
        int first = sc.nextInt();
        System.out.println("Second: ");
        int second = sc.nextInt();
        if (first > second) {
            System.out.println("The first number is bigger than second number.");
        }else {
            System.out.println("The second number is bigger than first number.");
        }
    }
}