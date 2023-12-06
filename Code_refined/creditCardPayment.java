public class creditCardPayment extends billPayment {

    public void validatePayment(){
        System.out.println("Validating selected credit card and payment amount...");
    }

    public void processPayment(){
        System.out.println("Processing credit card payment....");
    }
    
    public void printPaymentSlip(){
        System.out.println("Printing credit card payment slip..");
    }

    public boolean isPaymentSlipNed(){
        System.out.println("Do you want to generate the payment slip?");

        String choice = "Yes";

        System.out.println("The user input is " + choice);

        if(choice.equals("Yes")){
            return true;
        } else {
            System.out.println("Payment slip is not generated.");

            return false;
        }

    }
}