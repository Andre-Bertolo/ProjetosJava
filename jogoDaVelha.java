import java.util.Scanner;

public class jogoDaVelha {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        /*
         * int valores[] = new int[10];
         * 
         * for (int i = 0; i < valores.length; i++) {
         * System.out.print("Informe um " + (i + 1) + "° valor: ");
         * valores[i] = Integer.parseInt(sc.nextLine());
         * }
         * 
         * for (int i = 0; i < valores.length; i++) {
         * System.out.println("[" + (i + 1) + "] = " + valores[i]);
         * }
         */

        String jogo_da_velha[][] = new String[3][3];

        for (int i = 0; i < jogo_da_velha.length; i++) {
            for (int j = 0; j < jogo_da_velha[i].length; j++) {
                System.out.println("Informe X ou O para " + (i + 1) + ", " + (j + 1));
                jogo_da_velha[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < jogo_da_velha.length; i++) {
            for (int j = 0; j < jogo_da_velha[i].length; j++) {
                System.out.print("|" + jogo_da_velha[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
