import java.util.Scanner;

public class DecimalToBinaryAndOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary equivalent: " + binary);

        String octal = Integer.toOctalString(num);
        System.out.println("Octal equivalent: " + octal);
    }
}
