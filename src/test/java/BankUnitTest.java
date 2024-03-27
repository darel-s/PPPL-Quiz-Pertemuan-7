import org.example.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankUnitTest {
    @BeforeAll
    public static void initBankAccount() {
        BankAccount bankAccount = new BankAccount("374245455400126", 10000);
    }

    @Test
    public void testGetAccountNumber() {
        BankAccount bankAccount = new BankAccount("374245455400126", 10000);
        assertEquals("374245455400126", bankAccount.getAccountNumber());
    }

    @Test
    public void testGetAccountNumber2() {
        BankAccount bankAccount = new BankAccount("374245455400126", 10000);
        assertEquals("12345678", bankAccount.getAccountNumber());
    }

    @Test
    public void testGetBalance() {
        BankAccount bankAccount = new BankAccount("374245455400", 10000000);
        assertEquals(10000000, bankAccount.getBalance());
    }

    @Test
    public void testGetBalance2() {
        BankAccount bankAccount = new BankAccount("374245455400", 10000000);
        assertEquals(1500000, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount("374245455400126", 1500000);
        bankAccount.deposit(500000);
        assertEquals(2000000, bankAccount.getBalance());
    }

    @Test
    public void testDeposit2() {
        BankAccount bankAccount = new BankAccount("374245455400126", 1500000);
        bankAccount.deposit(500000);
        assertEquals(2500000, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount("374245455400126", 2500000);
        bankAccount.withdraw(500000);
        assertEquals(2000000, bankAccount.getBalance());
    }

    @Test
    public void testWithdraw2() {
        BankAccount bankAccount = new BankAccount("374245455400126", 2500000);
        bankAccount.withdraw(500000);
        assertEquals(3000000, bankAccount.getBalance());
    }

    @Test
    public void testTransferFunds() {
        BankAccount bankAccount = new BankAccount("374245455400", 10000000);
        BankAccount recipient = new BankAccount("6034932528973614", 10000000);
        bankAccount.transferFunds(recipient, 5000000);
        assertEquals(5000000, bankAccount.getBalance());
    }

    @Test
    public void testTransferFunds2() {
        BankAccount bankAccount = new BankAccount("374245455400", 10000000);
        BankAccount recipient = new BankAccount("6034932528973614", 10000000);
        bankAccount.transferFunds(recipient, 5000000);
        assertEquals(15000000, bankAccount.getBalance());
    }
}
