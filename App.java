import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("App Calculadora");

        System.out.print("Informe seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite o primeiro valor: ");
        float valor1 = scanner.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = scanner.nextFloat();

        float soma = valor1 + valor2;
        System.out.println("A soma de " + valor1 + " + " + valor2 + " = " + soma);

        float subtracao = valor1 - valor2;
        System.out.println("A subtração de " + valor1 + " - " + valor2 + " = " + subtracao);

        float multiplicacao = valor1 * valor2;
        System.out.println("A multiplicação de " + valor1 + " * " + valor2 + " = " + multiplicacao);

        if (valor2 != 0) {
            float divisao = valor1 / valor2;
            System.out.println("A divisão de " + valor1 + " / " + valor2 + " = " + divisao);
        } else {
            System.out.println("Impossível divisão por zero!");
        }
        
        System.out.println("Muito obrigado!! " + nome);

        scanner.close();
    }
}
