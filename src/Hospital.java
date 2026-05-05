public class Hospital extends Building {

    private int numberOfBeds;
    private double monthlyRevenue;

    public Hospital(String name, String address, int numberOfFloors, BuildingStatus status, int numberOfBeds, double monthlyRevenue) {
        super(name, address, numberOfFloors, status);
        this.numberOfBeds = numberOfBeds;
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public void showBuilding() {
        System.out.println("================================");
        System.out.println("Type: Hospital");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Status: " + status);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Revenue: " + monthlyRevenue);
        System.out.println("================================");
    }
}