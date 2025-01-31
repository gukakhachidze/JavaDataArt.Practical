package gukas.proj.payments;

public class CashPayment  extends Payment{
    public CashPayment(double amountInCents){
        this.amountInCents = amountInCents;
    }
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment of " + amountInCents + " cents");
    }
}
