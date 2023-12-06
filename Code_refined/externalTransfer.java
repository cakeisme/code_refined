public class externalTransfer extends fundTransfer {

    public void validateTransferDetails(){
        System.out.println("Validating selected external bank, account number and recipient reference...");
    }

    public void performTransfer(){
        System.out.println("Performing external transfer....");
    }

    public void printTransferSlip(){
        System.out.println("Printing external transfer slip...");
    }

    public boolean isTransferSlipNed(){
        System.out.println("Do you want to generate the transfer slip?");

        String choice = "No";

        System.out.println("The user input is " + choice);

        if(choice.equals("Yes")){
            return true;
        } else {
            System.out.println("Transfer slip is not generated.");

            return false;
        }

    }
    
}
