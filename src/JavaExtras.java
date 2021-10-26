import java.util.Scanner;

public class JavaExtras {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to the Aperture Science computer-aided enrichment center.");
        System.out.print("How are you? [Good/Bad] ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("Good")){
            System.out.print("Awesome! Are you super happy? [Yes/No] ");
            String userInput2 = scanner.nextLine();
            if (userInput2.equalsIgnoreCase("Yes")){
                System.out.println("Awesome! Glad you're doing well!");
            } else {
                System.out.println("Sorry to hear that.");
            }
        } else {
            System.out.print("Will cake make you better? [Yes/No] ");
            String userInput3 = scanner.nextLine();
            if (userInput3.equalsIgnoreCase("Yes")){
                System.out.println("The cake is a lie.");
            } else {
                System.out.println("There really was a cake...");
            }
        }
    }
}
