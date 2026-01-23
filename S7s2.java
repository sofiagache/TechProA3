class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class S7s2 {

    static void checkPassword(String password) throws PasswordException {
        if (!password.equals("sofia")) {
            throw new PasswordException("Password must be least 8 long");
        } else {
            System.out.println("Password accepted");
        }
    }

    public static void main(String[] args) {
        try {
            checkPassword("sofia");
        } catch (PasswordException e) {
            System.out.println("User-Defined Exception: " + e.getMessage());
        }
    }
}