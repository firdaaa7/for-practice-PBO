public class Hospital extends Building {

    private int numberOfBeds;
    private double monthlyRevenue;

    public Hospital(String name, String address, int numberOfFloors, int numberOfBeds, double monthlyRevenue) {
        super(name, address, numberOfFloors);
        this.numberOfBeds = numberOfBeds;
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public void showBuilding() {
        super.showBuilding();
        System.out.println("Number of Beds: " + numberOfBeds);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
    }
}