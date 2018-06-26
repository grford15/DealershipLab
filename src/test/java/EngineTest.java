import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() throws Exception {
        engine = new Engine(4, "diesel");

    }

    @Test
    public void hasEngineSize() {
        assertEquals(4, engine.getEngineSize());
    }

    @Test
    public void hasFuelType() {
        assertEquals("diesel", engine.getFuelType());
    }
}
