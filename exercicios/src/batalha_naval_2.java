import java.util.Scanner;

public class batalha_naval_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mapa = {
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0},
        };
        String[][] mapaIm = {
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"}
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
                mapaIm[linha][coluna] = "+";


                //transformar coordenadas ao redor
                if (linha > 0 && linha < 7 && coluna > 0 && coluna < 7) {
                    if (mapa[linha + 1][coluna] == 0) {
                        mapaIm[linha + 1][coluna] = "/";
                    } else {
                        mapaIm[linha + 1][coluna] = "+";
                    }

                    if (mapa[linha + 1][coluna + 1] == 0) {
                        mapaIm[linha + 1][coluna + 1] = "/";
                    } else {
                        mapaIm[linha + 1][coluna + 1] = "+";
                    }

                    if (mapa[linha][coluna + 1] == 0) {
                        mapaIm[linha][coluna + 1] = "/";
                    } else {
                        mapaIm[linha][coluna + 1] = "+";
                    }

                    if (mapa[linha - 1][coluna] == 0) {
                        mapaIm[linha - 1][coluna] = "/";
                    } else {
                        mapaIm[linha - 1][coluna] = "+";
                    }

                    if (mapa[linha - 1][coluna - 1] == 0) {
                        mapaIm[linha - 1][coluna - 1] = "/";
                    } else {
                        mapaIm[linha - 1][coluna - 1] = "+";
                    }

                    if (mapa[linha][coluna - 1] == 0) {
                        mapaIm[linha][coluna - 1] = "/";
                    } else {
                        mapaIm[linha][coluna - 1] = "+";
                    }

                    if (mapa[linha + 1][coluna - 1] == 0) {
                        mapaIm[linha + 1][coluna - 1] = "/";
                    } else {
                        mapaIm[linha + 1][coluna - 1] = "+";
                    }

                    if (mapa[linha - 1][coluna + 1] == 0) {
                        mapaIm[linha - 1][coluna + 1] = "/";
                    } else {
                        mapaIm[linha - 1][coluna + 1] = "+";
                    }
                }

                System.out.println("Você não atingiu uma embarcação");
                mapaIm[linha][coluna] = "/";
            }
            for (int i = 0; i < mapaIm.length; i++) {
                for (int j = 0; j < mapaIm[i].length; j++) {
                    if (j == 7) {
                        System.out.println(mapaIm[i][j]+" ");
                    } else {
                        System.out.print(mapaIm[i][j]+" ");
                    }


                }
            }
        }

    }
}

