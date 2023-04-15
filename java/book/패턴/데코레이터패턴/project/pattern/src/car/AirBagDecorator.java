package car;

public class AirBagDecorator extends CarOptionDecorator{
    private int price;

    public AirBagDecorator(Car car, int price) {
        super(car);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + this.price;
    }

    @Override
    public String getCarInfo() {
        String addbehaver = "airBag기능";
        return addbehaver + " " + super.getCarInfo();
    }
}
