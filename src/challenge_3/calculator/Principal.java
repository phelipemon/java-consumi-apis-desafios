package challenge_3.calculator;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("CALCULADORA DE DIVISÕES");
        System.out.println("informe o primeiro numero:");

        try {
            Scanner leitor = new Scanner(System.in);
            var num1 = leitor.nextDouble();
            System.out.println("digite o divisor:");
            var num2 = leitor.nextDouble();


            Calculadora calculadora = new Calculadora(num1,num2);
            System.out.println("Resultado: " + calculadora.divide());

        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            System.out.println("Lembre-se que o menor divisor possível é o número 1 !!!");
        }
        System.out.println("Calculadora encerrada");
    }
}
