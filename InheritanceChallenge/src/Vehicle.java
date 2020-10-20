public class Vehicle {
    private String name;
    private int capacity;
    private String vehicleType;
    private int engine;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int capacity, String vehicleType, int engine) {
        this.name = name;
        this.capacity = capacity;
        this.vehicleType = vehicleType;
        this.engine = engine;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getEngine() {
        return engine;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        System.out.println("Vehicle.stop() called");
        this.currentVelocity = 0;

    }
}
