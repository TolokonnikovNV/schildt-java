package chapter_4;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 21;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can transport " + minivan.passengers + " passengers to range " + range + " miles");
    }
}
