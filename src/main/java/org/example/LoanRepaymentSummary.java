package org.example;

/**
 * @author Nicholas Nzovia
 * @On 04/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public class LoanRepaymentSummary {
    private int paymentCode;
    private double loanInterestPaid;
    private double loanPrincipalPaid;
    private double pendingBalance;

    public LoanRepaymentSummary(int paymentCode,
                                double loanInterestPaid,
                                double loanPrincipalPaid,
                                double pendingBalance) {
        this.paymentCode = paymentCode;
        this.loanInterestPaid = loanInterestPaid;
        this.loanPrincipalPaid = loanPrincipalPaid;
        this.pendingBalance = pendingBalance;
    }

    public int getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(int paymentCode) {
        this.paymentCode = paymentCode;
    }

    public double getLoanInterestPaid() {
        return loanInterestPaid;
    }

    public void setLoanInterestPaid(double loanInterestPaid) {
        this.loanInterestPaid = loanInterestPaid;
    }

    public double getLoanPrincipalPaid() {
        return loanPrincipalPaid;
    }

    public void setLoanPrincipalPaid(double loanPrincipalPaid) {
        this.loanPrincipalPaid = loanPrincipalPaid;
    }

    public double getPendingBalance() {
        return pendingBalance;
    }

    public void setPendingBalance(double pendingBalance) {
        this.pendingBalance = pendingBalance;
    }
}
