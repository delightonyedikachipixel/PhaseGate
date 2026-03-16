import java.util.Scanner;

public class TaskTwelve{

public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

    if (number > 0){
        System.out.println("The number" + " " + number + " " + "is positive");
}

    else{
        System.out.println("The number" + " " + number + " " + "is negative");
}

}
}
