/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class AccountTest {

    static BankAccount objAccount;

    @BeforeAll
    static void setup() {
        objAccount = new BankAccount("Joe Smith", "12355554", AccountType.CHEQUE, 1000);
    }

    @AfterEach
    void getCurrentAccountData() {
        System.err.println(objAccount.displayDetails());
    }

    @Test
    @DisplayName("Test Account Holder - Invalid name")
    void testInvalidAccountHolder() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> objAccount.setAccountHolder("Joe"));
    }

    @Test
    void testAccountNumberPrefix() {
        String accountNumber = "1234567";
        String accountHolder = "Joe Smith";
        double balance = 5000;

        BankAccount objAcc = new BankAccount(accountHolder, accountNumber, AccountType.CHEQUE, balance);
        BankAccount objAcc1 = new BankAccount(accountHolder, accountNumber, AccountType.CREDIT, balance);

        BankAccount objAcc2 = new BankAccount(accountHolder, accountNumber, AccountType.DEBIT, balance);

        BankAccount objAcc3 = new BankAccount(accountHolder, accountNumber, AccountType.LOAN, balance);

        BankAccount objAcc4 = new BankAccount(accountHolder, accountNumber, AccountType.SAVINGS, balance);

        String expected = "LN-" + accountNumber;
        System.out.println(objAcc.displayDetails());

        assertAll(
                () -> Assertions.assertEquals("CQ-" + accountNumber, objAcc.getAccNumber()),
                () -> Assertions.assertEquals("CR-" + accountNumber, objAcc1.getAccNumber()),
                () -> Assertions.assertEquals("DB-" + accountNumber, objAcc2.getAccNumber()),
                () -> Assertions.assertEquals("LN-" + accountNumber, objAcc3.getAccNumber()),
                () -> Assertions.assertEquals("SV-" + accountNumber, objAcc4.getAccNumber())
        );
        Assertions.assertEquals("CQ-" + accountNumber, objAcc.getAccNumber());
    }

    @Test
    @DisplayName("Test AccountDeposit")
    void testDeposit() {
        //Arrange
        double amountToDeposit = 11000;
        double expectedBalance = 12000;

        //Actual
        objAccount.deposit(amountToDeposit);
        double actualBalance = objAccount.getBalance();

        //Assert
        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    @DisplayName("Test AccountWithdraw")
    void testWithdrawal() throws InsufficientFundsException {
        //Arrange
        double amountTowithdraw = 1000;
        double expectedbalance = 11000;

        //Actual
        objAccount.withdraw(amountTowithdraw);
        double actualBalance = objAccount.getBalance();

        //Assert
        Assertions.assertEquals(expectedbalance, actualBalance);
    }

    @Test
    @DisplayName("Withdrawal - Insufficient funds")
    void testWithdrawalInsufficientFunds() {
        double amountToWithdrawb = 12000;

        Assertions.assertThrows(InsufficientFundsException.class,
                () -> objAccount.withdraw(amountToWithdrawb));
    }

    @Test
    @DisplayName("Test AccountTransfer")
    void testTransfer() throws InsufficientFundsException {
        BankAccount bankAccTransferringTo = new BankAccount("12355554", "Joe Smith", AccountType.CHEQUE, 10000);

        //Arrange
        double amountToTransfer = 2000;
        double expectedCurrentbalance = 8000;
        double expectedTargetbalance = 7000;

        //Actual
        objAccount.transfer(bankAccTransferringTo, amountToTransfer);
        double actualBalance = objAccount.getBalance();
        double actualTargetBal = bankAccTransferringTo.getBalance();
        //Assert
        //Assertions.assertEquals(expectedbalance, actualBalance);

        assertAll(
                () -> Assertions.assertEquals(expectedTargetbalance, actualTargetBal),
                () -> Assertions.assertEquals(expectedCurrentbalance, actualBalance)
        );
    }

}
