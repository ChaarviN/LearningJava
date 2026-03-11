import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //scanner.next() skips anything after space, so if you enter "John Doe", it will only read "John". nextLine() reads the entire line, including spaces.

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello, " + name + "!\nYou are " + age + " years old.");
        System.out.println("Your GPA is: " + gpa);  
        //System.out.println("Student: " + isStudent);
        if(isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}
