public abstract class billPayment {
    
    public final void payBill(){
        authenticateAccount();
        validatePayment();
        processPayment();
        confirmPayment();
        if(isPaymentSlipNed()) {
            printPaymentSlip();
        }
    }

    public abstract void validatePayment();
    public abstract void processPayment();
    public abstract void printPaymentSlip();

    public void authenticateAccount(){

        System.out.println("Authenticating user account...");

    }

    public void confirmPayment(){

        System.out.println("Payment confirmed, thank you!");

    }

    public boolean isPaymentSlipNed() {
        return true;
    }


}
