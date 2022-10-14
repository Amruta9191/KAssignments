import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome {


    public static void main(String[] args) {
        palindromeNumber(649);
    }

    static void palindromeString() {
        String name = "level";
        char[] a = name.toCharArray();
        int start = 0;
        int end = name.length();
        boolean isPalindrome = false;
        while (start < end) {
            if (a[start] == a[end - start - 1]) {
                isPalindrome = true;
                start++;

            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(name + " is  Palindrome");

        } else {
            System.out.println(name + " is not Palindrome");
        }
    }

    static void palindromeNumber(int num) {
        int sum = 0;
        int originalNum = num;
        while (num > 0) {
            int remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        if (originalNum == sum) {
            System.out.println(originalNum + " is  Palindrome");
        } else {
            System.out.println(originalNum + " is not Palindrome");
        }

    }
}

