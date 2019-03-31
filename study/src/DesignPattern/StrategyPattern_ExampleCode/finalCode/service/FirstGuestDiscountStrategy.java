package DesignPattern.StrategyPattern_ExampleCode.finalCode.service;

import DesignPattern.StrategyPattern_ExampleCode.finalCode.Item;

public class FirstGuestDiscountStrategy implements DiscountStrategy {
    @Override
    public int getDiscountPrice(Item item) {
        return (int) (item.getPrice()*0.9);
    }
}
