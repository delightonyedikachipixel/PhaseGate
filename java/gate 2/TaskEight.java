import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int number = -1; 

        while (number != 0) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            total += number;
        }

        System.out.println("Total: " + total);
    }
}
