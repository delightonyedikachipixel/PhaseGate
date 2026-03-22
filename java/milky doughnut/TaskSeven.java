
public class TaskSeven{
public static int[] intersectOf(int[] numbers1, int[] numbers2) {

    int[] temp = new int[numbers1.length];
    int count = 0;

    for (int index = 0; index < numbers1.length; index++) {

        for (int position = 0; position < numbers2.length; position++) {

            if (numbers1[index] == numbers2[position]) {

                boolean alreadyExists = false;

                for (int counter = 0; counter < count; counter++) {
                    if (temp[counter] == numbers1[index]) {
                        alreadyExists = true;
                        break;
                    }
                }

                if (!alreadyExists) {
                    temp[count] = numbers1[index];
                    count++;
                }

                break;
            }
        }
    }

    int[] result = new int[count];

    for (int counter = 0; counter < count; counter++) {
        result[counter] = temp[counter];
    }

    return result;
}

}
