import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskOneTest {

    @Test
    public void testToCountEvens() {
        int[] input = {20,11,31,65,2,4};
            
        int expected = 3; 
        int actual = TaskOne.countEvens(input);

        assertEquals(expected, actual);
    }



    
    @Test
    public void testToCountEvens2() {
        int[] input = {};
            
        int expected = 0; 
        int actual = TaskOne.countEvens(input);

        assertEquals(expected, actual);
    }



    }
