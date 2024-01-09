
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String validUserName = "Coded";
        String validPassword = "Coded123";

        // theBONUS: how many attempets left
        int attempets = 4;
        while (attempets > 0) {
            System.out.println("Enter your username here:");
            String usernameInput = scanner.nextLine();
            System.out.println("Enter your password here:");
            String passwordInput = scanner.nextLine();

            try {

                if (!usernameInput.equals(validUserName) || !passwordInput.equals(validPassword)) {
                    throw new Exception("Invalidation user please try again later");

                } else {

                    System.out.println("Login accpeted");
                    break; // to get out and successfully in
                }

            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
                // To count the attempets left:
                attempets--;
                System.out.println("You have a " + attempets + " left");

            }
        }
        scanner.close();
    }
}