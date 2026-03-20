import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LevelSixTest {


    @Test
    public void splitIntoOddAndEven_1() {
        int[][] result = LevelSix.splitIntoOddAndEven(new int[]{45, 60, 3, 10, 9, 22});
        int[][] expectedResult = new int[][]{{45, 3, 9}, {60, 10, 22}};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void splitIntoOddAndEven_2() {
        int[][] result = LevelSix.splitIntoOddAndEven(new int[]{2, 4, 6});
        int[][] expectedResult = new int[][]{{}, {2, 4, 6}};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void splitIntoOddAndEven_3() {
        int[][] result = LevelSix.splitIntoOddAndEven(new int[]{1, 3, 5});
        int[][] expectedResult = new int[][]{{1, 3, 5}, {}};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void splitIntoOddAndEven_4() {
        int[][] result = LevelSix.splitIntoOddAndEven(new int[]{});
        int[][] expectedResult = new int[][]{{}, {}};
        assertArrayEquals(expectedResult, result);
    }


    @Test
    
    @Test
    public void isArrayPalindrome_2() {
        boolean result = LevelSix.isArrayPalindrome(new int[]{1, 2, 3});
        assertFalse(result);
    }

    @Test
    public void isArrayPalindrome_3() {
        boolean result = LevelSix.isArrayPalindrome(new int[]{1, 2, 1});
        assertTrue(result);
    }

    @Test
    public void isArrayPalindrome_4() {
        boolean result = LevelSix.isArrayPalindrome(new int[]{7});
        assertTrue(result);
    }


    @Test
    public void getPerfectSquareNumbers_1() {
        int[] result = LevelSix.getPerfectSquareNumbers(new int[]{4, 7, 9, 10, 16, 18});
        int[] expectedResult = new int[]{4, 9, 16};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getPerfectSquareNumbers_2() {
        int[] result = LevelSix.getPerfectSquareNumbers(new int[]{7, 10, 18});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getPerfectSquareNumbers_3() {
        int[] result = LevelSix.getPerfectSquareNumbers(new int[]{1, 4, 9, 16});
        int[] expectedResult = new int[]{1, 4, 9, 16};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getPerfectSquareNumbers_4() {
        int[] result = LevelSix.getPerfectSquareNumbers(new int[]{-4, 9, -16, 25});
        int[] expectedResult = new int[]{9, 25};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void getPerfectSquareNumbers_5() {
        int[] result = LevelSix.getPerfectSquareNumbers(new int[]{});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }


    @Test
    public void replaceNonPerfectSquares_1() {
        int[] result = LevelSix.replaceNonPerfectSquares(new int[]{4, 7, 9, 10, 49, 6});
        int[] expectedResult = new int[]{4, -1, 9, -1, 49, -1};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void replaceNonPerfectSquares_2() {
        int[] result = LevelSix.replaceNonPerfectSquares(new int[]{1, 4, 9, 25});
        int[] expectedResult = new int[]{1, 4, 9, 25};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void replaceNonPerfectSquares_3() {
        int[] result = LevelSix.replaceNonPerfectSquares(new int[]{2, 3, 5, 6});
        int[] expectedResult = new int[]{-1, -1, -1, -1};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void replaceNonPerfectSquares_4() {
        int[] result = LevelSix.replaceNonPerfectSquares(new int[]{-4, 9, -1, 16});
        int[] expectedResult = new int[]{-1, 9, -1, 16};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void replaceNonPerfectSquares_5() {
        int[] result = LevelSix.replaceNonPerfectSquares(new int[]{});
        int[] expectedResult = new int[]{};
        assertArrayEquals(expectedResult, result);
    }
}
