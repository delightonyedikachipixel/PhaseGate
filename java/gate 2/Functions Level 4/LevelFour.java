public class LevelFour {

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int square(int number) {
        return number * number;
    }

    public static double celsiusToFahrenheit(double temperature) {
        return (temperature * 9.0 / 5.0) + 32;
    }

    public static boolean checkThatNumberIsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int largestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int largest = firstNumber;
        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }
        return largest;
    }

    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void multiplicationTable(int number) {
        for (int count = 1; count <= 10; count++) {
            System.out.println(number * count);
        }
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }

}
