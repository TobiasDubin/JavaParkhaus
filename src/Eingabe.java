import java.util.Scanner;
/*
Universeller Scanner
*/
public class Eingabe {
    private static final Scanner scanner = new Scanner(System.in);

    // Methoden zum Lesen von verschiedenen Datentypen
    public static int nextInt() {
        return scanner.nextInt();
    }

    public static double nextDouble() {
        return scanner.nextDouble();
    }

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    // Methoden zum Schließen des Scanners
    public static void close() {
        scanner.close();
    }
}