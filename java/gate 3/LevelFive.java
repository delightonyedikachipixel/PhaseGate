public class LevelFive {

    
    public  getNewArray(int[] numbers, int length) {

        
        if (length < 0) {
            return 0;
        }

        
        if (numbers.length == 0) {
            return new int[]{-1, -1, -1, -1};
        }

        
        if (numbers.length < length) {
            int[] result = new int[length];

            for (int count = 0; count < numbers.length; count++) {
                result[count] = numbers[count];
            }

            for (int count = numbers.length; count < length; count++) {
                result[count] = -1;
            }

            return result;
        }

        
        if (numbers.length > length) {
            int[] result = new int[length];

            for (int count = 0; count < length; count++) {
                result[count] = numbers[count];
            }

            return result;
        }

        
        return numbers;
    }
}
