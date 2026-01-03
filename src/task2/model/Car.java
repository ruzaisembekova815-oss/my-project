package task2.model;

public class Car extends Vehicle implements Servicable {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.05 + getAge(2025) * 100;
    }

    @Override
    public void performService() {
        System.out.println("Car " + model + " is undergoing standard service.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 15000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Doors: " + numberOfDoors;
    }
}
