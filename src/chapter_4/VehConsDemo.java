package chapter_4;

public class VehConsDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportCar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To cover a distance of " + dist + " miles, a minivan needs " + gallons + " gallons of fuel");

        gallons = sportCar.fuelneeded(dist);
        System.out.println("To cover a distance of " + dist + " miles, a sportcar needs " + gallons + " gallons of fuel");

    }
}
