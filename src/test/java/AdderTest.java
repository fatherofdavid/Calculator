import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderTest {
    @Test
    public void adderTest() {
        Adder testAdder = new Adder();
        assertEquals(testAdder.add(1,2),4);
    }
}
