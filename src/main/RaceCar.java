package main;


public class RaceCar extends AbstractCar {
    RaceCar(){
        speed = 200;
    }

    @Override
    public double getEngineCapacity() {
        return 3.5;
    }
}
