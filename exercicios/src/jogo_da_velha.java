import java.util.Scanner;

public class jogo_da_velha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] tabuleiro = {
                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}};
        int letra = 0;
        int linha = 0;
        int coluna = 0;
        boolean end = false;
        String[] xo = {"x","o"};
        int cont = 0;

        while (end == false) {
            for (int i = 0; i < 2;i++) {
                System.out.print("Informe um lugar para "+xo[i]+": ");
                letra = sc.nextInt();
                while (true) {
                    switch (letra) {
                        case 1:
                            linha = 0;
                            coluna = 0;
                            break;
                        case 2:
                            linha = 0;
                            coluna = 1;
                            break;
                        case 3:
                            linha = 0;
                            coluna = 2;
                            break;
                        case 4:
                            linha = 1;
                            coluna = 0;
                            break;
                        case 5:
                            linha = 1;
                            coluna = 1;
                            break;
                        case 6:
                            linha = 1;
                            coluna = 2;
                            break;
                        case 7:
                            linha = 2;
                            coluna = 0;
                            break;
                        case 8:
                            linha = 2;
                            coluna = 1;
                            break;
                        case 9:
                            linha = 2;
                            coluna = 2;
                            break;
                    }
                    if (!tabuleiro[linha][coluna].equals("-") || letra < 1 || letra > 9) {
                        System.out.println("Digite uma posição válida: ");
                        letra = sc.nextInt();
                    } else {
                        break;
                    }
                }

                tabuleiro[linha][coluna] = xo[i];

                for (int j = 0; j < tabuleiro.length; j++) {
                    for (int k = 0; k < tabuleiro[j].length; k++) {
                        if (k == 2) {
                            System.out.println(tabuleiro[j][k] + " ");
                        } else {
                            System.out.print(tabuleiro[j][k] + " ");
                        }
                    }
                }

                if ((tabuleiro[0][0].equals(xo[i]) && tabuleiro[0][1].equals(xo[i]) && tabuleiro[0][2].equals(xo[i])) ||
                        (tabuleiro[0][0].equals(xo[i]) && tabuleiro[1][1].equals(xo[i]) && tabuleiro[2][2].equals(xo[i])) ||
                        (tabuleiro[0][0].equals(xo[i]) && tabuleiro[1][0].equals(xo[i]) && tabuleiro[2][0].equals(xo[i])) ||
                        (tabuleiro[1][0].equals(xo[i]) && tabuleiro[1][1].equals(xo[i]) && tabuleiro[1][2].equals(xo[i])) ||
                        (tabuleiro[2][0].equals(xo[i]) && tabuleiro[2][1].equals(xo[i]) && tabuleiro[2][2].equals(xo[i])) ||
                        (tabuleiro[0][2].equals(xo[i]) && tabuleiro[1][1].equals(xo[i]) && tabuleiro[2][0].equals(xo[i])) ||
                        (tabuleiro[0][1].equals(xo[i]) && tabuleiro[1][1].equals(xo[i]) && tabuleiro[2][1].equals(xo[i])) ||
                        (tabuleiro[0][2].equals(xo[i]) && tabuleiro[1][2].equals(xo[i]) && tabuleiro[2][2].equals(xo[i]))) {
                    end = true;
                    System.out.println(xo[i]+" venceu!");
                    break;
                } else{
                    cont += 1;
                    if (cont == 9) {
                        end = true;
                        System.out.println("Empate");
                        break;
                    }
                }
            }
        }
    }
}
