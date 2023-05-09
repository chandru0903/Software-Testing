import java.util.Scanner;

public class DecimalToBinaryAndOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = sc.nextInt();

        // convert to binary
        int binary = decimalToBinary(num);
        System.out.println("Binary equivalent: " + binary);

        // convert to octal
        int octal = decimalToOctal(num);
        System.out.println("Octal equivalent: " + octal);
    }

    public static int decimalToBinary(int n) {
        int binary = 0;
        int digit, i = 1;
        while (n != 0) {
            digit = n % 2;
            binary += digit * i;
            i *= 10;
            n /= 2;
        }
        return binary;
    }

    public static int decimalToOctal(int n) {
        int octal = 0;
        int digit, i = 1;
        while (n != 0) {
            digit = n % 8;
            octal += digit * i;
            i *= 10;
            n /= 8;
        }
        return octal;
    }
}
