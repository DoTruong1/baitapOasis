import java.util.List;
import java.util.ArrayList;
abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected Long accountNumber;
    protected double balance;
    protected List<Transaction> transactions = new ArrayList<Transaction>();

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    public void addTransactions(Transaction transactions) {
        this.transactions.add(transactions);
    }

    public String getTransactionsHistory() {
        String answer = "Lịch sử giao dịch của tài khoản " 
                    + Long.toString(this.getAccountNumber()) + "\n";
        for (Transaction tx : transactions) {
            answer += tx.getTransactionSummary() + "\n";
        }
        return answer;
    }

    public Account(){}
    
    public Account(Long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    private boolean isValid(double amount) {
        if (this instanceof SavingAccount) {
            if(amount > 1000D || this.getBalance() - 5000D < 0) {
                System.out.println("");
                return false;
            }
            return true;
        }
        return true;
    }

    public void doWithdrawing(double amount) {
        if (this.getBalance() < amount) {
            return;
        }
        if(isValid(amount)) {

        }

        this.balance -= amount;

    }

    public void doDepositing() {

    }

    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account a = (Account) o;
            return this.accountNumber.equals(a.getAccountNumber());
        }
        return false;
    }

    abstract public String toString();
}
