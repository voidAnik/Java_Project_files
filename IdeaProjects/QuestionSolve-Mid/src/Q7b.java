import java.util.ArrayList;
import java.util.Collections;

public class Q7b{
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts=new ArrayList<BankAccount>();
        accounts.add(new BankAccount("Rasha", "011123", 12000));
        accounts.add(new BankAccount("Keya", "011124", 10500));
        accounts.add(new BankAccount("Asad", "011125", 100000));
        Collections.sort(accounts);
        System.out.println("Accounts sorted in Ascending order:");
        for(BankAccount b: accounts)
            System.out.println(b);
    }
}
class BankAccount implements Comparable<BankAccount> {
    String name, id;
    double balance;

    public BankAccount(String name, String id, double balance) {

        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public int compareTo(BankAccount bc)
    {
        return (int)(this.balance-bc.balance);
    }
    public String toString()
    {
        return name+"-"+id+"-"+balance;
    }
}