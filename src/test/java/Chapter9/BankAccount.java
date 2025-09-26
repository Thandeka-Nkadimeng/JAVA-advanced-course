/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author Thandeka Nkadimeng
 */
enum AccountType {
    DEBIT, SAVINGS, LOAN, CHEQUE, CREDIT
}

public class BankAccount {

    private String accountHolder;
    private String accNumber;
    private double balance;

    public BankAccount(String accountHolder, String accNumber, AccountType type, double balance) {
        this.accountHolder = accountHolder;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
// DEBIT = DB, SAVINGS = SV, LOAN = LN, CHEQUE = CQ, CREDIT = CR

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accountNumber, AccountType type) {
        switch (type) {
            case DEBIT:
                this.accountHolder = "DB-" + accountNumber;
                break;
            case SAVINGS:
                this.accountHolder = "SV-" + accountNumber;
                break;
            case LOAN:
                this.accountHolder = "LN-" + accountNumber;
                break;
            case CHEQUE:
                this.accountHolder = "CQ-" + accountNumber;
                break;
            case CREDIT:
                this.accountHolder = "CR-" + accountNumber;
                break;
            default:
                throw new IllegalArgumentException("Unknown account type");
        }
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
        if (accountHolder.length() < 4) {
            throw new IllegalArgumentException("Account holder should be at least 4 characters ");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, double initialBalance, String accNumber) {
        setAccountHolder(accountHolder);
        setBalance(balance);
        setAccNumber(accNumber, AccountType.LOAN);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > 0 && amount <= getBalance()) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew: " + amount);
        } else {
            throw new InsufficientFundsException("Invalid withdraw amount ot Insufficient funds."
                    + "\n Current balance: " + getBalance() + "\n"
                    + "\nRequested amount: " + amount);
        }
    }

    public void transfer(BankAccount targetAccount, double amount) throws InsufficientFundsException {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            //targetAccount.deposit(amount);
            System.out.println(accountHolder + " transferred " + amount + " to " + targetAccount.accountHolder);
        } else {
            throw new InsufficientFundsException("Invalid transfer amount ot Insufficient funds.");

        }
    }

    public double getBalance() {
        return balance;
    }

    public String displayDetails() {
        return "\n Account Holder: " + getAccountHolder()
                + "\nBalance: " + getBalance();
    }
}
