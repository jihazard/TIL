package car;

public class BasicCar extends Car{
    private int price;

    public BasicCar(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getCarInfo() {
        return "기본카";
    }
}
