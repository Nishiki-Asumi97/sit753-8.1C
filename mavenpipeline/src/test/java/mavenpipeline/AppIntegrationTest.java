package mavenpipeline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest {

	@Test
    public void integrationTestAdd() {
        App app = new App();
        int result = app.add(100, 200);
        assertEquals(300, result, "100 + 200 should equal 300");
    }
	
}
