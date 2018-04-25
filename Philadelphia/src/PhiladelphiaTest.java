import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PhiladelphiaTest{
    @Test
    public void testIsItSunny(){
        assertTrue(Philadelphia.isitSunny());
    }


    @Test
    void isitSunny() {
        assertFalse(Philadelphia.isitSunny());
    }

    @Test
    void notNullTest(){
        assertNotNull(Philadelphia.isitSunny());
    }

    @Test
    void exceptionTest(){
        assertEquals(1, Philadelphia.isitSunny());
    }
}