import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFourTest {

    @Test
    public void testArrayEquals_sameArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean expected = true;
        boolean actual = TaskFour.arrayEquals(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void testArrayEquals_differentValues() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};

        boolean expected = false;
        boolean actual = TaskFour.arrayEquals(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void testArrayEquals_differentLengths() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};

        boolean expected = false;
        boolean actual = TaskFour.arrayEquals(arr1, arr2);

        assertEquals(expected, actual);
    }

    @Test
    public void testArrayEquals_emptyArrays() {
        int[] arr1 = {};
        int[] arr2 = {};

        boolean expected = true;
        boolean actual = TaskFour.arrayEquals(arr1, arr2);

        assertEquals(expected, actual);
    }
}
