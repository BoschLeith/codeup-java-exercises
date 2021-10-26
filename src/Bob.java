import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean confirmation;

        do {
            System.out.print("Ask Bob something: ");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.print("Do you want to keep talking to Bob? [Y/N] ");
            String userConfirmation = scanner.next();
            confirmation = userConfirmation.equalsIgnoreCase("Y");
            scanner.nextLine();
        } while (confirmation);
    }
}
