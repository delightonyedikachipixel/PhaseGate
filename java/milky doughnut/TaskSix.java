
public class TaskSix{

 public static int[] flatten(int[][] matrix) {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++)
                total++;

        int[] result = new int[total];
        int index = 0;
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++)
                result[index++] = matrix[row][column];

        return result;
    }

}
