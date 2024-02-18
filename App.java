import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot, 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline

            switch (choice) {
                case 1:
                    System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                    int choice2 = scanner.nextInt();
                    scanner.nextLine(); // consume the leftover newline
                    switch (choice2) {
                        case 1:
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturerCar = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String modelCar = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int maxSpeedCar = scanner.nextInt();
                            vehicles.add(new Car(manufacturerCar, modelCar, maxSpeedCar));
                            break;
                        case 2:
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturerPlane = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String modelPlane = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int maxSpeedPlane = scanner.nextInt();
                            vehicles.add(new Plane(manufacturerPlane, modelPlane, maxSpeedPlane));
                            break;
                        case 3:
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturerShip = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String modelShip = scanner.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            int maxSpeedShip = scanner.nextInt();
                            vehicles.add(new Ship(manufacturerShip, modelShip, maxSpeedShip));
                            break;
                    }
                    break;
                case 2:
                    for(Vehicle vehicle:vehicles){
                        System.out.println(vehicle.toString());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Virheellinen valinta. Yritä uudelleen.");
                    break;
            }
        }
        scanner.close();
    }
 
}
