public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance = 0;

    public double calculateMonthlyInterest (){
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        return monthlyInterest;
    }

    public void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }

    public void setBalance(double balance){
        savingsBalance = balance;
    }

    public double getBalance(){
        return savingsBalance;
    }
}
