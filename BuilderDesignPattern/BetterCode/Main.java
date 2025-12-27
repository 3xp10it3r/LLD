package LLD.BuilderDesignPattern.BetterCode;

public class Main {
    public static void main(String[] args) {
        Product product = Product.getBuilder()
                .setName("Laptop")
                .setDescription("High performance laptop")
                .setPrice(1500.00)
                .build();
    }
}
