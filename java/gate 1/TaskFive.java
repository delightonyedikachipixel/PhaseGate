import java.util.Scanner;

public class TaskFive{

public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a temperature in celcius:");
double temperature = input.nextDouble();

double farenheit = (temperature * 1.8 )+ 32;

System.out.println("The farenheit temperature is = " + farenheit);
}
}
