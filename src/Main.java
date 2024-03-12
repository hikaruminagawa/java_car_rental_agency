import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the make of the car:");
        String make = scanner.nextLine();

        System.out.println("Enter the model of the car:");
        String model = scanner.nextLine();

        System.out.println("Enter the year of manufacture of the car:");
        int yearOfManufacture = scanner.nextInt();
        scanner.nextLine();  // consume newline left-over

        System.out.println("Enter the number of doors of the car:");
        int numberOfDoors = scanner.nextInt();
        scanner.nextLine();  // consume newline left-over

        System.out.println("Enter the fuel type of the car:");
        String fuelType = scanner.nextLine();

        Car car = new Car(make, model, yearOfManufacture, numberOfDoors, fuelType);

        System.out.println("Car Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year of Manufacture: " + car.getYearOfManufacture());
        System.out.println("Number of Doors: " + car.getNumberOfDoors());
        System.out.println("Fuel Type: " + car.getFuelType());

        // Repeat the process for Motorcycle and Truck
    }
}