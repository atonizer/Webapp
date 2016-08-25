package main;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello %s!" + args[0]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hello, I am exception!");
        }

        Car simpleCar = new SimpleCar();
        Car raceCar = new RaceCar();
        raceCar.setSpeed(200);

        simpleCar.drive();
        raceCar.drive();


    }
}
