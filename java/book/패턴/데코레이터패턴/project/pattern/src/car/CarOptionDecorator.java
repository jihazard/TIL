package car;

public abstract  class CarOptionDecorator extends Car {
    private Car car;

    public CarOptionDecorator(Car car) {
        this.car = car;
    }

    @Override
    public int getPrice() {
        return car.getPrice();
    }

    @Override
    public String getCarInfo() {
        return car.getCarInfo();
    }
}
