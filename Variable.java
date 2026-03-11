public class Variable {
    public static void main(String[] args) {
       int age = 25; // Primitive variable
       double price = 19.99; // Primitive variable
       char grade = 'A'; // Primitive variable
       boolean isStudent = true; // Primitive variable


       System.out.println("Age: " + age);
       System.out.println("Price: $" + price);
       System.out.println("Grade: " + grade);
       if(isStudent) {
           System.out.println("You are a student.");
       }
       else {
           System.out.println("You are not a student.");
       }
       String name = "Alice"; // Reference variable
       System.out.println("Name: " + name);
    }
}
