package DesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Person p = Person.PersonBuilder.aPerson()
                .withName("윤지환")
                .withAge("36")
                .withAddress("부천시")
                .build();
        System.out.println(p);
    }
}
