package com.wipro.bank.acc;

public abstract class Account {
    int tenure;
    float principal;
    float rateOfInterest;

    public void setInterest(int age, String gender) {
        if (gender.equalsIgnoreCase("Male") && age < 60) {
            this.rateOfInterest = 9.8f;
        } else if (gender.equalsIgnoreCase("Male") && age >= 60) {
            this.rateOfInterest = 10.5f;
        }
        if (gender.equalsIgnoreCase("Female") && age < 58) {
            this.rateOfInterest = 10.2f;
        }
        if (gender.equalsIgnoreCase("Female") && age >= 58) {
            this.rateOfInterest = 10.8f;
        }
    }

    public float calculateMaturityAmount(float totalPrincipalAmount, float maturityInterest) {
        return totalPrincipalAmount + maturityInterest;
    }

    public abstract float calculateInterest();
    public abstract float calculateAmountDeposited();
}
