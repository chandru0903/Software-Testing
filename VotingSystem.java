import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Welcome to the voting system. You are eligible to vote.");
        } else {
            int yearsToWait = 18 - age;
            System.out.println("Sorry, you are not eligible to vote yet. You need to wait " 
                               + yearsToWait + " more years.");
        }
    }
}
