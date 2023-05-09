import java.util.Scanner;

public class NumberReverse {
    public static void main(String args[]) {
        int n, r, reverse = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = in.nextInt();
        while (n != 0) {
            r = n % 10;
            reverse = (reverse * 10) + r;
            n = n / 10;
        }
        System.out.println("Reverse of the given number is: " + reverse);
    }
}
