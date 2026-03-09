import java.io.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int choice;

    do {

      System.out.println("\nSmart City System");
      System.out.println("1. Add Building");
      System.out.println("2. Add Hospital");
      System.out.println("3. Add Cinema");
      System.out.println("4. Add Apartment");
      System.out.println("5. View Buildings");
      System.out.println("6. Exit");
      System.out.print("Choose: ");

      choice = input.nextInt();
      input.nextLine();

      try {

        if (choice >= 1 && choice <= 4) {

          System.out.print("Name: ");
          String name = input.nextLine();

          System.out.print("Address: ");
          String address = input.nextLine();

          System.out.print("Floors: ");
          int floors = input.nextInt();
          input.nextLine();

          String type = "";

          if (choice == 1) type = "Building";
          if (choice == 2) type = "Hospital";
          if (choice == 3) type = "Cinema";
          if (choice == 4) type = "Apartment";

          FileWriter fw = new FileWriter("buildings.txt", true);
          fw.write(type + "," + name + "," + address + "," + floors + "\n");
          fw.close();

          System.out.println("Saved!");

        }

        else if (choice == 5) {

          BufferedReader br = new BufferedReader(new FileReader("buildings.txt"));
          String line;

          System.out.println("\nBuilding List:");

          while ((line = br.readLine()) != null) {

            String[] data = line.split(",");

            System.out.println("==================================");
            System.out.println("Type: " + data[0]);
            System.out.println("Name: " + data[1]);
            System.out.println("Address: " + data[2]);
            System.out.println("Floors: " + data[3]);
          }

          br.close();
        }

      } catch (Exception e) {
        System.out.println("Error.");
      }

    } while (choice != 6);

    System.out.println("Program End.");
  }
}