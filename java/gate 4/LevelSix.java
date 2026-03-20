public class LevelSix {


    public static int[] [] splitIntoOddAndEven(int[] numbers) {
        int oddCount = 0;
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }

        int[] oddNumbers = new int[oddCount];
        int[] evenNumbers = new int[evenCount];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers[oddIndex++] = number;
            } else {
                evenNumbers[evenIndex++] = number;
            }
        }

        return new int[][]{oddNumbers, evenNumbers};
    }

    

    public static boolean isArrayPalindrome(int[] numbers) {
    int originalNumber = 0;
    int reversedNumber = 0;

    for (int number : numbers) {
        originalNumber = originalNumber * 10 + number;
    }

    int temp = originalNumber;

    while (temp > 0) {
        int digit = temp % 10;
        reversedNumber = reversedNumber * 10 + digit;
        temp = temp / 10;
    }

    return originalNumber == reversedNumber;
}
     
    
    public static int[] getPerfectSquareNumbers(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number >= 0) {
                int squareRoot = (int) Math.sqrt(number);
                if (squareRoot * squareRoot == number) {
                    count++;
                }
            }
        }

        int[] perfectSquares = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (number >= 0) {
                int squareRoot = (int) Math.sqrt(number);
                if (squareRoot * squareRoot == number) {
                    perfectSquares[index++] = number;
                }
            }
        }

        return perfectSquares;
    }

  
    public static int[] replaceNonPerfectSquares(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] >= 0) {
                int squareRoot = (int) Math.sqrt(numbers[index]);
                if (squareRoot * squareRoot == numbers[index]) {
                    result[index] = numbers[index];
                } else {
                    result[index] = -1;
                }
            } else {
                result[index] = -1;
            }
        }

        return result;
    }

   
