

public class BankValidationException extends Exception {
    public BankValidationException() {
        super("Invalid data");
    }

    public BankValidationException(String message) {
        super(message);
    }

    public BankValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}

