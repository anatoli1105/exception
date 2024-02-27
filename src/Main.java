import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String REGEX = "^[a-zA0-9_]*$";

    public static void main(String[] args) {
        try {
            metodForData("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj", "jj", "jj");
            System.out.println("ok.");
        } catch (WrongLoginException | WrongPasswordException o) {
            System.out.println(o.getMessage());
        }
    }

    public static void metodForData(String login, String password, String confirmPassword) {
        if (checkLenghtEndSimbol(login) == false) {
            throw new WrongLoginException("!длина логина больше 20,или логин содержить неправильные символы!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password и confirmPassword не равны");
        }
        if (checkLenghtEndSimbol(password) == false) {
            throw new WrongPasswordException("!длина пароля больше 20,или пароль  содержить неправильные символы!");
        }

    }

    public static boolean checkLenghtEndSimbol(String string) {

        return string.length() < 20 && string.matches(REGEX);
    }


}