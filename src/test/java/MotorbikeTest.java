import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

    Motorbike motorbike;

    @Before
    public void setUp() throws Exception {
        motorbike = new Motorbike(10000, "Black", 5, Condition.GOOD);
    }

    @Test
    public void hasPrice(){
        assertEquals(10000, motorbike.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", motorbike.getColour());
    }

    @Test
    public void hasEngineSize() {
        assertEquals(5, motorbike.getEngine());
    }
}
