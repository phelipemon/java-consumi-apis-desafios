package challenge_3.password;

import java.util.Scanner;

public class PrincipalPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crie sua senha com no minimo 8 digitos:");
        String senha = scanner.nextLine();


        try {
            validarSenha(senha);
            System.out.println("Senha criada com sucesso !");
        } catch (SenhaInvalidaException exception){
            System.out.println("Erro: " + exception.getMessage());
        }

    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
