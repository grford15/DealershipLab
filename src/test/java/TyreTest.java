import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        tyre = new Tyre(10, "Sport");
    }

    @Test
    public void hasTread() {
        assertEquals(10, tyre.getTread());
    }

    @Test
    public void hasTyre() {
        assertEquals("Sport", tyre.getType());
    }
}
