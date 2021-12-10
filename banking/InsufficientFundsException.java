public class InsufficientFundsException extends BankException {
    private static String message(double amount) {
        return "Số tiền không hợp lệ: $" + Double.toString(amount);
    }

    public InsufficientFundsException(double amount){
        super(message(amount));
    }
    
}
