import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int option;

    do {

      System.out.println("\nWelcome to Smart City Management System");
      System.out.println("1. Add New Building");
      System.out.println("2. Add New Hospital");
      System.out.println("3. Add New Cinema");
      System.out.println("4. Add New Apartment");
      System.out.println("5. Exit");
      System.out.print("Please select an option: ");

      option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {

        case 1:
          System.out.println("Enter Building Name: ");
          String name = scanner.nextLine();
          System.out.println("Enter Building Address: ");
          String address = scanner.nextLine();
          System.out.println("Enter Number of Floors: ");
          int floors = scanner.nextInt();
          scanner.nextLine();
          Building building = new Building(name, address, floors);
          System.out.println("Building added successfully!");
          building.showBuilding();
          break;

        case 2:
          System.out.println("Enter Hospital Name: ");
          String hospitalName = scanner.nextLine();
          System.out.println("Enter Hospital Address: ");
          String hospitalAddress = scanner.nextLine();
          System.out.println("Enter Number of Floors: ");
          int hospitalFloors = scanner.nextInt();
          System.out.println("Enter Number of Beds: ");
          int beds = scanner.nextInt();
          System.out.println("Enter Monthly Revenue: ");
          double hospitalRevenue = scanner.nextDouble();
          scanner.nextLine();
          Hospital hospital = new Hospital(
                  hospitalName,
                  hospitalAddress,
                  hospitalFloors,
                  beds,
                  hospitalRevenue
          );
          hospital.showBuilding();
          break;

        case 3:
          System.out.println("Enter Cinema Name: ");
          String cinemaName = scanner.nextLine();
          System.out.println("Enter Cinema Address: ");
          String cinemaAddress = scanner.nextLine();
          System.out.println("Enter Number of Floors: ");
          int cinemaFloors = scanner.nextInt();
          System.out.println("Enter Number of Studios: ");
          int studios = scanner.nextInt();
          System.out.println("Enter Monthly Revenue: ");
          double cinemaRevenue = scanner.nextDouble();
          scanner.nextLine();
          Cinema cinema = new Cinema(
                  cinemaName,
                  cinemaAddress,
                  cinemaFloors,
                  studios,
                  cinemaRevenue
          );
          cinema.showBuilding();
          break;

        case 4:
          System.out.println("Enter Apartment Name: ");
          String apartmentName = scanner.nextLine();
          System.out.println("Enter Apartment Address: ");
          String apartmentAddress = scanner.nextLine();
          System.out.println("Enter Number of Floors: ");
          int apartmentFloors = scanner.nextInt();
          System.out.println("Enter Number of Units: ");
          int units = scanner.nextInt();
          System.out.println("Enter Monthly Revenue: ");
          double apartmentRevenue = scanner.nextDouble();
          scanner.nextLine();
          Apartment apartment = new Apartment(
                  apartmentName,
                  apartmentAddress,
                  apartmentFloors,
                  units,
                  apartmentRevenue
          );
          apartment.showBuilding();
          break;

        case 5:
          System.out.println("Exiting the system. Goodbye!");
          break;

        default:
          System.out.println("Invalid option. Please try again.");

      }

    } while (option != 5);

    scanner.close();
  }
}