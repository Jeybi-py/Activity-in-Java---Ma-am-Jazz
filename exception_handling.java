import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a word: ");
            String text = input.nextLine();

            if (text.isEmpty()) {
                throw new Exception("Input cannot be empty.");
            }

            System.out.println("You entered: " + text);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
