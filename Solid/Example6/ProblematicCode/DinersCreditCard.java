package LLD.Solid.Example6.ProblematicCode;

public class DinersCreditCard extends CreditCard {

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
        throw new UnsupportedOperationException("Refund not supported for Diners Credit Card");
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
    //     // Implementation for UPI payment
    // }

    @Override
    public void intlPayment() {
        // Implementation for international payment
    }
    
}
