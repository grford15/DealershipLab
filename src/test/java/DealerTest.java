import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setUp() throws Exception {
        dealer = new Dealer("Jack", 24, 150000);

    }

    @Test
    public void hasName() {
        assertEquals("Jack", dealer.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(24, dealer.getAge());
    }

    @Test
    public void hasWallet(){
        assertEquals(150000, dealer.getWallet());
    }

}
