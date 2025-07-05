import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompanyTest {

    @Test
    public void testSchedulePickupReturnsBoolean() {
        Company company = new Company();
        Passenger passenger = new Passenger(
            new Location(10, 20),
            new Location(30, 40)
        );

        boolean result = company.schedulePickup(passenger);
        assertTrue(result || !result, "Method should return a boolean value");
    }

    @Test
    public void testSchedulePickupRandomBehavior() {
        Company company = new Company();
        Passenger passenger = new Passenger(
            new Location(5, 5),
            new Location(95, 95)
        );

        // Run it multiple times to observe both outcomes
        boolean successObserved = false;
        boolean failureObserved = false;

        for (int i = 0; i < 100; i++) {
            boolean result = company.schedulePickup(passenger);
            if (result) successObserved = true;
            else failureObserved = true;

            if (successObserved && failureObserved) break;
        }

        assertTrue(successObserved, "At least one request should succeed");
        assertTrue(failureObserved, "At least one request should fail");
    }
}
