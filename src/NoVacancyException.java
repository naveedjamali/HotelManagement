public class NoVacancyException extends Exception {
    NoVacancyException() {
        super("Hotel has no rooms left.");
    }

}
