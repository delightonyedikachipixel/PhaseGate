public class TaskOne{

public static int countEvens(int[] numbers) {
    int count = 0;
    
    for (int number : numbers) {
        if (number % 2 == 0) {
            count++;
        }
    }
    
    return count;
}
}
