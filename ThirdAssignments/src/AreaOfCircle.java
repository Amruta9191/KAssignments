import java.util.Scanner;

//Area Of Circle Java Program
public class AreaOfCircle {

    public static void main(String[] args) {
        double pie = 3.14;

        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double areaOfCircle = pie*radius*radius;
        System.out.println(areaOfCircle);


    }

}
