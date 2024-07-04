package org.example;

public class Main {
    public static void main(String[] args) {

        //this section here is used for display purposes to show the results
        System.out.println("HWelcome to our Loan Repayment Calculator");
        LoanRepaymentRequest loanRepaymentRequest = new LoanRepaymentRequest(50000, 60,
                5, LoanRePaymentFrequency.MONTHLY);
        LoanRePaymentCalculator loanRePaymentCalculator = new LoanRePaymentCalculator();
        LoanRepaymentResponse loanRepaymentResponse = loanRePaymentCalculator
                .calculateLoanRepaymentsService(loanRepaymentRequest);
        System.out.println("Total Interest .."+loanRepaymentResponse.getTotalInterest());
        System.out.println("Total Amount .."+loanRepaymentResponse.getPayableTotalAMount());
        System.out.println("::::::::::::::::Loan Repayment Summary Table:::::::::::::::::::::");
        for (LoanRepaymentSummary summary: loanRepaymentResponse.getLoanRepaymentSummaryTable()){
            System.out.println("Payment " + summary.getPaymentCode()
                    + ": Interest Paid = " + summary.getLoanInterestPaid()
                    + ", Principal Paid = " + summary.getLoanPrincipalPaid()
                    + ", Pending Balance = " + summary.getPendingBalance());

        }
    }
}