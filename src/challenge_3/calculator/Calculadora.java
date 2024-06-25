package challenge_3.calculator;

public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora(double num1, double num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }
    public double divide(){
        if (numero2 == 0){
            throw new ArithmeticException("Não é possivel efetuar uma divisão por 0 !!!");
        }
        return this.numero1 / this.numero2;
    }
}
