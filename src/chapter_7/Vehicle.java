package chapter_7;

public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    double fuelneeded(int miles) {

        return (double) miles / mpg;
    }

    int range() {
        return mpg * fuelcap;
    }


    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public int getMpg() {
        return mpg;
    }
}
