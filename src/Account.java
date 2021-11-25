import java.io.Serializable;

public class Account implements Serializable {
    private String firstName;
    private String lastName;
    private int account;
    private double balance;

    public Account() {
        this(" "," ", 0, 0.0);
    }

    public Account(String firstName, String lastName, int account, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
