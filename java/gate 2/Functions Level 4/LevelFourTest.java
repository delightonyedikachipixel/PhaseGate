import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LevelFourTest {

    @Test
    public void testAddTwoNumbers() {
        int expected = 8;
        int actual = LevelFour.add(3, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEvenNumber() {
        assertTrue(LevelFour.isEven(4));
        assertFalse(LevelFour.isEven(5));

    @Test
    public void testSquareNumber() {
        int expected = 16;
        int actual = LevelFour.square(4);
        assertEquals(expected, actual);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        double expected = 98.6;
        double actual = LevelFour.celsiusToFahrenheit(37);
        assertEquals(expected, actual);


    @Test
    public void testCheckThatNumberIsPrime() {
        boolean expectedPrime = true;
        boolean actualPrime = LevelFour.checkThatNumberIsPrime(7);
        assertEquals(expectedPrime, actualPrime);

        boolean expectedNonPrime = false;
        boolean actualNonPrime = LevelFour.checkThatNumberIsPrime(10);
        assertEquals(expectedNonPrime, actualNonPrime);
    }

    @Test
    public void testLargestOfThreeNumbers() {
        int expected = 9;
        int actual = LevelFour.largestOfThreeNumbers(3, 9, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testSimpleInterest() {
        double expected = 200.0;
        double actual = LevelFour.simpleInterest(1000, 10, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testAreaOfRectangle() {
        double expected = 50.0;
        double actual = LevelFour.areaOfRectangle(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseNumber() {
        int expected = 54321;
        int actual = LevelFour.reverseNumber(12345);
        assertEquals(expected, actual);
    }

}
