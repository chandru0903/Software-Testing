import java.util.Scanner;

public class SaveethaTest {
    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = scanner.nextLine();
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("Reversed word: " + reversedWord);
    }
}
