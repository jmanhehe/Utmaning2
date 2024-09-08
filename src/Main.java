import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while(true) {
            System.out.println("---Vehicle list---");
            System.out.println("1. Register new vehicle");
            System.out.println("2. Exit the application");
            int choice;
            
            do {
                System.out.printf("Enter value: ");
                choice = scanner.nextInt();
                scanner.nextLine();
            } while (choice != 1 && choice != 2);
            
            switch (choice) {
                case 1:
                    registerVehicle();
                    break;
                case 2:
                    System.out.println("Exiting...");
                default:
                    break;
            }

            if(choice == 2) {
                break; // Here we break the whileloop to exit the program.
            }
        }

        System.out.println("Application terminated.");
    }

    public static void registerVehicle() {
        // Prompt user for product details
        System.out.print("Enter registration number:");
        String registrationNumber = scanner.nextLine();

        System.out.print("Enter brand:");
        String brand = scanner.nextLine();

        System.out.print("Enter model:");
        String model = scanner.nextLine();

        Vehicle vehicle = new Vehicle(registrationNumber, brand, model);

        vehicleList.add(vehicle);

        for(Vehicle car : vehicleList) {
            // Both these prints works, depending on how you build your Vehicle class
            System.out.println("This prints the car");
            System.out.println(car);

            // System.out.println("This uses get methods we declared in our class");
            // System.out.println(car.getRegistrationNumber() + " - " + car.getBrand() + ", " + car.getModel());
        }

    }
}