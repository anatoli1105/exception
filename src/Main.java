import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String REGEX = "^[a-zA0-9_]*$";

    public static void main(String[] args) {
        try {
            metodForData("jjjjjjjj", "jjыв", "jj");
            System.out.println("ok.");
        } catch (WrongLoginException | WrongPasswordException o) {
            System.out.println(o.getMessage());
        }
    }

    public static void metodForData(String login, String password, String confirmPassword) {
        if (methodForLenght(login) == false) {
            throw new WrongLoginException("!длина больше 20!");
        }
        if (!login.matches(REGEX) || !password.matches(REGEX)) {
            throw new WrongLoginException("содержит неправильные символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password и confirmPassword не равны");
        }
        if (methodForLenght(password) == false) {
            throw new WrongPasswordException("!длина больше 20!");
        }

    }

    public static boolean methodForLenght(String string) {
        if (string.length() > 20) {
            return false;
        }
        return true;
    }


}