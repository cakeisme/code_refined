public class phoneBillPayment extends billPayment {
    
    public void validatePayment(){
        System.out.println("Validating phone number and bill payment amount...");
    }

    public void processPayment(){
        System.out.println("Processing phone bill payment....");
    }

    public void printPaymentSlip(){
        System.out.println("Printing phone bill payment slip..");
    }

    public boolean isPaymentSlipNed(){
        System.out.println("Do you want to generate the payment slip?");

        String choice = "No";

        System.out.println("The user input is " + choice);

        if(choice.equals("Yes")){
            return true;
        } else {
            System.out.println("Payment slip is not generated.");

            return false;
        }

    }

}
