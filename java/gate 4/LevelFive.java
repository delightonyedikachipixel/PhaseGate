public class LevelFive {

    public static int[] getSortedPrimeNumbers(int[] numbers) {
        int primeCount = 0;
        for (int number : numbers) {
            if (number > 1) {
                boolean isPrime = true;
                for (int divisor = 2; divisor < number; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    primeCount++;
                }
            }
        }
        int[] primeNumbers = new int[primeCount];
        int primeIndex = 0;
        for (int number : numbers) {
            if (number > 1) {
                boolean isPrime = true;
                for (int divisor = 2; divisor < number; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    primeNumbers[primeIndex++] = number;
                }
            }
        }
        for (int outerIndex = 0; outerIndex < primeNumbers.length; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < primeNumbers.length; innerIndex++) {
                if (primeNumbers[outerIndex] > primeNumbers[innerIndex]) {
                    int temp = primeNumbers[outerIndex];
                    primeNumbers[outerIndex] = primeNumbers[innerIndex];
                    primeNumbers[innerIndex] = temp;
                }
            }
        }
        return primeNumbers;
    }

    public static int[] replaceNegativesWithZero(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] < 0) {
                result[index] = 0;
            } else {
                result[index] = numbers[index];
            }
        }
        return result;
    }

    public static int[] moveZerosToEnd(int[] numbers) {
        int zeroCount = 0;
        int nonZeroIndex = 0;
        for (int number : numbers) {
            if (number == 0) {
                zeroCount++;
            }
        }
        int[] result = new int[numbers.length];
        for (int number : numbers) {
            if (number != 0) {
                result[nonZeroIndex++] = number;
            }
        }
        for (int index = numbers.length - zeroCount; index < numbers.length; index++) {
            result[index] = 0;
        }
        return result;
    }

    public static int[] getDuplicateElements(int[] numbers) {
        int duplicateCount = 0;
        for (int outerIndex = 0; outerIndex < numbers.length; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < numbers.length; innerIndex++) {
                if (numbers[outerIndex] == numbers[innerIndex]) {
                    boolean alreadyAdded = false;
                    for (int checkIndex = 0; checkIndex < duplicateCount; checkIndex++) {
                        if (numbers[outerIndex] == numbers[checkIndex]) {
                            alreadyAdded = true;
                        }
                    }
                    if (!alreadyAdded) {
                        duplicateCount++;
                    }
                    break;
                }
            }
        }
        int[] duplicates = new int[duplicateCount];
        int duplicateIndex = 0;
        for (int outerIndex = 0; outerIndex < numbers.length; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < numbers.length; innerIndex++) {
                if (numbers[outerIndex] == numbers[innerIndex]) {
                    boolean alreadyAdded = false;
                    for (int checkIndex = 0; checkIndex < duplicateIndex; checkIndex++) {
                        if (duplicates[checkIndex] == numbers[outerIndex]) {
                            alreadyAdded = true;
                        }
                    }
                    if (!alreadyAdded) {
                        duplicates[duplicateIndex++] = numbers[outerIndex];
                    }
                    break;
                }
            }
        }
        return duplicates;
    }
}
