public class Generator {
    final static String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()-_=+\\/~?";
    final static int LENGTH =  80;


    public static String generateRandomPassword(int length) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * (LENGTH));
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();
    }
}