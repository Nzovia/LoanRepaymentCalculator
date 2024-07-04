import org.example.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;


/**
 * @author Nicholas Nzovia
 * @On 04/07/2024
 * @Contact: itsdevelopernic22@gmail.com
 */

public class LoanRepaymentCalculatorUnitTest {
    private LoanRePaymentCalculator loanRePaymentCalculator;
    LoanRepaymentRequest loanRepaymentRequest;
    LoanRepaymentResponse loanRepaymentResponse;


    @Before
    public void setUp() throws Exception {
        loanRePaymentCalculator = new LoanRePaymentCalculator();
        loanRepaymentRequest = new LoanRepaymentRequest(50000,60,5, LoanRePaymentFrequency.MONTHLY);
        
    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void name() {
        loanRepaymentResponse = loanRePaymentCalculator.calculateLoanRepaymentsService(loanRepaymentRequest);
        assertEquals(6613.700932032769, loanRepaymentResponse.getTotalInterest(), 0.01);
        assertEquals(56613.7009320327,loanRepaymentResponse.getPayableTotalAMount(),0.01);
        List<LoanRepaymentSummary> summary = loanRepaymentResponse.getLoanRepaymentSummaryTable();
        assertEquals(60, summary.size());
        assertTrue(summary.get(summary.size() - 1).getPendingBalance() <= 0);

    }
}
