package LLD.Solid.Example6.ProblematicCode;

public abstract class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    // Getter and Setter methods
    // ...

    public abstract void swipeAndPay();
    public abstract void doRefund();
    public abstract void onlinePayment();
    public abstract void tapAndPay();
    // public abstract void upiPayment();
    public abstract void intlPayment();
}
