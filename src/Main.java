import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final PatternGenerator patternGenerator =
            new PatternGenerator();

    public static void main(String[] args) {

        boolean applicationRunning = true;

        while (applicationRunning) {

            ConsoleUI.clearScreen();
            ConsoleUI.showLogo();
            showMenu();

            int choice = readIntegerInRange(
                    "Choose an option (1-12): ",
                    1,
                    12
            );

            if (choice == 12) {
                applicationRunning = false;
                continue;
            }

            int size = readIntegerInRange(
                    "Enter rows or size (1-15): ",
                    1,
                    15
            );

            ConsoleUI.clearScreen();

            generatePattern(choice, size);

            System.out.println();
            ConsoleUI.printSuccess(
                    "Pattern generated successfully."
            );

            pause();
        }

        showExitScreen();
        scanner.close();
    }

    private static void showMenu() {

        ConsoleUI.printHeading("SELECT A PATTERN");

        System.out.println(ConsoleUI.BLUE + ConsoleUI.BOLD);
        System.out.println("1.  Increasing Number Triangle");
        System.out.println("2.  Repeated Number Triangle");
        System.out.println("3.  Floyd's Triangle");
        System.out.println("4.  Number Palindrome Pyramid");
        System.out.println("5.  Inverted Number Triangle");
        System.out.println("6.  Binary Triangle");
        System.out.println("7.  Pascal's Triangle");
        System.out.println("8.  Star Pyramid");
        System.out.println("9.  Diamond Pattern");
        System.out.println("10. Hollow Square");
        System.out.println("11. Multiplication Table");
        System.out.println("12. Exit");
        System.out.println(ConsoleUI.RESET);
    }

    private static void generatePattern(int choice, int size) {

        switch (choice) {

            case 1 ->
                    patternGenerator.increasingNumberTriangle(size);

            case 2 ->
                    patternGenerator.repeatedNumberTriangle(size);

            case 3 ->
                    patternGenerator.floydTriangle(size);

            case 4 ->
                    patternGenerator.numberPyramid(size);

            case 5 ->
                    patternGenerator.invertedNumberTriangle(size);

            case 6 ->
                    patternGenerator.binaryTriangle(size);

            case 7 ->
                    patternGenerator.pascalTriangle(size);

            case 8 ->
                    patternGenerator.starPyramid(size);

            case 9 ->
                    patternGenerator.diamondPattern(size);

            case 10 ->
                    patternGenerator.hollowSquare(size);

            case 11 ->
                    patternGenerator.multiplicationTable(size);

            default ->
                    ConsoleUI.printError("Invalid pattern selection.");
        }
    }

    private static int readIntegerInRange(
            String message,
            int minimum,
            int maximum
    ) {

        while (true) {

            System.out.print(
                    ConsoleUI.YELLOW
                            + message
                            + ConsoleUI.RESET
            );

            String input = scanner.nextLine().trim();

            try {

                int value = Integer.parseInt(input);

                if (value >= minimum && value <= maximum) {
                    return value;
                }

                ConsoleUI.printError(
                        "Enter a number between "
                                + minimum
                                + " and "
                                + maximum
                                + "."
                );

            } catch (NumberFormatException exception) {

                ConsoleUI.printError(
                        "Invalid input. Enter a whole number."
                );
            }
        }
    }

    private static void pause() {

        System.out.println();

        System.out.print(
                ConsoleUI.PURPLE
                        + "Press Enter to return to the menu..."
                        + ConsoleUI.RESET
        );

        scanner.nextLine();
    }

    private static void showExitScreen() {

        ConsoleUI.clearScreen();
        ConsoleUI.showLogo();

        ConsoleUI.printSuccess(
                "Thank you for using Pattern Studio Pro!"
        );

        ConsoleUI.printInfo(
                "Developed by Samarpit Gupta"
        );

        System.out.println(
                ConsoleUI.PURPLE
                        + ConsoleUI.RESET
        );
    }
}