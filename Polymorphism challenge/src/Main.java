import java.util.Random;

class Car {
    private String name;
    private String engine;
    private int cylinders;
    private int wheels;

    public Car(String name, String engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }
    public String getName() {
        return name;
    }
    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEnginge() {
       return "Car -> startEngine";
    }

    public String accelerate() {
       return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> brake";
    }
}

class Toyota extends Car {


    public Toyota(String engine, int cylinders, int wheels, String name) {
        super(name, engine, cylinders, wheels);

    }



    @Override
    public String startEnginge() {
        return "Toyota -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate";
    }

    @Override
    public String brake() {
        return "Toyota -> brake";
    }

}

class Honda extends Car {

    public Honda(String engine, int cylinders, int wheels, String name) {
        super(name, engine, cylinders, wheels);

    }



    @Override
    public String startEnginge() {
        return "Honda -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate";
    }

    @Override
    public String brake() {
        return "Honda -> brake";
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Car car = generateCar();
            System.out.println("Car name = " + car.getName());
            System.out.println(car.startEnginge());
            System.out.println(car.accelerate());
            System.out.println(car.brake());
    }

}

    public static Car generateCar() {
        Random random = new Random();
        int number = random.nextInt(2) + 1;
        switch (number) {
            case 1:
                return new Toyota("1500",4,4,"Yaris");
            case 2:
                return new Honda("2000",4,4,"Civic");
        }


        return null;
    }
}
