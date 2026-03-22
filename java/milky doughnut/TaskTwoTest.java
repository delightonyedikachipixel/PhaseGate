import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTwoTest {

    @Test
    public void testLinearSearch() {
        int[] input = {20, 11, 31, 65, 2, 4};
        int target = 65;

        int expected = 3;
        int actual = TaskTwo.linearSearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void testLinearSearch2() {
        int[] input = {20, 11, 31, 65, 2, 4};
        int target = 100;

        int expected = -1;
        int actual = TaskTwo.linearSearch(input, target);

        assertEquals(expected, actual);
    }

    @Test
    public void testLinearSearch3() {
        int[] input = {};
        int target = 10;

        int expected = -1;
        int actual = TaskTwo.linearSearch(input, target);

        assertEquals(expected, actual);
    }
}
