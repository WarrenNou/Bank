
public class Bank{
    private String name;
    private String branch;
    private BankAccount [] bankAccount;
    private int count;
    public static double monthlyFee; 
    public Bank(String name, String branch){
        this.name = name;
        this.branch = branch;
        count = 0;
    }
    public Bank(String name, String branch, BankAccount [] ba){
        this.name = name;
        this.branch = branch;
        // example of deep copy
      /*  for(int index = 0; index < ba.length; index++){
            if (ba[index] instanceof CheckingAccount)
                bankAccount[index] = new CheckingAccount(ba[index].getNumber(),ba[index].getOwner(),ba[index].getType(), ba[index].getBalance());
            else
                bankAccount[index] = new SavingsAccount(ba[index].getNumber(),ba[index].getOwner(),ba[index].getType(), ba[index].getBalance(),ba[index].getInterestRate());
        }*/
        //example of shallow copy
      bankAccount = ba;
       count = ba.length;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public BankAccount getAccount(int number){
        for (int i = 0; i < bankAccount.length; i++){
            if (bankAccount[i].getNumber() == number){
                return bankAccount[i];
            }
        }
        return null;
    }
    public void applyMonthlyFee(){
        for (int i = 0; i < bankAccount.length; i++){
            bankAccount[i].balance = bankAccount[i].balance - monthlyFee;
            }
        }
    public void viewAllAccounts(){
        String titles = "Bank name: " + name + " \t" + "Bank branch: " + branch + "\n" + 
        "Type" + "\t\t" + "Account Number" + "\t"  + "Owner" + "\t\t\t" + "Balance" + "\t\t" + "Interest";
        System.out.println(titles);
        for(int i = 0; i < bankAccount.length; i++){
            System.out.println(bankAccount[i]);   
        }
       
    }
    public void sortAccounts(){
        java.util.Arrays.sort(bankAccount);
    }
}