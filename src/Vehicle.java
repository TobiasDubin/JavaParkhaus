/*
import java.util.*;


// Klasse für ein Fahrzeug
class Vehicle {
    private String id;

    public Vehicle(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

// Klasse für einen Parkplatz
class ParkingSpot {
    private Vehicle vehicle;

    public boolean isOccupied() {
        return vehicle != null;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

// Klasse für das Parkhaus
class ParkingGarage {
    private int numFloors;
    private int spotsPerFloor;
    private List<List<ParkingSpot>> spots;

    public ParkingGarage(int numFloors, int spotsPerFloor) {
        this.numFloors = numFloors;
        this.spotsPerFloor = spotsPerFloor;
        this.spots = new ArrayList<>();

        for (int i = 0; i < numFloors; i++) {
            List<ParkingSpot> floorSpots = new ArrayList<>();
            for (int j = 0; j < spotsPerFloor; j++) {
                floorSpots.add(new ParkingSpot());
            }
            this.spots.add(floorSpots);
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (int i = 0; i < numFloors; i++) {
            List<ParkingSpot> floorSpots = spots.get(i);
            for (int j = 0; j < spotsPerFloor; j++) {
                ParkingSpot spot = floorSpots.get(j);
                if (!spot.isOccupied()) {
                    spot.parkVehicle(vehicle);
                    System.out.println("Vehicle " + vehicle.getId() + " parked on floor " + (i + 1) + ", spot " + (j + 1));
                    return true;
                }
            }
        }
        System.out.println("No available parking spots for vehicle " + vehicle.getId());
        return false;
    }

    public void removeVehicle(Vehicle vehicle) {
        for (int i = 0; i < numFloors; i++) {
            List<ParkingSpot> floorSpots = spots.get(i);
            for (int j = 0; j < spotsPerFloor; j++) {
                ParkingSpot spot = floorSpots.get(j);
                if (spot.isOccupied() && spot.getVehicle().getId().equals(vehicle.getId())) {
                    spot.removeVehicle();
                    System.out.println("Vehicle " + vehicle.getId() + " removed from floor " + (i + 1) + ", spot " + (j + 1));
                    return;
                }
            }
        }
        System.out.println("Vehicle " + vehicle.getId() + " not found in the garage.");
    }

    public int getFreeSpotsCount() {
        int count = 0;
        for (int i = 0; i < numFloors; i++) {
            List<ParkingSpot> floorSpots = spots.get(i);
            for (int j = 0; j < spotsPerFloor; j++) {
                ParkingSpot spot = floorSpots.get(j);
                if (!spot.isOccupied()) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class Main2 {
    public static void main(String[] args) {
        ParkingGarage garage = new ParkingGarage(3, 5); // Beispiel: 3 Etagen, je 5 Parkplätze pro Etage

        Vehicle car1 = new Vehicle("ABC123");
        Vehicle car2 = new Vehicle("XYZ789");
        Vehicle motorcycle = new Vehicle("DEF456");

        garage.parkVehicle(car1);
        garage.parkVehicle(car2);
        garage.parkVehicle(motorcycle);

        garage.removeVehicle(car1);
        garage.removeVehicle(car2);

        System.out.println("Free spots: " + garage.getFreeSpotsCount());
    }
}

*/