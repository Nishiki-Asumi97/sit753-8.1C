package mavenpipeline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
	@Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3), "2 + 3 should be 5");
    }

//    @Test
//    public void testIsPositiveWithPositiveNumber() {
//        App app = new App();
//        assertTrue(app.isPositive(10), "10 should be positive");
//    }
//
//    @Test
//    public void testIsPositiveWithZero() {
//        App app = new App();
//        assertFalse(app.isPositive(0), "0 is not positive");
//    }
//
//    @Test
//    public void testIsPositiveWithNegativeNumber() {
//        App app = new App();
//        assertFalse(app.isPositive(-5), "-5 is not positive");
//    }
}
