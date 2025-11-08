package LLD.Solid.Example7;

public class Amex extends CreditCard implements RefundCompatibleCC{

    public RefundLogic refundAlgo;

    public Amex(RefundLogic refundAlgo){
        this.refundAlgo = refundAlgo;
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
        refundAlgo.doRefund();
    }
}

