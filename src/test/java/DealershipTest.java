import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;

    @Before
    public void setUp() throws Exception {
        dealership = new Dealership();
        car = new Car(10000, "Black", 45, Condition.BAD);
    }

    @Test
    public void canRepair(){
        dealership.repairVehicle(car);
        assertEquals(Condition.GOOD, car.getCondition());
    }

    @Test
    public void hasNoVehicles() {
        assertEquals(0, dealership.getVehicleCount());
    }

    @Test
    public void canAddVehicle() {
        dealership.addVehicle(car);
        assertEquals(1, dealership.getVehicleCount());
    }
}
