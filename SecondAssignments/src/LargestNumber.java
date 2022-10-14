import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int enteredNum1 = scanner.nextInt();
        System.out.println("Enter second number ");
        int enteredNum2 = scanner.nextInt();
        if (enteredNum1>enteredNum2){
            System.out.println(enteredNum1+" is largest");
        }else {
            System.out.println(enteredNum2+" is largest");
        }
    }
}
