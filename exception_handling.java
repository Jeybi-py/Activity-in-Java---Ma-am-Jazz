import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class exceptionhandling {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a day of the week: ");
    String input = scanner.nextLine().toUpperCase();
        try {
        Day day = Day.valueOf(input);
            System.out.println("Today is " + day);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered: " + input);
        }
    scanner.close();
    }
}
