public abstract class fundTransfer {
    public final void transferFunds(){
        executeTransfer();
        validateTransferDetails();
        performTransfer();
        postTransfer();

        if(isTransferSlipNed()){
            printTransferSlip();
        }
    }

    public void executeTransfer(){
        System.out.println("Executing transfer...");
    }

    public abstract void validateTransferDetails();
    public abstract void performTransfer();
    public abstract void printTransferSlip();

    public void postTransfer(){
        System.out.println("Transfer successful!");
    }

    public boolean isTransferSlipNed(){
        return true;
    }

}
