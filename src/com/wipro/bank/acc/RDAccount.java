
package com.wipro.bank.acc;

public class RDAccount extends Account {
    public RDAccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    @Override
    public float calculateAmountDeposited() {
        return principal * tenure * 12;
    }

    @Override
    public float calculateInterest() {
        int n = 4; // quarterly compounding
        int totalMonths = tenure * 12;
        float r = rateOfInterest / 100;
        float compoundInterest = 0.0f;

        for (int i = 1; i <= totalMonths; i++) {
            float t = (float) (totalMonths - i + 1) / 12.0f;
            float amount = (float) (principal * (Math.pow((1 + r / n), n * t) - 1));
            compoundInterest += amount;
        }
        return compoundInterest;
    }
}
