package ru.x5javacourse.hw4.Cars;

public class SportCar extends Car {
    private final double maxSpeed;

    public SportCar(double maxSpeed,String brand, String classOfTheCar, double weight, Engine engine) {
        super(brand, classOfTheCar, weight, engine);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed(){
        return maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал.");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился.");
    }

    @Override
    public void printInfo() {
        System.out.println("Информация о SportCar: максимальная скорость SportCar: "+ getMaxSpeed() + " км/ч; бренд: "
                + getBrand() + "; класс SportCar: " + getClassOfTheCar() + "; вес автомобиля: " + getWeight() + "т.;");
        getEngine().printInfo();
        System.out.println("Автомобиль в движении: ");
        start();
        turnLeft();
        turnRight();
        stop();
    }
}
