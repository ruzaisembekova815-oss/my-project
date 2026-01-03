package task2.model;

public class Bus extends Vehicle implements Servicable {
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08 + getAge(2025) * 200;
    }

    @Override
    public void performService() {
        System.out.println("Bus " + model + " is undergoing full technical service.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + passengerCapacity;
    }
}
