class CheckingAccount extends Account {
    
    public CheckingAccount(long accountId, double balance) {
        super(accountId, balance);
    }

    @Override
    public void deposit(double amount) {
        
    }

    @Override
    public void withdraw(double amount) {
        
    }

    @Override
    public String toString() {
        return Long.toString(getAccountNumber())+ " " + Double.toString(balance);
    }

}