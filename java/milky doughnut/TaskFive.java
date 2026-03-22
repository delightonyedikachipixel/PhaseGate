import java.util.Arrays;
public class TaskFive{

    public static boolean isPresent(int [] numbers, int number){
        for (int value : numbers){
            if (value == number){
                return true;
            }
        }
        return false;
    }

    public static int [] removeDuplicates(int [] numbers){
        int count = 0;
        int zeroCount = 0;
        int[] temp = new int[numbers.length];

        for (int index = 0; index < numbers.length; index++){
            if (isPresent(temp, numbers[index]) == false){
                temp[count] = numbers[index];
                count++;
            }
            if (numbers[index] == 0 && zeroCount == 0){
                temp[count] = numbers[index];
                count++;
                zeroCount++;
            }
        }

        int [] finalNumber = new int [count];
        for (int index = 0; index < count; index++){
            finalNumber[index] = temp[index];
        }

        return finalNumber;       

    }

//    public static void main (String [] args){
//        int [] b = {1, 2, 3,3,4, 4};
//        System.out.println(Arrays.toString(removeDuplicates(b)));
//
//    }

  
}


