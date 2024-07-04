package org.example;

import java.util.HashMap;
import java.util.List;

/**
 * @author Nicholas Nzovia
 * @On 03/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public class LoanRepaymentResponse {
    private double totalInterest;
    private double payableTotalAMount;
    private List<LoanRepaymentSummary> loanRepaymentSummaryTable;

    public LoanRepaymentResponse(double totalInterest, double payableTotalAMount,
                                 List<LoanRepaymentSummary> loanRepaymentSummaryTable) {
        this.totalInterest = totalInterest;
        this.payableTotalAMount = payableTotalAMount;
        this.loanRepaymentSummaryTable = loanRepaymentSummaryTable;
    }

    public double getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public double getPayableTotalAMount() {
        return payableTotalAMount;
    }

    public void setPayableTotalAMount(double payableTotalAMount) {
        this.payableTotalAMount = payableTotalAMount;
    }

    public List<LoanRepaymentSummary> getLoanRepaymentSummaryTable() {
        return loanRepaymentSummaryTable;
    }

    public void setLoanRepaymentSummaryTable(List<LoanRepaymentSummary>
                                                     loanRepaymentSummaryTable) {
        this.loanRepaymentSummaryTable = loanRepaymentSummaryTable;
    }
}
