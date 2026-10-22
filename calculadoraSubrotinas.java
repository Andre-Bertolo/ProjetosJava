import java.util.Scanner;

public class calculadoraSubrotinas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Informe a operação matemática: ");

        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            default:
                break;
        }
    }

    static double receberValor(int ordem) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o %d valor: ", ordem);

        double resultado = scanner.nextDouble();

        return resultado;
    }

    static void imprimirResultado(double resultado) {
        System.out.printf("Resultado = %.2f", resultado);
    }

    static void somar() {
        double valor1 = receberValor(1);

        double valor2 = receberValor(2);
        double resultado = valor1 + valor2;

        imprimirResultado(resultado);
    }

    static void subtrair() {
        double valor1 = receberValor(1);
        double valor2 = receberValor(2);
        double resultado = valor1 - valor2;

        imprimirResultado(resultado);
    }

    static void multiplicar() {
        double valor1 = receberValor(1);
        double valor2 = receberValor(2);
        double resultado = valor1 * valor2;

        imprimirResultado(resultado);
    }

    static void dividir() {
        double valor1 = receberValor(1);
        double valor2 = receberValor(2);
        double resultado = valor1 / valor2;

        imprimirResultado(resultado);
    }
}