package OOPs_Assign;
abstract class Loan {

    double loanAmount;
    int creditScore;

    Loan(double loanAmount, int creditScore) {
        this.loanAmount = loanAmount;
        this.creditScore = creditScore;
    }

    abstract void applyLoan();
    abstract void checkEligibility();
    abstract void calculateEMI();
    abstract void approveLoan();
}

class HomeLoan extends Loan {

    HomeLoan(double loanAmount, int creditScore) {
        super(loanAmount, creditScore);
    }
    void applyLoan() {
        System.out.println("Home Loan applied for ₹" + loanAmount);
    }
    void checkEligibility() {
        if (creditScore >= 750)
            System.out.println("Eligibility check passed");
        else
            System.out.println("Eligibility check failed");
    }

    void calculateEMI() {
        System.out.println("EMI calculated");
    }
    
    void approveLoan() {
        if (creditScore >= 750)
            System.out.println("Loan approved");
        else
            System.out.println("Loan rejected");
    }
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan = new HomeLoan(2000000, 780);

        loan.applyLoan();
        loan.checkEligibility();
        loan.calculateEMI();
        loan.approveLoan();
	}

}
