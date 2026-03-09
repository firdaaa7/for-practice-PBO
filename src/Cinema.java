public class Cinema extends Building {

    private int numberOfScreens;
    private double monthlyRevenue;

    public Cinema(String name, String address, int numberOfFloors, int numberOfScreens) {
        super(name, address, numberOfFloors);
        this.numberOfScreens = numberOfScreens;
        this.monthlyRevenue = 80000000;
    }

    @Override
    public void showbuildings() {
        super.showbuildings();
        System.out.println("Number of Screens: " + numberOfScreens);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
        System.out.println("Type: Cinema");
    }
}