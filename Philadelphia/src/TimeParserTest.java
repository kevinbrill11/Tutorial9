import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Time;


public class TimeParserTest {

    @Test(expected = NumberFormatException.class)
    public void testFirstNegativeOne() {
        TimeParser.parseTimeToSeconds("-1:00");
    }

    @Test(expected = NumberFormatException.class)
    public void testSecondNegativeOne(){
        TimeParser.parseTimeToSeconds("00:-1");
    }
}
