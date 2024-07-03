package org.example;

import java.util.HashMap;

/**
 * @author Nicholas Nzovia
 * @On 03/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public class LoanRepaymentResponse {
    private double totalInterest;
    private double payableTotalAMount;
    private HashMap<String, Integer> myHashMap;

    public LoanRepaymentResponse(double totalInterest,
                                 double payableTotalAMount,
                                 HashMap<String, Integer> myHashMap) {
        this.totalInterest = totalInterest;
        this.payableTotalAMount = payableTotalAMount;
        this.myHashMap = myHashMap;
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

    public HashMap<String, Integer> getMyHashMap() {
        return myHashMap;
    }

    public void setMyHashMap(HashMap<String, Integer> myHashMap) {
        this.myHashMap = myHashMap;
    }
}
