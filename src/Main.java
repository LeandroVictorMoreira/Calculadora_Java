import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Entrada entrada = new Entrada();
        entrada.lerNumeros();

        Soma soma = new Soma();
        soma.somar(entrada.firstNumber, entrada.SecondNumber);

        Subtracao subtracao = new Subtracao();
        subtracao.subtrair(entrada.firstNumber, entrada.SecondNumber);

        Divisao divisao = new Divisao();
        divisao.dividir(entrada.firstNumber, entrada.SecondNumber);
    }
}
