import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner sc = new Scanner(System.in);
        System.out.println("How much is your speed by miles?");
        double miles = sc.nextDouble();
        double km = miles * 1.6;
        System.out.println("Your speed is by km = " + km + " km/h.");
        
    }
}