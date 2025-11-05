package LLD.Solid.Example6.ProblematicCode;

public class VisaCreditCard extends CreditCard {

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
    // public void upiPayment() {
    //     // Visa cards do not support UPI payments
    //     throw new UnsupportedOperationException("UPI Payment not supported for Visa Credit Card");
    // }

    @Override
    public void intlPayment() {
        // Implementation for international payment
    }
    
}
