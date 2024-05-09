import java.util.Scanner;

public class Generator {
    final static String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()-_=+\\/~?";
    final static int s_len =  80;

    Scanner sc = new Scanner(System.in);

    public Generator(){
        requestPassword();
    }

    private void requestPassword() {
        System.out.println("Enter the length of the password");
        int length = sc.nextInt();
        System.out.println("Generated password : " + generatePassword(length));
    }

    private static String generatePassword(int length) {
        final StringBuilder password = new StringBuilder();

        int max = s_len - 1;
        int range = max + 1;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * range);
            password.append(s.charAt(index));
        }
        return password.toString();
    }
}