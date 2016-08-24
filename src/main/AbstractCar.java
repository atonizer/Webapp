package main;


public abstract class AbstractCar implements Car {
    protected int speed = 100;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed +10;
    }

    public void drive(){
        out("\n" + this.getClass().getSimpleName() +
                " Moves at speed " + speed + "\n"+
                "EngineCapacity: " + getEngineCapacity());
    }

    private void out(String str){
        System.out.println(str);
    }
}
