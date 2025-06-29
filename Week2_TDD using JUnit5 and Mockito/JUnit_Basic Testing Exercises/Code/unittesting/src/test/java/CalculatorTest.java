import com.example.Calculator;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator(); // Setup
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down...");
        calculator = null; // Teardown
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 3, b = 4;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void testDivideByZero() {
        int result = calculator.divide(10, 0);
        assertEquals(0, result); // handled gracefully
    }
}
