import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskSixTest {

    @Test
    public void testFlatten_regularMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = TaskSix.flatten(matrix);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlatten_emptyMatrix() {
        int[][] matrix = {};
        int[] expected = {};
        int[] actual = TaskSix.flatten(matrix);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlatten_matrixWithEmptyRows() {
        int[][] matrix = {
            {},
            {1, 2},
            {}
        };
        int[] expected = {1, 2};
        int[] actual = TaskSix.flatten(matrix);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlatten_singleElementMatrix() {
        int[][] matrix = {{42}};
        int[] expected = {42};
        int[] actual = TaskSix.flatten(matrix);

        assertArrayEquals(expected, actual);
    }
}
