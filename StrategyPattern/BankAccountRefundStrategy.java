package LLD.StrategyPattern;

public class BankAccountRefundStrategy implements RefundStrategy {

    @Override
    public void doRefund() {
        System.out.println("Refunding to the linked bank account.");
    } 
}
