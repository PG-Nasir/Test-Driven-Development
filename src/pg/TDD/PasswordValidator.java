package pg.TDD;

public class PasswordValidator {
    public static boolean isValid(String password){
        if(password.length()>=5 && password.length()<=10)
            return true;
        return false;
    }
}
