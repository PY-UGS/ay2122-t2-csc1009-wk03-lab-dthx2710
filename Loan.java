import java.util.Date;
import java.lang.Math.* ;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private final Date loanDate;

    public Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment() {
        //return (this.loanAmount * this.annualInterestRate/12) / (1-(1/Math.pow((1+(this.annualInterestRate/12)),(this.numberOfYears*12))));
        return (this.loanAmount * this.annualInterestRate/12/100) / (1-(1/Math.pow((1+(this.annualInterestRate/12/100)),(this.numberOfYears*12))));
    }

    public double getTotalPayment() {
        return this.getMonthlyPayment() * this.numberOfYears * 12;
    }
}