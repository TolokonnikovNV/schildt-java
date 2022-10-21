package chapter_7;

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can transport " + semi.getCargocap() + " feet");
        System.out.println("To cover " + dist + " miles, semi needs " + gallons + "  gallons of fuel");


        gallons = pickup.fuelneeded(dist);
        System.out.println("Pickup can transport " + pickup.getCargocap() + " feet");
        System.out.println("To cover " + dist + " miles, semi needs " + gallons + "  gallons of fuel");

    }
}
