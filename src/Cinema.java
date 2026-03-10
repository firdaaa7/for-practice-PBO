public class Cinema extends Building {

    private int numberOfStudios;
    private double monthlyRevenue;

    public Cinema(String name, String address, int numberOfFloors, int numberOfStudios, double monthlyRevenue) {
        super(name, address, numberOfFloors);
        this.numberOfStudios = numberOfStudios;
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public void showBuilding() {
        super.showBuilding();
        System.out.println("Type: Cinema");
        System.out.println("Number of Studios: " + numberOfStudios);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
        System.out.println("================================");
    }
}