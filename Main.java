import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Test
    public void testDivision() {
        double result = 10 / 2;
        assertEquals(5.0, result, 0.0001);
    }
}
