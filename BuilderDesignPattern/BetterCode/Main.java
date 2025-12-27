package LLD.BuilderDesignPattern.BetterCode;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Laptop");
        builder.setDescription("High performance laptop");
        builder.setPrice(1500.00);
        // set other optional fields as needed

        Product product = new Product(builder);
    }
}
