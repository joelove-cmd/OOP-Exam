import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        Location pickup = generateRandomLocation();
        Location destination = generateRandomLocation();

        Passenger passenger = new Passenger(pickup, destination);
        return company.schedulePickup(passenger);
    }

    private Location generateRandomLocation() {
        int x = random.nextInt(101);
        int y = random.nextInt(101);
        return new Location(x, y);
    }

    // Main method for testing
    public static void main(String[] args) {
        Company company = new Company();
        PassengerSource source = new PassengerSource(company);

        boolean success = source.requestPickup();
        System.out.println("Pickup scheduled? " + success);
    }
}

// Supporting class: Location
class Location {
    private int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}

// Supporting class: Passenger
class Passenger {
    private Location pickup;
    private Location destination;

    public Passenger(Location pickup, Location destination) {
        this.pickup = pickup;
        this.destination = destination;
    }

    public Location getPickup() { return pickup; }
    public Location getDestination() { return destination; }
}

// Supporting class: Company
class Company {
    // Simulate scheduling logic (e.g. vehicle availability)
    public boolean schedulePickup(Passenger passenger) {
        // 70% chance of success
        return Math.random() > 0.3;
    }
}
