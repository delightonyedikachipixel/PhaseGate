import java.util.Scanner;

public class TaskFour{

public static void main (String[] args){

Scanner input = new Scanner(System.in);


    System.out.print("Enter a number:");
    int number = input.nextInt();


    while (number < 0){
        System.out.println("Please enter a positive number");
        number = input.nextInt();
    }
   

        for (int row = 1; row <= 12; row++) {
            for (int column = number; column <= number; column++) {
                System.out.printf("%4d",  row * column);
}
System.out.println();
}

}
}
