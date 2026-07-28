public class PatternGenerator {

    public void increasingNumberTriangle(int rows) {
        ConsoleUI.printHeading("INCREASING NUMBER TRIANGLE");

        for (int row = 1; row <= rows; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void repeatedNumberTriangle(int rows) {
        ConsoleUI.printHeading("REPEATED NUMBER TRIANGLE");

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public void floydTriangle(int rows) {
        ConsoleUI.printHeading("FLOYD'S TRIANGLE");

        int number = 1;

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.printf("%-4d", number);
                number++;
            }
            System.out.println();
        }
    }

    public void numberPyramid(int rows) {
        ConsoleUI.printHeading("NUMBER PALINDROME PYRAMID");

        for (int row = 1; row <= rows; row++) {

            for (int space = 1; space <= rows - row; space++) {
                System.out.print("  ");
            }

            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }

            for (int number = row - 1; number >= 1; number--) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }

    public void invertedNumberTriangle(int rows) {
        ConsoleUI.printHeading("INVERTED NUMBER TRIANGLE");

        for (int row = rows; row >= 1; row--) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void binaryTriangle(int rows) {
        ConsoleUI.printHeading("BINARY TRIANGLE");

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= row; column++) {

                int value = (row + column) % 2 == 0 ? 1 : 0;

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }

    public void pascalTriangle(int rows) {
        ConsoleUI.printHeading("PASCAL'S TRIANGLE");

        for (int row = 0; row < rows; row++) {

            for (int space = 0; space < rows - row - 1; space++) {
                System.out.print("  ");
            }

            long value = 1;

            for (int column = 0; column <= row; column++) {
                System.out.printf("%-4d", value);
                value = value * (row - column) / (column + 1);
            }

            System.out.println();
        }
    }

    public void starPyramid(int rows) {
        ConsoleUI.printHeading("STAR PYRAMID");

        for (int row = 1; row <= rows; row++) {

            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void diamondPattern(int rows) {
        ConsoleUI.printHeading("DIAMOND PATTERN");

        for (int row = 1; row <= rows; row++) {

            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int row = rows - 1; row >= 1; row--) {

            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void hollowSquare(int size) {
        ConsoleUI.printHeading("HOLLOW SQUARE");

        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= size; column++) {

                boolean border =
                        row == 1
                                || row == size
                                || column == 1
                                || column == size;

                if (border) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public void multiplicationTable(int size) {
        ConsoleUI.printHeading("MULTIPLICATION TABLE");

        System.out.printf("%6s", "");

        for (int column = 1; column <= size; column++) {
            System.out.printf("%6d", column);
        }

        System.out.println();
        System.out.print("      ");

        for (int column = 1; column <= size; column++) {
            System.out.print("------");
        }

        System.out.println();

        for (int row = 1; row <= size; row++) {

            System.out.printf("%4d |", row);

            for (int column = 1; column <= size; column++) {
                System.out.printf("%6d", row * column);
            }

            System.out.println();
        }
    }
}