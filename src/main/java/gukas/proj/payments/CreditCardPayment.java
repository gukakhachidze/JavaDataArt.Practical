package gukas.proj.payments;

import java.sql.Ref;

public class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(double amountInCents){
        this.amountInCents = amountInCents;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of " + amountInCents + " cents");
    }

    @Override
    public void refund() {
        System.out.println("Refunding credit card payment of " + amountInCents + " cents");

    }
}
