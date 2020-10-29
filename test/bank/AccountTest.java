package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void deposit() {
        Account account = new Account(1, "Patrick Kringelum", 2000);
        assertEquals(2000, account.getBalance(), 0.001);
        account.deposit(4000);
        assertEquals(6000, account.getBalance(), 0.001);
    }

    @Test
    void withdraw() {
    }

    @Test
    void transfer() {
    }
}