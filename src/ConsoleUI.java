public final class ConsoleUI {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BOLD = "\u001B[1m";

    private ConsoleUI() {
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void showLogo() {
        System.out.println(CYAN + BOLD);
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║                                                  ║");
        System.out.println("║          P A T T E R N   S T U D I O             ║");
        System.out.println("║                     P R O                        ║");
        System.out.println("║                                                  ║");
        System.out.println("║           Numbers • Stars • Logic                ║");
        System.out.println("║                                                  ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println(RESET);
    }

    public static void printHeading(String heading) {
        System.out.println(CYAN + BOLD);
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.printf("║ %-48s ║%n", heading);
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println(RESET);
    }

    public static void printSuccess(String message) {
        System.out.println(GREEN + BOLD + message + RESET);
    }

    public static void printError(String message) {
        System.out.println(RED + BOLD + message + RESET);
    }

    public static void printInfo(String message) {
        System.out.println(CYAN + message + RESET);
    }

    public static void printWarning(String message) {
        System.out.println(YELLOW + message + RESET);
    }
}