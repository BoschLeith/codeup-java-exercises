import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args){
//        userInput();
//        userInt();
        userFactorial();
//        numSides();
    }

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("add(num1,num2) = " + add(num1, num2));
        System.out.println("sub(num1, num2) = " + sub(num1, num2));
        System.out.println("multi(num1, num2) = " + multi(num1, num2));
        System.out.println("divide(num1, num2) = " + divide(num1, num2));
        System.out.println("remainder(num1, num2) = " + remainder(num1, num2));
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int multi(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static int remainder(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1 % num2;
        }
    }

    public static int userInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        return getInteger(userInput, 1, 10);
    }

    public static int getInteger(int userInput, int min, int max){
        if (userInput >= min && userInput <= max){
            return userInput;
        }
        return userInt();
    }

    public static void userFactorial(){

        Scanner scanner = new Scanner(System.in);

        boolean confirmation;
        boolean continuation = true;

        do {
            int userInput = userInt();
            System.out.println("Your number is = " + userInput);
            System.out.printf("The factorial for %d is %d\n", userInput, factorial(userInput));

            System.out.print("Do you want to see the factorial table? [Y/N] ");
            String userConfirmation = scanner.next();
            confirmation = userConfirmation.equalsIgnoreCase("Y");
            scanner.nextLine();

            if (confirmation){
                System.out.printf("The factorial table for %d is:\n", userInput);
                factorialTable(userInput);
                continuation = false;
            }

        } while (continuation);

    }

    public static void factorialTable(int userInt){
        long fact = 1;
        for(int i = 1; i <= userInt; i++){
            fact = fact * i;
            System.out.printf("%d! = %d\n", i, fact);
        }
    }

    public static long factorial(int userInt){
        long fact = 1;
        for(int i = 1; i <= userInt; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void numSides(){
        Scanner scanner = new Scanner(System.in);

        boolean confirmation;

        do {
            System.out.print("Enter the number of sides for a pair of dice: ");
            int userSides = scanner.nextInt();
            diceRoll(userSides);

            System.out.print("Do you want to roll again? [Y/N] ");
            String userConfirmation = scanner.next();
            confirmation = userConfirmation.equalsIgnoreCase("Y");
            scanner.nextLine();
        } while (confirmation);

    }

    public static void diceRoll(int userSides){
        int min = 1;
        int range = userSides - min + 1;

        for (int i = 0; i < 2; i++) {
            int rand = (int)(Math.random() * range) + min;
            System.out.println(rand);
        }
    }

}
