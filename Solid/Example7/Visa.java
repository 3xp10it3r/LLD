package LLD.Solid.Example7;

public class Visa extends CreditCard implements RefundCompatibleCC{

    public RefundLogic refundLogic;

    public Visa(RefundLogic refundLogic){
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
    public void refundAmount(){
        // Implementation for refund
        // Algo1
        refundLogic.doRefund();
    }
}
