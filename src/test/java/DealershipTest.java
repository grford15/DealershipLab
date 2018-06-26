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
}
