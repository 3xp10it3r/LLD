package LLD.StrategyPattern;

public class SameInstrumentRefundStrategy implements RefundStrategy {

    @Override
    public void doRefund() {
        System.out.println("Refunding to the same instrument used for payment.");
    }
    
}
