public class OverCapacityException extends Exception {
    OverCapacityException() {
        super("Guest's party is too large for the room");
    }
}
