package main;


public class SimpleCar extends AbstractCar {
    @Override
    public void drive() {
        super.drive();
        System.out.println("Screech, screech");
    }

    @Override
    public double getEngineCapacity() {
        return 1.7;
    }
}
