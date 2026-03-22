import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskSevenTest {

    @Test
    public void testIntersectOf_normalCase() {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        int[] expected = {3, 4};
        int[] actual = TaskSeven.intersectOf(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersectOf_noIntersection() {
        int[] a = {1, 2};
        int[] b = {3, 4};

        int[] expected = {};
        int[] actual = TaskSeven.intersectOf(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersectOf_duplicatesInInput() {
        int[] a = {1, 2, 2, 3};
        int[] b = {2, 2, 3, 3};

        int[] expected = {2, 3};
        int[] actual = TaskSeven.intersectOf(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersectOf_emptyArrays() {
        int[] a = {};
        int[] b = {};

        int[] expected = {};
        int[] actual = TaskSeven.intersectOf(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIntersectOf_oneEmptyArray() {
        int[] a = {1, 2, 3};
        int[] b = {};

        int[] expected = {};
        int[] actual = TaskSeven.intersectOf(a, b);

        assertArrayEquals(expected, actual);
    }
}
