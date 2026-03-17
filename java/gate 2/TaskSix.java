import java.util.Scanner;

public class TaskSix{

public static void main (String[] args){

Scanner input = new Scanner(System.in);


    System.out.print("Enter a number:");
    int number = input.nextInt();

    
    
    int sum = 0;

    for (int count = 1; count <= number; count ++){
        sum += count;
}

    System.out.println(sum);
}
}
