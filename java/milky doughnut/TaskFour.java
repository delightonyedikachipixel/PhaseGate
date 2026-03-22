
public class TaskFour {

    public static boolean arrayEquals(int[] a, int[] b) {
        
        if (a.length != b.length) {
            return false;
        }

        
        for (int index = 0; index < a.length; index++) {
            if (a[index] != b[index]) {
                return false;
            }
        }
      return true;
}
}
