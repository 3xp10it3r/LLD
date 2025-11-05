package LLD.Solid.Example6.ProblematicCode;

public class RupayCreditCard extends CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void doRefund() {
        // Implementation for refund
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
    }

    // @Override
    public void upiPayment() {
        // Rupay cards do support UPI payments
    }

    @Override
    public void intlPayment() {
        // Implementation for international payment
        throw new UnsupportedOperationException("International Payment not supported for Rupay Credit Card");
    }
}
