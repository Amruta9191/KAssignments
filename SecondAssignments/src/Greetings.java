import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String enteredName = scanner.next();
        System.out.println("Hello "+enteredName);
    }
}
