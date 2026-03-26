import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates_normalCase() {
        int[] a = {1, 2, 3,3,4, 4};
      
        int[] expected = {1, 2};
        int[] actual = RemoveDuplicates.removeDuplicates(a);

        assertArrayEquals(expected, actual);
    }


     @Test
    public void testRemoveDuplicates_emptyArray() {
        int[] a = {};
       
        int[] expected = {};
        int[] actual = RemoveDuplicates.removeDuplicates(a);

        assertArrayEquals(expected, actual);
    }

 
}
