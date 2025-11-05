package LLD.StrategyPattern;

public class DinersCreditCard extends CreditCard implements RefundCompatibleCreditCard {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    private RefundStrategy refundStrategy;

    DinersCreditCard() {
        this.refundStrategy = new WalletRefundStrategy();
    }

    @Override
    public void swipeAndPay() {
        // Implementation for swipe and pay
    }

    @Override
    public void onlinePayment() {
        // Implementation for online payment
    }

    @Override
    public void tapAndPay() {
        // Implementation for tap and pay
    }

    @Override
    public void doRefund() {
        // Implementation for refund
        this.refundStrategy.doRefund(); 
    }
}
