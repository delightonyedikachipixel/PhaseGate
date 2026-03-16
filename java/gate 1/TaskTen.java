import java.util.Scanner;

public class TaskTen{

public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the first number:");
int number1 = input.nextInt();

System.out.println("Enter the second number:");
int number2 = input.nextInt();

System.out.println("Enter the third number:");
int number3 = input.nextInt();


double total = number1 + number2 + number3;

double average = total / 3; 

System.out.println("The average is = " + average);

}

}
