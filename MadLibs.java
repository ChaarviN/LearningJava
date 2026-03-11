import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (descriptive): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun(item): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another adjective(descriptive): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with -ing(action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another adjective(descriptive): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " supermarket.");
        System.out.println("In one of the stalls, I saw a " +  noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();

    }
}
