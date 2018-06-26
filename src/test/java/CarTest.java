import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car(10000, "Black", 45, Condition.GOOD);
    }

    @Test
    public void hasCondition() {
        assertEquals("Good", car.getCondition().getConditionName());
    }

    @Test
    public void canDrive(){
        assertEquals("You are driving to Dunoon", car.driving("Dunoon"));
    }
}
