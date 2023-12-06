public class customer {

    public static void main(String[] args) {

         long startTime = System.currentTimeMillis();
        
        loginMaster lg = loginMaster.getInstance();
        boolean auth = lg.authenticateLogin("alex", "1234");

        if(auth){
            
            System.out.println("\nInternal fund transfer:");
            fundTransfer it = new internalTransfer();
            it.transferFunds();

            System.out.println("\nExternal fund transfer:");
            fundTransfer et = new externalTransfer();
            et.transferFunds();

            System.out.println("\nPhone bill payment:");
            billPayment pbp = new phoneBillPayment();
            pbp.payBill();

            System.out.println("\nCredit card payment:");
            billPayment ccp = new creditCardPayment();
            ccp.payBill();

            System.out.println("\nHouse loan application:");
            loan hl = new houseLoan();
            hl.applyLoan();

            System.out.println("\nCar loan application:");
            loan cl = new carLoan();
            cl.applyLoan();

        } else {
            System.out.println("\nFail to authenticate login!");
        }

long endTime = System.currentTimeMillis();

System.out.println("That took " + (endTime - startTime) + " milliseconds");

        lg.logout();

    }
     
}