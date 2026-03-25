import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import java.util.Scanner;



public class GuessingRandomNumbersTest {

    @Test
    public void testGenerateRandomNumberIsWithinRange() {
        int number = GuessingRandomNumbers.generateRandomNumber();
        assertTrue(number >= 1 && number <= 100);
    }

    @Test
    public void testCheckGuessCorrect() {
        boolean result = GuessingRandomNumbers.checkGuess(50, 50);
        assertTrue(result);
    }

    @Test
    public void testCheckGuessWrong() {
        boolean result = GuessingRandomNumbers.checkGuess(30, 50);
        assertFalse(result);
    }


    @Test
    public void testGetUserGuessValidInput() {
        Scanner scanner = new Scanner("25");
        int result = GuessingRandomNumbers.getUserGuess(scanner);
        assertEquals(25, result);
    }


    @Test
    public void testGetUserGuessInvalidInput() {
        Scanner scanner = new Scanner("abc");
        int result = GuessingRandomNumbers.getUserGuess(scanner);
        assertEquals(-1, result);
    }


    @Test
    public void testGetUserGuessOutOfRangeLow() {
        Scanner scanner = new Scanner("0");
        int result = GuessingRandomNumbers.getUserGuess(scanner);
        assertEquals(-1, result);
    }


    @Test
    public void testGetUserGuessOutOfRangeHigh() {
        Scanner scanner = new Scanner("101");
        int result = GuessingRandomNumbers.getUserGuess(scanner);
        assertEquals(-1, result);
    }


    @Test
    public void testGiveHintRuns() {
        assertDoesNotThrow(() -> GuessingRandomNumbers.giveHint(5));
        assertDoesNotThrow(() -> GuessingRandomNumbers.giveHint(20));
        assertDoesNotThrow(() -> GuessingRandomNumbers.giveHint(40));
        assertDoesNotThrow(() -> GuessingRandomNumbers.giveHint(60));
        assertDoesNotThrow(() -> GuessingRandomNumbers.giveHint(90));
    }

    
    @Test
    public void testDisplayResultsRuns() {
        assertDoesNotThrow(() 
                GuessingRandomNumbers.displayResults(1, 1, 3, 5)
        );
    }
}
