package PSL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAdd() {
        App app = new App();
        assertEquals(10, app.add(7, 3), "7 + 3 debería ser 10");
    }

    @Test
    void testSubtract() {
        App app = new App();
        assertEquals(4, app.subtract(10, 6), "10 - 6 debería ser 4");
    }
}