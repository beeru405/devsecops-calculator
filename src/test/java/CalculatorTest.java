// CalculatorTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
}
