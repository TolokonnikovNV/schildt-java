package chapter_4;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    Vehicle(){

    }

    void range(){
        System.out.println("Range - " + fuelcap * mpg);
    }

    int rangeInt(){
        return fuelcap * mpg;
    }

    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}
