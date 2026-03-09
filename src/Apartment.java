public class Apartment extends Building {

    private int numberOfUnits;
    private double monthlyRevenue;

    public Apartment(String name, String address, int numberOfFloors, int numberOfUnits) {
        super(name, address, numberOfFloors);
        this.numberOfUnits = numberOfUnits;
        this.monthlyRevenue = 60000000;
    }

    @Override
    public void showbuildings() {
        super.showbuildings();
        System.out.println("Number of Units: " + numberOfUnits);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
        System.out.println("Type: Apartment");
    }
}