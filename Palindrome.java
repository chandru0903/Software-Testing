import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int n, r, sum = 0, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = in.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
