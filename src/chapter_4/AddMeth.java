package chapter_4;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        minivan.passengers = 21;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelcap = 14;
        sportCar.mpg = 12;

        System.out.print("Minivan can transport " + minivan.passengers + " passengers. ");
        minivan.range();
        System.out.print("Sportcar can transport " + sportCar.passengers + " passengers. ");
        sportCar.range();
    }
}
