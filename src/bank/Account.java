package bank;

public class Account {
    private int accountNumber;
    private String customerName;
    private double balance;

    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public double deposit (double depositAmount) {
        return depositAmount + balance;
    }

    public double withdraw(double withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            return balance;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Account\n" +
                "Account Number: " + accountNumber + "\n" +
                "Name: " + customerName + "\n" +
                "Balance: " + balance;
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
}
