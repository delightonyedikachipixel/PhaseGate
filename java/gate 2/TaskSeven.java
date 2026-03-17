import java.util.Scanner;

public class TaskSeven{

public static void main (String[] args){

Scanner input = new Scanner(System.in);



  

        System.out.print("Enter the first number:");
        double number1 = input.nextDouble();

         System.out.print("Enter the second number:");
        double number2 = input.nextDouble();

         System.out.print("Enter the third number:");
        double number3 = input.nextDouble();

         System.out.print("Enter the fourth number:");
        double number4 = input.nextDouble();
        
         System.out.print("Enter the fifth number:");
        double number5 = input.nextDouble();




    double total = number1 + number2 +number3 + number4 + number5;
    System.out.print(total);

}

}
