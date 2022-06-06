public class CheckingAccount extends BankAccount{
    public CheckingAccount(int number, String owner, String type, double balance){
        super(number,owner,type,balance);
    }
    public CheckingAccount(String owner, String type, double balance){
        super(owner,type,balance);
    }
    public String toString(){
        return super.toString() + getInterestRate();
    }
    @Override
    public double getInterestRate(){
        return 0;
    }
    public double applyMonthlyInterest(){
        return balance;
    }
}