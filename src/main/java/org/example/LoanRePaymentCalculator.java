package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nicholas Nzovia
 * @On 03/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public class LoanRePaymentCalculator {

    /*
     * The method is dedicated to perform loan repayment processing by
     * taking repaymentRequest and return the repaymentResponse
     */

    public LoanRepaymentResponse calculateLoanRepaymentsService(LoanRepaymentRequest loanRepaymentRequest){
        double loanAmount = loanRepaymentRequest.getLoanAmount();
        int loanTermInMonths = loanRepaymentRequest.getLoanTermInMonths();
        double annualInterestRate = loanRepaymentRequest.getInterestRatePerYear();
        LoanRePaymentFrequency frequency = loanRepaymentRequest.getLoanRePaymentFrequency();

        int paymentsInAYear = getPaymentsPerYear(frequency);
        double monthlyInterestRate = (annualInterestRate / 100) / paymentsInAYear;

        double paymentAmount = calculatePaymentAmount(loanAmount, monthlyInterestRate, loanTermInMonths);
        double pendingBalance = loanAmount;
        double totalInterestPaid = 0;
        List<LoanRepaymentSummary> repaymentSummaryTable = new ArrayList<>();



        for (int i = 1; i <= loanTermInMonths; i++) {
            double interestPaid = pendingBalance * monthlyInterestRate;
            double principalPaid = paymentAmount - interestPaid;
            pendingBalance -= principalPaid;

            totalInterestPaid += interestPaid;
            repaymentSummaryTable.add(new LoanRepaymentSummary(i, interestPaid, principalPaid, pendingBalance));

            //In this case customer can claim over payment
            if (pendingBalance <= 0) {
                break;
            }
        }
        double totalAmountRepaid = loanAmount + totalInterestPaid;
        return new LoanRepaymentResponse(totalInterestPaid, totalAmountRepaid, repaymentSummaryTable);
    }

    private int getPaymentsPerYear(LoanRePaymentFrequency frequency) {
        return switch (frequency) {
            case MONTHLY -> 12;
            case BI_MONTHLY -> 6;
            case WEEKLY -> 52;
            default -> throw new IllegalArgumentException("Unknown Frequency: " + frequency);
        };
    }

    private double calculatePaymentAmount(double loanAmount, double monthlyInterestRate, int loanTermInMonths) {
        return loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTermInMonths))
                / (Math.pow(1 + monthlyInterestRate, loanTermInMonths) - 1);

    }


}
