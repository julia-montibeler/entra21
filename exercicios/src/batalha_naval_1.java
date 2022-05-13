import java.util.Scanner;

public class batalha_naval_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mapa = {
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
        };
        int linha = 0;
        int coluna = 0;
        while (linha != 8) {
            System.out.print("Linha (para sair digite 8): ");
            linha = sc.nextInt();
            if (linha == 8) {
                break;
            }
            System.out.print("Coluna: ");
            coluna = sc.nextInt();

            if (mapa[linha][coluna] == 1) {
                System.out.println("Você atingiu uma embarcação");
            } else {
                System.out.println("Você não atingiu uma embarcação");
            }
        }

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (j == 7) {
                    System.out.println(mapa[i][j]+" ");
                } else {
                    System.out.print(mapa[i][j]+" ");
                }
            }
        }

    }
}
