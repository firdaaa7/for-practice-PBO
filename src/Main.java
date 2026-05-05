import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int option;

    Building[] buildings = new Building[100];
    int count = 0;

    do {

      System.out.println("\nWelcome to Smart City Management System");
      System.out.println("1. Add New Building");
      System.out.println("2. Add New Hospital");
      System.out.println("3. Add New Cinema");
      System.out.println("4. Add New Apartment");
      System.out.println("5. Show All Buildings");
      System.out.println("6. Exit");
      System.out.print("Please select an option: ");

      option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {

        case 1:
          System.out.print("Enter Building Name: ");
          String name = scanner.nextLine();
          System.out.print("Enter Building Address: ");
          String address = scanner.nextLine();
          System.out.print("Enter Number of Floors: ");
          int floors = scanner.nextInt();

          System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
          int statusChoice1 = scanner.nextInt();
          scanner.nextLine();

          BuildingStatus status1;
          if (statusChoice1 == 1) status1 = BuildingStatus.ACTIVE;
          else if (statusChoice1 == 2) status1 = BuildingStatus.UNDER_CONSTRUCTION;
          else status1 = BuildingStatus.INACTIVE;

          buildings[count++] = new Building(name, address, floors, status1) {
            @Override
            public void showBuilding() {
              System.out.println("================================");
              System.out.println("Type: General Building");
              System.out.println("Name: " + name);
              System.out.println("Address: " + address);
              System.out.println("Floors: " + numberOfFloors);
              System.out.println("Status: " + status);
              System.out.println("================================");
            }
          };
          break;

        case 2:
          System.out.print("Enter Hospital Name: ");
          String hospitalName = scanner.nextLine();
          System.out.print("Enter Hospital Address: ");
          String hospitalAddress = scanner.nextLine();
          System.out.print("Enter Number of Floors: ");
          int hospitalFloors = scanner.nextInt();
          System.out.print("Enter Number of Beds: ");
          int beds = scanner.nextInt();
          System.out.print("Enter Monthly Revenue: ");
          double hospitalRevenue = scanner.nextDouble();

          System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
          int statusChoice2 = scanner.nextInt();
          scanner.nextLine();

          BuildingStatus status2;
          if (statusChoice2 == 1) status2 = BuildingStatus.ACTIVE;
          else if (statusChoice2 == 2) status2 = BuildingStatus.UNDER_CONSTRUCTION;
          else status2 = BuildingStatus.INACTIVE;

          buildings[count++] = new Hospital(
                  hospitalName,
                  hospitalAddress,
                  hospitalFloors,
                  status2,
                  beds,
                  hospitalRevenue
          );
          break;

        case 3:
          System.out.print("Enter Cinema Name: ");
          String cinemaName = scanner.nextLine();
          System.out.print("Enter Cinema Address: ");
          String cinemaAddress = scanner.nextLine();
          System.out.print("Enter Number of Floors: ");
          int cinemaFloors = scanner.nextInt();
          System.out.print("Enter Number of Studios: ");
          int studios = scanner.nextInt();
          System.out.print("Enter Monthly Revenue: ");
          double cinemaRevenue = scanner.nextDouble();

          System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
          int statusChoice3 = scanner.nextInt();
          scanner.nextLine();

          BuildingStatus status3;
          if (statusChoice3 == 1) status3 = BuildingStatus.ACTIVE;
          else if (statusChoice3 == 2) status3 = BuildingStatus.UNDER_CONSTRUCTION;
          else status3 = BuildingStatus.INACTIVE;

          buildings[count++] = new Cinema(
                  cinemaName,
                  cinemaAddress,
                  cinemaFloors,
                  status3,
                  studios,
                  cinemaRevenue
          );
          break;

        case 4:
          System.out.print("Enter Apartment Name: ");
          String apartmentName = scanner.nextLine();
          System.out.print("Enter Apartment Address: ");
          String apartmentAddress = scanner.nextLine();
          System.out.print("Enter Number of Floors: ");
          int apartmentFloors = scanner.nextInt();
          System.out.print("Enter Number of Units: ");
          int units = scanner.nextInt();
          System.out.print("Enter Monthly Revenue: ");
          double apartmentRevenue = scanner.nextDouble();

          System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
          int statusChoice4 = scanner.nextInt();
          scanner.nextLine();

          BuildingStatus status4;
          if (statusChoice4 == 1) status4 = BuildingStatus.ACTIVE;
          else if (statusChoice4 == 2) status4 = BuildingStatus.UNDER_CONSTRUCTION;
          else status4 = BuildingStatus.INACTIVE;

          buildings[count++] = new Apartment(
                  apartmentName,
                  apartmentAddress,
                  apartmentFloors,
                  status4,
                  units,
                  apartmentRevenue
          );
          break;

        case 5:
          if (count == 0) {
            System.out.println("No buildings available!");
          } else {
            for (int i = 0; i < count; i++) {
              buildings[i].showBuilding();
            }
          }
          break;

        case 6:
          System.out.println("Exiting the system. Goodbye!");
          break;

        default:
          System.out.println("Invalid option. Please try again!");
      }

    } while (option != 6);

    scanner.close();
  }
}