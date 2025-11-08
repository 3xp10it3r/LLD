package LLD.StrategyPattern;

public abstract class CreditCard {
    
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    // Getter and Setter methods
    // ...

    public abstract void swipeAndPay();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
}