import org.junit.Test;
import static org.junit.Assert.*;

public class jUnitTest {

    @Test
    public void testIfNameIsKenneth() {
        String expected = "Kenneth";
        String actual = "Kenneth";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
//        assertEquals(5.2, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

}
