package chapter_4;

public class TwoVenicle {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        int range1, range2;

        minivan.passengers = 21;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelcap = 14;
        sportCar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportCar.fuelcap * sportCar.mpg;

        System.out.println("Minivan can transport " + minivan.passengers + " passengers to range " + range1 + " miles");
        System.out.println("Sportcar can transport " + sportCar.passengers + " passengers to range " + range2 + " miles");

    }
}
