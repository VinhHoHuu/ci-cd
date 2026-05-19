

import com.aVinh.Git.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {

        Calculator cal = new Calculator();

        assertEquals(5, cal.add(2, 3));

    }
}