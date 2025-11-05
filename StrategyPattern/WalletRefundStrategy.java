package LLD.StrategyPattern;

public class WalletRefundStrategy implements RefundStrategy {

    @Override
    public void doRefund() {
        System.out.println("Refunding to the wallet.");
    }
    
}
