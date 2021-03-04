public class BankAccount {
    private String accountName;
    private double balance;
    public BankAccount(){
        accountName="Anik";
        balance=0.0;
    }
    public BankAccount(String name)
    {
        accountName=name;
    }
    public BankAccount(String name,double amount)
    {
        accountName=name;
        balance=amount;
    }
    public BankAccount(BankAccount oth)
    {
        accountName=oth.getAccountName();
        balance=oth.getBalance();
    }
    public void setAccountName(String accountName)
    {
        this.accountName=accountName;
    }
    public String getAccountName()
    {
        return accountName;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
}
