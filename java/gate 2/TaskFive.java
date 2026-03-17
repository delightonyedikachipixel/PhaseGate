import java.util.Scanner;

public class TaskFive{

public static void main (String[] args){

Scanner input = new Scanner(System.in);


    System.out.print("Enter a number:");
    int number = input.nextInt();


    while (number < 0){
        System.out.println("Please enter a positive number");
        number = input.nextInt();
    }
   
    int factorial = 1;
        
        for(int count = number; count >= 1; count--){
            factorial = factorial * count;



}
    System.out.println(factorial);


}

}
