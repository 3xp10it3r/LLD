package LLD.Solid.Example7;

public class Rupay extends CreditCard implements RefundCompatibleCC {

    public RefundLogic refundLogic;

    public Rupay(RefundLogic refundLogic){
        this.refundLogic = refundLogic;
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
    public void refundAmount() {
        // Implementation for refund
        // Algo2
        refundLogic.doRefund();
    }
}

