import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Farheen", 28, 20000);
        car = new Car(10000, "Black", 10, Condition.GOOD);
    }

    @Test
    public void canBuyCar(){
        assertEquals("You have bought this vehicle", customer.buyVehicle(car));
    }
}
