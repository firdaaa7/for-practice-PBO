public class Apartment extends Building {

    private int numberOfUnits;
    private double monthlyRevenue;

    public Apartment(String name, String address, int numberOfFloors, int numberOfUnits, double monthlyRevenue) {
        super(name, address, numberOfFloors);
        this.numberOfUnits = numberOfUnits;
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public void showBuilding() {
        super.showBuilding();
        System.out.println("Type: Apartment");
        System.out.println("Number of Units: " + numberOfUnits);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
        System.out.println("================================");
    }
}