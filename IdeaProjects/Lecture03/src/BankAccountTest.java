public class BankAccountTest {
    public static void main(String args[]) {
        BankAccount account = new BankAccount("Anikk",1.0);
        BankAccount account2= new BankAccount();
        BankAccount account3=new BankAccount(account);
        System.out.println("Account name:" + account.getAccountName());
        System.out.println("balance:" + account.getBalance());
        System.out.println("Account name:" + account3.getAccountName());
        System.out.println("balance:" + account3.getBalance());
    }
}
