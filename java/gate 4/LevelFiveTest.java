import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LevelFiveTest {


    @Test
    public void getSortedPrimeNumbers_1() {
        int[] result = LevelFive.getSortedPrimeNumbers(new int[]{5, 9, 3, 6, 2});
        int[] expectedResult = new int[]{2, 3, 5};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getSortedPrimeNumbers_2() {
        int[] result = LevelFive.getSortedPrimeNumbers(new int[]{4, 6, 8, 9});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getSortedPrimeNumbers_3() {
        int[] result = LevelFive.getSortedPrimeNumbers(new int[]{2, 3, 5, 7});
        int[] expectedResult = new int[]{2, 3, 5, 7};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getSortedPrimeNumbers_4() {
        int[] result = LevelFive.getSortedPrimeNumbers(new int[]{});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }


    @Test
    public void replaceNegativesWithZero_1() {
        int[] result = LevelFive.replaceNegativesWithZero(new int[]{5, -9, 3, -6, 2, -11});
        int[] expectedResult = new int[]{5, 0, 3, 0, 2, 0};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void replaceNegativesWithZero_2() {
        int[] result = LevelFive.replaceNegativesWithZero(new int[]{-1, -2, -3});
        int[] expectedResult = new int[]{0, 0, 0};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void replaceNegativesWithZero_3() {
        int[] result = LevelFive.replaceNegativesWithZero(new int[]{1, 2, 3});
        int[] expectedResult = new int[]{1, 2, 3};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void replaceNegativesWithZero_4() {
        int[] result = LevelFive.replaceNegativesWithZero(new int[]{});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }


    @Test
    public void moveZerosToEnd_1() {
        int[] result = LevelFive.moveZerosToEnd(new int[]{5, 0, 3, 0, 2, 0});
        int[] expectedResult = new int[]{5, 3, 2, 0, 0, 0};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void moveZerosToEnd_2() {
        int[] result = LevelFive.moveZerosToEnd(new int[]{0, 0, 0});
        int[] expectedResult = new int[]{0, 0, 0};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void moveZerosToEnd_3() {
        int[] result = LevelFive.moveZerosToEnd(new int[]{1, 2, 3});
        int[] expectedResult = new int[]{1, 2, 3};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void moveZerosToEnd_4() {
        int[] result = LevelFive.moveZerosToEnd(new int[]{});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }


    @Test
    public void getDuplicateElements_1() {
        int[] result = LevelFive.getDuplicateElements(new int[]{45, 60, 3, 0, 67, 2, 45, 3, 22, 0});
        int[] expectedResult = new int[]{45, 3, 0};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getDuplicateElements_2() {
        int[] result = LevelFive.getDuplicateElements(new int[]{1, 2, 3, 4});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getDuplicateElements_3() {
        int[] result = LevelFive.getDuplicateElements(new int[]{5, 5, 5});
        int[] expectedResult = new int[]{5};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getDuplicateElements_4() {
        int[] result = LevelFive.getDuplicateElements(new int[]{});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }
}
