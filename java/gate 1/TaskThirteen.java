import java.util.Scanner;

public class TaskThirteen{

public static void main (String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a score:");
double score = input.nextDouble();

    if (score >= 50){
        System.out.println("pass");
}

    else{
        System.out.println("fail");
}

}
}
