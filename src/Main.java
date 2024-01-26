import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String REGEX ="^[a-zA0-9_]*$" ;
    public static void main(String[] args) {
        try {
            metodForData("jj","jj","jj");
            System.out.println("ok.");
        }catch (WrongLoginException|WrongPasswordException o){
            System.out.println(o.getMessage());
        }
    }public static void metodForData(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException("!длина больше 20!");
        }
        if(!login.matches(REGEX)){
            throw new WrongLoginException("содержит неправильные символы");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password и confirmPassword не равны");
        }
        if(!password.matches(REGEX)){
            throw new WrongPasswordException("содержит неправильные символы");
        }
    }




}