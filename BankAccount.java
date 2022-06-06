public abstract class BankAccount implements Comparable<BankAccount>{
    private int number;
    private String owner;
    private String type;
    protected double balance;
    protected BankAccount(String owner, String type, double balance){
        this.owner = owner;
        this.type = type;
        this.balance = balance;
    }
    protected BankAccount(int number, String owner, String type, double balance){
        this.number = number;
        this.owner = owner;
        this.type = type;
        this.balance = balance;
    }
    public int getNumber(){
        return number;
    }
    public String getOwner(){
        return owner;
    }
    public String getType(){
        return type;
    }
    public double getBalance(){
        return balance;
    }
    public boolean withdraw(double amount){
        if (amount > balance){
            return false;
        }
        balance = balance - amount;
        return true;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public int compareTo(BankAccount ba){  // BAObj1.compareTo(BAobj2)
        if(balance > ba.getBalance())
           return 1;
        else if(balance < ba.getBalance())
          return -1;
        else
          return 0;
    }
    public boolean equals(Object o){ //CAOBj.equals(CAObj2)
        if (o instanceof BankAccount){
            BankAccount ba = (BankAccount) o;
            return balance == ba.getBalance();
        }
          return false;    
        }
        public String toString(){
            return type + "\t " + number + "\t\t" + owner + "\t " + String.format("%.2f",balance) + "\t";
        }
    public abstract double getInterestRate();
    public abstract double applyMonthlyInterest();

}