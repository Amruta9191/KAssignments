import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal:-  ");
        int enteredPrincipal = scanner.nextInt();
        System.out.println("Enter time:-  ");
        int enteredTime = scanner.nextInt();
        System.out.println("Enter rate:-  ");
        int enteredRate = scanner.nextInt();
        simpleInterest(enteredPrincipal,enteredTime,enteredRate);


    }
    public static double simpleInterest(int principal,int time, int rate){
         double interest = principal*(1+rate*time);
        System.out.println("The calculated simple interest is "+interest);
        return interest;

    }
}
