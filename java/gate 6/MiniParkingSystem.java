import java.util.Scanner;

public class MiniParkingSystem {

    private int totalSpaces;
    private int occupiedSpaces;

    
    public void initialize(int space) {
        totalSpaces = space;
        occupiedSpaces = 0;
    }

    public boolean parkCar(int cars) {
        if (occupiedSpaces + cars <= totalSpaces) {
            occupiedSpaces += cars;
            return true;
        }
        return false;
    }

    public boolean removeCar(int cars) {
        if (occupiedSpaces >= cars) {
            occupiedSpaces -= cars;
            return true;
        }
        return false;
    }

    
    public int checkAvailability(int parked, int leaving, int newCars) {
        return totalSpaces - parked + leaving - newCars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your car number: ");
        int carNumber = scanner.nextInt();

        System.out.print("Enter your preferred parking space between 1 and 20: ");
        int parkingSpace = scanner.nextInt();

        int totalSpaces = 20;

        if (parkingSpace < 1 || parkingSpace > totalSpaces) {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("\n" + name + "!");

        ParkingLot lot = new ParkingLot();
        lot.initialize(totalSpaces); 

        boolean result = lot.parkCar(1);

        if (!result) {
            System.out.println("Parking failed");
        } else {
            System.out.println("Car parked successfully in space " + parkingSpace);
        }

       
    }
}
