package challenge_3.password;

public class SenhaInvalidaException extends RuntimeException{

    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }
}
