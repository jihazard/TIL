package DesignPattern.BuilderPattern;

public class Product {

    // parameters..
    private String name;
    private int price;

    // optional parameter
    private boolean isSell;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isSellEnabled() {
        return isSell;
    }

    @Override
    public String toString() {
        return "Product _ toString () Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isSell=" + isSell +
                '}';
    }

    // argument -> ProductBuilder instance.
    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.isSell = builder.isSell;
    }

    public static class ProductBuilder {
        private String name;
        private int price;
        private boolean isSell;

        public ProductBuilder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public ProductBuilder setIsSellEnabled(boolean isSell) {
            this.isSell = isSell;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

        @Override
        public String toString() {
            return "ProductBuilder{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", isSell=" + isSell +
                    '}';
        }
    }
}