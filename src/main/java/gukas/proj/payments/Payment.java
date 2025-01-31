package gukas.proj.payments;

public abstract class Payment {

    protected double amountInCents;

    public abstract void processPayment();
}
