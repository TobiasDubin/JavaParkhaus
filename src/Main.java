public class Main {
    public static void main(String[] args) {
        boolean abfrage = true;

        while (abfrage) {
            System.out.println("Hauptmenü:");
            System.out.println("1. Eingetragenes Fahrzeug abfragen");
            System.out.println("2. Etagen hinzufügen");
            System.out.println("3. Parkplätze hinzufügen");
            System.out.println("4. Beenden");

            System.out.print("Bitte wählen Sie eine Option von 1 bis 4: ");
            int auswahl = Eingabe.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.println("Nach welchem Fahrzeug suchen Sie?");
                    //
                    break;
                case 2:
                    System.out.println("Wie viele Etagen sind vorhanden?");
                    //
                    break;
                case 3:
                    System.out.println("Wie viele Parkplätze sind vorhanden?");
                    //
                    break;
                case 4:
                    System.out.println("Das Programm wird beendet.");
                    abfrage = false;
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie eine der angegebenen Optionen.");
            }
        }
        Eingabe.close(); // Den Scanner schließen, wenn das Programm beendet wird
    }
}