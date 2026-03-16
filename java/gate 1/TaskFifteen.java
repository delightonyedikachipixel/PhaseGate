import java.util.Scanner;

public class TaskFifteen{

public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number:");
int number1 = input.nextInt();

System.out.println("Enter a second number:");
int number2 = input.nextInt();

System.out.println("Enter a third number:");
int number3 = input.nextInt();


int largest = number1;

    if (number2 > largest){
        System.out.println(number2 + " " + "=" + " " + "largest");
}

    else if(number3 > largest) {

        System.out.print(number3 + " " + "=" + " " + "largest");
}
    else{
        System.out.print(number1 + " " + "=" + " " + "largest");

}
}
}
