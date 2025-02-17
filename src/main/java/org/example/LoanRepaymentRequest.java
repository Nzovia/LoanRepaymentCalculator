package org.example;

/**
 * @author Nicholas Nzovia
 * @On 03/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public class LoanRepaymentRequest {
    private double loanAmount;
    private int loanTermInMonths;
    private double interestRatePerYear;
    private LoanRePaymentFrequency  loanRePaymentFrequency;


    public LoanRepaymentRequest(double loanAmount, int loanTermInMonths,
                                double interestRatePerYear,
                                LoanRePaymentFrequency loanRePaymentFrequency) {
        this.loanAmount = loanAmount;
        this.loanTermInMonths = loanTermInMonths;
        this.interestRatePerYear = interestRatePerYear;
        this.loanRePaymentFrequency = loanRePaymentFrequency;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanTermInMonths() {
        return loanTermInMonths;
    }

    public void setLoanTermInMonths(int loanTermInMonths) {
        this.loanTermInMonths = loanTermInMonths;
    }

    public double getInterestRatePerYear() {
        return interestRatePerYear;
    }

    public void setInterestRatePerYear(double interestRatePerYear) {
        this.interestRatePerYear = interestRatePerYear;
    }

    public LoanRePaymentFrequency getLoanRePaymentFrequency() {
        return loanRePaymentFrequency;
    }

    public void setLoanRePaymentFrequency(LoanRePaymentFrequency loanRePaymentFrequency) {
        this.loanRePaymentFrequency = loanRePaymentFrequency;
    }
}
