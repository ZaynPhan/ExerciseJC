package Date_2509;

import java.util.InputMismatchException;

public class InvalidCommandException extends InputMismatchException {
    public InvalidCommandException() {
        super("Wrong input format of command");
    }
}

