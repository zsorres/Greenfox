import java.util.Scanner;

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

public class AverageOfInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please write me five number what you want." );
        System.out.println("First:");
        int first = sc.nextInt();
        System.out.println("Second:");
        int second = sc.nextInt();
        System.out.println("Third:");
        int third = sc.nextInt();
        System.out.println("Fourth:");
        int fourth = sc.nextInt();
        System.out.println("Fifth:");
        int fifth = sc.nextInt();
        int sum = first + second + third + fourth + fifth;
        double average = sum / 5;
        System.out.println("The sum of these numbers is: " + sum);
        System.out.println("The average of these numbers is : " + average);

    }

}
