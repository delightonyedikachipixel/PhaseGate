public class TaskThree {

    
    public static int[] squares(int n) {
        if(n<=0){
            return new int [] {-1};

        }

        int[] result = new int[n];
        for (int count = 1; count <= n; count++) {
            result[count-1] = (count ) * (count );
        }
        return result;
    }
}
