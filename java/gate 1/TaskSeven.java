import java.util.Scanner;

public class TaskSeven{

public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter Your radius:");
double radius = input.nextDouble();

double circumference = 3.142 * radius * radius; 

System.out.println("The circumference is = " + circumference);

}

}



