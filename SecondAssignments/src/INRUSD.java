import java.util.Scanner;

//Input currency in rupees and output in USD.
public class INRUSD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in rupees: ");
        int inr = scanner.nextInt();
        double usd = inr*0.012;
        System.out.println(inr+" is equals to "+usd);
    }
}
