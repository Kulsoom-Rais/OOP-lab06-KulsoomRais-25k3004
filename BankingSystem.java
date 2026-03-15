class Account{
    double balance= 200000.0;
    public void displayBal(){
        System.out.println("Balance is " + balance);
    }
}
class SavingsAccount extends Account{
    public void displaySavAcc(){
        System.out.println("this is the saving account");
    }
}
class PremiumSavings extends SavingsAccount{
    public double calculateInterest(){
        double interest = balance * 0.07;
        return interest;
    }
}

public class BankingSystem {
    public static void main(String[] args){
        PremiumSavings p = new PremiumSavings();
        p.displayBal();
        p.displaySavAcc();
        double interest = p.calculateInterest();
        int FinalInt = (int)interest;
        System.out.println("Your interest is "+ FinalInt);
    }
}
