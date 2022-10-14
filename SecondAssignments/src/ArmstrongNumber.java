//To find Armstrong Number between two given number.
public class ArmstrongNumber {

    public static void main(String[] args) {
        armStrong(371);

    }
    static void armStrong(int num){
        int originalNum = num;
        int result=0;

        while (num>0) {
            int temp = num % 10;
            int cube = temp*temp*temp;
            num = num/10;
            result = result+cube;
        }
        if (originalNum==result){
            System.out.println(originalNum+" is Armstrong");

        }
        else {
            System.out.println(originalNum+" not an Armstrong");

        }

    }
}
