import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input from the user.

public class EvenOddUserInput {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number:- ");
       int enteredNumber = scanner.nextInt();
       isEvenOdd(enteredNumber);

    }

    public static boolean isEvenOdd(int number){
        if (number%2==0){
            System.out.println(number+" is Even number");
            return true;
        }
        System.out.println(number+" is Odd number");
        return false;
    }
}
