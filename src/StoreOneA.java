public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Combining parent toString()\n" + 
               super.toString() + 
               "\nLOAN DETAILS:\n" +
               "Loan Amount: €" + getLoanAmount() + "\n" +
               "Loan Term: " + getLoanPaymentTerm() + " months\n" +
               "Interest Rate: " + getINTEREST_RATE() + "\n" +
               "Special Customer: " + specialCustomer + "\n" +
               "Monthly Payment: €" + monthlyPayment;
    }

    @Override
    public double calculateLoanFinancing() {
        double basePayment = super.calculateLoanFinancing();
        this.monthlyPayment = basePayment;
        
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * 0.10); // 10%折扣
        }
        return monthlyPayment;
    }
}