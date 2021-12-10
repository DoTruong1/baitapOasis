public class InvalidFundingAmountException extends BankException{

    private static String message(double amount) {
        return "Số tiền không hợp lệ: $" + Double.toString(amount);
    }
    public InvalidFundingAmountException(double amount) {
        super(message(amount));
    }

}
