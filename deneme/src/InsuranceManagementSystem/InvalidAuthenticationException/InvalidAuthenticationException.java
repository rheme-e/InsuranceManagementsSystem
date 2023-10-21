package InsuranceManagementSystem.InvalidAuthenticationException;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException() {
        super( "Hatalı mail ya da şifre");
    }
}
