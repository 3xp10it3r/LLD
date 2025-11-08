package LLD.Solid.Example7;

public class Main {

    public static void main(String[] args) {
        CreditCard cc1 = new Visa(new SameInstrumentRefundAlgo());
        Rupay cc2 = new Rupay(new SameWalletRefundAlgo());

        cc2.refundAmount();
    }
}
