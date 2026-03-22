import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskThreeTest {

    @Test
    public void testSquares_positiveN() {
        int n = 5;
        int[] expected = {1, 4, 9, 16, 25};
        int[] actual = TaskThree.squares(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSquares_nIsOne() {
        int n = 1;
        int[] expected = {1};
        int[] actual = TaskThree.squares(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSquares_nIsZero() {
        int n = 0;
        int[] expected = {-1};
        int[] actual = TaskThree.squares(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSquares4() {
        int n = -3;
        int[] expected = {-1};
        int[] actual = TaskThree.squares(n);
        assertArrayEquals(expected, actual);
    }
}
