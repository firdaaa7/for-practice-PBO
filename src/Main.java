import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Smart City Management System");

    System.out.print("Enter Building Name: ");
    String name = scanner.nextLine();

    System.out.print("Enter Building Address: ");
    String address = scanner.nextLine();

    System.out.print("Enter Number of Floors: ");
    int floors = scanner.nextInt();

    Building building = new Building(name, address, floors);
    building.showbuildings();

    System.out.println("\nAdd Hospital Data");

    scanner.nextLine();

    System.out.print("Enter Hospital Name: ");
    String hName = scanner.nextLine();

    System.out.print("Enter Hospital Address: ");
    String hAddress = scanner.nextLine();

    System.out.print("Enter Hospital Floors: ");
    int hFloors = scanner.nextInt();

    System.out.print("Enter Number of Beds: ");
    int beds = scanner.nextInt();

    Hospital hospital = new Hospital(hName, hAddress, hFloors, beds);
    hospital.showbuildings();
  }
}