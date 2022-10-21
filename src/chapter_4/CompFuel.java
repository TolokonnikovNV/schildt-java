package chapter_4;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        double gallons;
        int dist = 252;

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelcap = 14;
        sportCar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To cover a distance of " + dist + " miles, a minivan needs " + gallons + " gallons of fuel");

        gallons = sportCar.fuelneeded(dist);
        System.out.println("To cover a distance of " + dist + " miles, a sportcar needs " + gallons + " gallons of fuel");
    }
}
