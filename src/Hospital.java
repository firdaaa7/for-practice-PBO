public class Hospital extends Building {

    private int numberOfBeds;
    private double monthlyRevenue;

    public Hospital(String name, String address, int numberOfFloors, int numberOfBeds) {
        super(name, address, numberOfFloors);
        this.numberOfBeds = numberOfBeds;
        this.monthlyRevenue = 100000000;
    }

    @Override
    public void showbuildings() {
        super.showbuildings();
        System.out.println("Number of Beds: " + numberOfBeds);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
        System.out.println("Type: Hospital");
    }
}
