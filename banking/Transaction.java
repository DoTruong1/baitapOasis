public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS  = 4;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInitialBalance() {
        return this.initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getFinalBalance() {
        return this.finalBalance;
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }
    
    Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionTypeString(int type) {
        switch (type) {
            case 1:
                return "Nạp tiền vãng lai";
            case 2:
                return "Rút tiền vãng lai";
            case 3:
                return "Tiet kiem nap";
            case 4:
                return "Tiet kiem rut";
        }
        return "";
    }

    public String getTransactionSummary() {
        return "Kiểu giao dịch: " + getTransactionTypeString(this.getType()) + "."
                + "Số dư ban đầu: $" + Double.toString(this.getInitialBalance()) + "."
                + "Số tiền: $" + Double.toString(this.getAmount()) + "."
                + "Số dư cuối: $" + Double.toString(this.getFinalBalance()) + ".";
    }
}
