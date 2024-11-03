package exercise1030;

class CreditCardPayment{
    public void pay(double amount){
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class PayPalPayment{
    public void pay(double amount){
        System.out.println("Paid "+ amount + " using PayPal.");
    }
}
class BankTransferPayment{
    public void pay(double amount){
        System.out.println("Paid " + amount + " using Bank Transfer");
    }
}
class PaymentProcessor{
    private CreditCardPayment creditCardPayment;
    private PayPalPayment payPalPayment;
    private BankTransferPayment bankTransferPayment;

    public PaymentProcessor(){
        this.creditCardPayment = new CreditCardPayment();
        this.payPalPayment = new PayPalPayment();
        this.bankTransferPayment = new BankTransferPayment();
    }
    public void processPayment(String method, double amount){
        switch(method){
            case "CreditCard":
                creditCardPayment.pay(amount);
                break;
            case "PayPal":
                payPalPayment.pay(amount);
                break;
            case "BankTransfer":
                bankTransferPayment.pay(amount);
                break;
            default:
                System.out.println("Unsupported payment method");
                break;
        }
    }
}

public class Payment {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard", 100.0);
        paymentProcessor.processPayment("PayPal",150.0);
        paymentProcessor.processPayment("BankTransfer",200.0);
    }
}
