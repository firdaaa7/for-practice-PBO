import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int choice;

    do {

      System.out.println("Welcome to Smart City Management System");
      System.out.println("1. Add Building");
      System.out.println("2. Add Hospital");
      System.out.println("3. Add Cinema");
      System.out.println("4. Add Apartment");
      System.out.println("5. View All Buildings");
      System.out.println("6. Exit");
      System.out.print("Choose option: ");

      choice = input.nextInt();
      input.nextLine();

      switch (choice) {

        case 1:

          System.out.print("Enter Building Name: ");
          String name = input.nextLine();

          System.out.print("Enter Building Address: ");
          String address = input.nextLine();

          System.out.print("Enter Number of Floors: ");
          int floors = input.nextInt();
          input.nextLine();

          saveToFile("Building," + name + "," + address + "," + floors);

          System.out.println("Building saved!");
          break;

        case 2:

          System.out.print("Enter Hospital Name: ");
          name = input.nextLine();

          System.out.print("Enter Address: ");
          address = input.nextLine();

          System.out.print("Enter Floors: ");
          floors = input.nextInt();

          System.out.print("Enter Number of Beds: ");
          int beds = input.nextInt();
          input.nextLine();

          saveToFile("Hospital," + name + "," + address + "," + floors + "," + beds);

          System.out.println("Hospital saved!");
          break;

        case 3:

          System.out.print("Enter Cinema Name: ");
          name = input.nextLine();

          System.out.print("Enter Address: ");
          address = input.nextLine();

          System.out.print("Enter Floors: ");
          floors = input.nextInt();

          System.out.print("Enter Screens: ");
          int screens = input.nextInt();
          input.nextLine();

          saveToFile("Cinema," + name + "," + address + "," + floors + "," + screens);

          System.out.println("Cinema saved!");
          break;

        case 4:

          System.out.print("Enter Apartment Name: ");
          name = input.nextLine();

          System.out.print("Enter Address: ");
          address = input.nextLine();

          System.out.print("Enter Floors: ");
          floors = input.nextInt();

          System.out.print("Enter Units: ");
          int units = input.nextInt();
          input.nextLine();

          saveToFile("Apartment," + name + "," + address + "," + floors + "," + units);

          System.out.println("Apartment saved!");
          break;

        case 5:

          viewBuildings();
          break;

        case 6:
          System.out.println("Exiting program...");
          break;

        default:
          System.out.println("Invalid option.");

      }

    } while (choice != 6);

    input.close();
  }

  public static void saveToFile(String data) {

    try {
      FileWriter fw = new FileWriter("buildings.txt", true);
      PrintWriter pw = new PrintWriter(fw);

      pw.println(data);
      pw.close();

    } catch (IOException e) {
      System.out.println("Error saving file.");
    }
  }

  public static void viewBuildings() {

    try {

      BufferedReader br = new BufferedReader(new FileReader("buildings.txt"));
      String line;

      System.out.println("\n=== Building List ===");

      while ((line = br.readLine()) != null) {

        String[] data = line.split(",");

        System.out.println("===================");
        System.out.println("Type: " + data[0]);
        System.out.println("Name: " + data[1]);
        System.out.println("Address: " + data[2]);
        System.out.println("Floors: " + data[3]);

        if (data[0].equals("Hospital"))
          System.out.println("Beds: " + data[4]);

        if (data[0].equals("Cinema"))
          System.out.println("Screens: " + data[4]);

        if (data[0].equals("Apartment"))
          System.out.println("Units: " + data[4]);
      }

      br.close();

    } catch (IOException e) {
      System.out.println("No data found.");
    }
  }
}