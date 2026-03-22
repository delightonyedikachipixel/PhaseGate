import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFiveTest {

    @Test
    public void testRemoveDuplicates_normalCase() {
        int[] a = {1, 2, 3,3,4, 4};
      
        int[] expected = {1, 2, 3,4};
        int[] actual = TaskFive.removeDuplicates(a);

        assertArrayEquals(expected, actual);
    }
     @Test
    public void testRemoveDuplicates_noDuplicate() {
        int[] a = {1, 2, 3, 4};
       
        int[] expected = {1, 2, 3, 4};
        int[] actual = TaskFive.removeDuplicates(a);

        assertArrayEquals(expected, actual);
    }

     @Test
    public void testRemoveDuplicates_emptyArray() {
        int[] a = {};
       
        int[] expected = {};
        int[] actual = TaskFive.removeDuplicates(a);

        assertArrayEquals(expected, actual);
    }

     @Test
    public void testRemoveDuplicates_arrayContainingZero() {
        int[] a = {1, 2, 3, 2, 0, 3, 4, 0, 4};
       
        int[] expected = {1, 2, 3, 0, 4};
        int[] actual = TaskFive.removeDuplicates(a);

        assertArrayEquals(expected, actual);
    }
}
