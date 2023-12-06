public abstract class loan {
    
    public final void applyLoan(){
        authAccount();
        valdPersonal();
        vladEmployment();
        valdLoan();
        processLoan();
        postApplication();
    }

    public void authAccount(){
        System.out.println("Authenticating user bank account...");
    }

    public void valdPersonal(){
        System.out.println("Validating personal details...");
    }

    public void vladEmployment(){
        System.out.println("Validating employment details...");
    }

    public void postApplication(){
        System.out.println("Application has been submitted!");
    }

    public abstract void valdLoan();
    public abstract void processLoan();

}
