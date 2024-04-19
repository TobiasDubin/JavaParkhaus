// Klasse für einen Parkplatz
class Parkplaetze {
    private int nummer;
    private Fahrzeuge fahrzeuge;

    public Parkplaetze(int nummer) {
        this.nummer = nummer;
    }

    public void parkFahrzeuge(Fahrzeuge fahrzeuge) {
        this.fahrzeuge = fahrzeuge;
    }

    public Fahrzeuge getVehicle() {
        return fahrzeuge;
    }
}
