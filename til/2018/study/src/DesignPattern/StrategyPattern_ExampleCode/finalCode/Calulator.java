package DesignPattern.StrategyPattern_ExampleCode.finalCode;

import DesignPattern.StrategyPattern_ExampleCode.finalCode.service.DiscountStrategy;

import java.util.List;

public class Calulator {
    private DiscountStrategy discountStrategy;

    public Calulator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public int calculate(List<Item> items){
        int sum = 0;
        for(Item item : items){
            sum += discountStrategy.getDiscountPrice(item);
        }
        return sum;
    }

    public void print(int sum){
        System.out.println("합계금액: " + sum);
    }
}
