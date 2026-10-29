import static org.junit.Assert.*;
import org.junit.Test;
public class CodingBatTest {

    @org.junit.Test
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(7, cb.close10(3, 7));
        assertEquals(3, cb.close10(1, 3));
        assertEquals(0, cb.close10(9, 11));
    }
}