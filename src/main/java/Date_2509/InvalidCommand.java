package Date_2509;

import java.util.InputMismatchException;

public class InvalidCommand extends InputMismatchException {
    public InvalidCommand() {
        super("Wrong input format of command");
    }
}

