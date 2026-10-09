import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[4];
        float media = 0;
        float soma = 0;

        System.out.println("Programa Boletim");
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Informe a " + (i + 1) + "° nota: ");
                notas[i] = scanner.nextFloat();
                if (notas[i] > 10 || notas[i] < 0) {
                    System.out.println("Nota invalida!");
                }
            } while (notas[i] > 10 || notas[i] < 0);
            soma += notas[i];
        }
        media = soma / notas.length;

        System.out.println("A media do Aluno é: " + media);

        if (media >= 7) {
            System.out.println("Parabéns!! Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado!!");
        }
    }
}