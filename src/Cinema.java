public class Cinema extends Building implements Taxable {

    private int numberOfStudios;
    private double monthlyRevenue;

    public Cinema(String name, String address, int numberOfFloors, BuildingStatus status, int numberOfStudios, double monthlyRevenue) {
        super(name, address, numberOfFloors, status);
        this.numberOfStudios = numberOfStudios;
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public double calculateTax() {
        return monthlyRevenue * BASE_TAX_RATE;
    }

    @Override
    public void showBuilding() {
        System.out.println("================================");
        System.out.println("Type: Cinema");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Status: " + status);
        System.out.println("Studios: " + numberOfStudios);
        System.out.println("Revenue: " + monthlyRevenue);
        System.out.println("Tax: " + calculateTax());
        System.out.println("================================");
    }
}