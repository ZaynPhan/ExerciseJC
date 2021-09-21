package Date_1809.exceptions;

public class InvalidHeightException extends Exception {
    public InvalidHeightException() {
        super("Height must be a value between 1 and 3.");
    }
}
