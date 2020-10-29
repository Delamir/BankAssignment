package bank;

public class Account {
    private int accountNumber;
    private String customerName;
    private double balance;

    public double deposit (double depositAmount) {
        return depositAmount + balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
