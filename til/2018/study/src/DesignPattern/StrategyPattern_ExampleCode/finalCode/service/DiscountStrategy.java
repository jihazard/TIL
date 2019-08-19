package DesignPattern.StrategyPattern_ExampleCode.finalCode.service;

import DesignPattern.StrategyPattern_ExampleCode.finalCode.Item;

public interface DiscountStrategy {

    public int getDiscountPrice(Item item);
}
