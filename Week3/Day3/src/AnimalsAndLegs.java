
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner sc = new Scanner(System.in);
        System.out.println("How many chickens have you at now? ");
        int chickensCount = sc.nextInt();
        System.out.println("How many pigs have you at now? ");
        int pigsCount = sc.nextInt();
        int AllOfLegs = (chickensCount *2) + (pigsCount * 4);
        System.out.println("At time " + AllOfLegs + " legs it has in the farm.");
    }
}
