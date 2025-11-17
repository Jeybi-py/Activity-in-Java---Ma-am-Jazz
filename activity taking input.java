import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "12345";
        String enteredPassword;
        int attempts = 0;
        int maxAttempts = 3;

        do {
            System.out.print("Enter your password: ");
            enteredPassword = sc.nextLine();
            attempts++;

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect! Attempts left: " + (maxAttempts - attempts));
            }

            if (attempts == maxAttempts && !enteredPassword.equals(correctPassword)) {
                System.out.println("Too many failed attempts. Access denied!");
                return; // terminate program
            }

        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access granted!");
    }
}
