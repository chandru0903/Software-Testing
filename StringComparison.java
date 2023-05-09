import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        str2 = scanner.nextLine();

        int length = str1.length();

        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    System.out.println("Strings are not equal");
                    return;
                }
            }
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
