package chapter_7;

public class Truck extends Vehicle {
    private int cargocap;

    public Truck(int passengers, int fuelcap, int mpg, int cargocap) {
        super(passengers, fuelcap, mpg);
        this.cargocap = cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }

    public int getCargocap() {
        return cargocap;
    }
}
