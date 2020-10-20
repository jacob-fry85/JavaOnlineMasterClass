public class Car extends Vehicle {
    private int carWheels;
    private int carDoors;
    private int carHorsePower;
    private boolean isManual;

    private int currentGear;

    public Car(String name, int capacity, String vehicleType, int engine, int carWheels, int carDoors, int carHorsePower, boolean isManual) {
        super(name, capacity, vehicleType, engine);
        this.carWheels = carWheels;
        this.carDoors = carDoors;
        this.carHorsePower = carHorsePower;
        this.isManual = isManual;

        this.currentGear = 1;
    }

    public void changingGears(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGEar(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed,direction);
    }
}
