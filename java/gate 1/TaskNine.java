import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a price:");
        double price = input.nextDouble();

        double tax = price * 0.10;

        double VAT = price + tax;

        System.out.println("The VAT of the number is = " + VAT);
    }
}
