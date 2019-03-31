package DesignPattern.StrategyPattern_ExampleCode.finalCode;

import DesignPattern.StrategyPattern_ExampleCode.finalCode.service.FirstGuestDiscountStrategy;
import DesignPattern.StrategyPattern_ExampleCode.finalCode.service.NonFreshItemDiscountStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> order = new ArrayList<>();
        order.add(new Item(1000,true,"오징어"));
        order.add(new Item(2000,true,"문어"));

        Calulator cal = new Calulator(new FirstGuestDiscountStrategy());
        cal.print(cal.calculate(order));
        System.out.println("=================================================");
        Calulator cal2 = new Calulator(new NonFreshItemDiscountStrategy());
        cal2.print(cal2.calculate(order));


    }
}
