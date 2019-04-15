package DesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product.ProductBuilder("상품",1000)
                .setIsSellEnabled( true).build();
        System.out.println(p1);

    }
}
