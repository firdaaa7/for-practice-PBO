public class Apartment extends Building implements Taxable {

    private int numberOfUnits;
    private double monthlyRevenue;

    public Apartment(String name, String address, int numberOfFloors, BuildingStatus status, int numberOfUnits, double monthlyRevenue) {
        super(name, address, numberOfFloors, status);
        this.numberOfUnits = numberOfUnits;
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public double calculateTax() {
        return monthlyRevenue * BASE_TAX_RATE;
    }

    @Override
    public void showBuilding() {
        System.out.println("================================");
        System.out.println("Type: Apartment");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Status: " + status);
        System.out.println("Units: " + numberOfUnits);
        System.out.println("Revenue: " + monthlyRevenue);
        System.out.println("Tax: " + calculateTax());
        System.out.println("================================");
    }
}