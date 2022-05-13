import java.util.Locale;
import java.util.Scanner;

public class forca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Regras");
        System.out.println("1. Apenas palavras sem acentos serão aceitas como palavra secreta;");
        System.out.println("2. Não são aceitas frases;");
        System.out.println("3. Não digitar números.");
        System.out.println(" ");
        System.out.println("Como jogar");
        System.out.println("1. Um jogador digita a palavra secreta sem os demais jogadores verem");
        System.out.println("2. A seguir, cada um tenta acertar uma letra, há 6 tentativas");
        System.out.println(" ");

        System.out.print("Palavra secreta: ");
        String palavra = sc.nextLine().toLowerCase();

        //verificando se é frase e pedindo uma palavra caso for
        while (true) {
            if(palavra.contains(" ")) {
                System.out.println("Você digitou uma frase");
                System.out.print("Digite uma palavra: ");
                palavra = sc.nextLine();
            } else {
                break;
            }
        }

        //limpar o console
        for (int t = 0; t < 50; t++) {
            System.out.println(" ");
        }

        int cont = 0; //contador de quantas vezes repetiu o código
        char [] letras = new char[palavra.length()]; //vetor com a cada letra da palavra, para comparação
        char[] espacos = new char[palavra.length()]; //vetor com as letras corretas, é exibida para o usuário
        String letraString = ""; // letra digitada pelo usuário
        char letra = ' '; // letra convertida para char
        int contRepetidas = 0; //Contador para verificar se a letra já foi digitada
        int errosLetras = 0;
        int erros = 0;
        String palavraFinal = ""; //vetor espacos transformado em String para comparar com a palavra inicial
        char[] letraDigitadas = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};

        String[][] forca = {
                {"|","_","_","_","_","_"},
                {"|"," "," "," "," "," "},
                {"|"," "," "," "," "," "},
                {"|"," "," "," "," "," "},
                {"|"," "," "," "," "," "},};

        //adicionar _ a todas as posições do array espaços, para ela ter o mesmo tamanho da palavra
        for (int i = 0; i < palavra.length(); i++) {
            espacos[i] = '_';
        }

        //adicionar as letras de palavra para o array letra
        for (int j = 0; j < palavra.length(); j++) {
            letras[j] = palavra.charAt(j);
        }


        while (true) {
            cont += 1;
            //print da forca
            for (int n = 0; n < forca.length;n++) {
                for (int o = 0; o < forca[n].length;o++) {
                    if (o == 5) {
                        System.out.println(forca[n][o]);
                    } else {
                        System.out.print(forca[n][o]);
                    }
                }
            }

            //print das letras já descobertas
            for (int l = 0; l < espacos.length;l++) {
                if (l == (espacos.length - 1)) {
                    System.out.print(espacos[l] + "\n");
                } else {
                    System.out.print(espacos[l]);
                }
            }

            //print das letras digitadas
            for (int u = 0; u < letraDigitadas.length; u++) {
                System.out.print(letraDigitadas[u]+" ");
            }
            System.out.println(" ");
            System.out.println("Digite uma letra: ");
            letraString = sc.next().toLowerCase();
            letra = letraString.charAt(0);


            //verificar se é uma letra e se já foi digitada
            while (true) {
                for (int m = 0; m < letraDigitadas.length; m++) {
                    if (letra == letraDigitadas[m]) {
                        contRepetidas += 1;
                    }
                }

                if (contRepetidas >= 1 || letraString.length() > 1) {
                    System.out.print("Digite uma letra válida: ");
                    letraString = sc.next().toLowerCase();
                    letra = letraString.charAt(0);
                    contRepetidas = 0;
                } else {
                    break;
                }
            }
            letraDigitadas[cont] = letra;

            //verificando se a letra está na palavra
            for (int k = 0; k < palavra.length(); k++) {
                if (letra == letras[k]) {
                    espacos[k] = letra;
                } else {
                    errosLetras += 1; //contando quantas letras são diferentes da letra digitada
                }
            }

            //se o número de letras diferentes for igual ao comprimento da palavra, então soma 1 aos erros
            if (errosLetras == palavra.length()) {
                erros += 1;
            }

            //zerar os erros para não interferir na próxima repetição
            errosLetras = 0;

            //adicionando o corpo do boneco a cada erro
            if (erros == 1) {
                forca[1][4] = "O";
            } else if (erros == 2) {
                forca[2][4] = "|";
            } else if (erros == 3) {
                forca[2][3] = "/";
            } else if (erros == 4) {
                forca[2][5] = "\\";
            } else if (erros == 5) {
                forca[3][3] = "/";
            }else if (erros == 6) {
                forca[3][5] = "\\";
            }

            //tranformando o array espacos em uma String, para comparar com a palavra inicial
            for (int s = 0; s < palavra.length(); s++) {
                palavraFinal += espacos[s];
            }

            for (int t = 0; t < 50; t++) {
                System.out.println(" ");
            }

            //Verificar se ganhou ou perdeu
            if (palavra.equals(palavraFinal)) {
                //print da forca
                for (int n = 0; n < forca.length;n++) {
                    for (int o = 0; o < forca[n].length;o++) {
                        if (o == 5) {
                            System.out.println(forca[n][o]);
                        } else {
                            System.out.print(forca[n][o]);
                        }
                    }
                }

                //print das letras já descobertas
                for (int l = 0; l < espacos.length;l++) {
                    if (l == (espacos.length - 1)) {
                        System.out.print(espacos[l] + "\n");
                    } else {
                        System.out.print(espacos[l]);
                    }
                }
                System.out.println("Você ganhou! :)");
                break;
            } else if (erros == 6) {
                //print da forca
                for (int n = 0; n < forca.length;n++) {
                    for (int o = 0; o < forca[n].length;o++) {
                        if (o == 5) {
                            System.out.println(forca[n][o]);
                        } else {
                            System.out.print(forca[n][o]);
                        }
                    }
                }

                //print das letras já descobertas
                for (int l = 0; l < espacos.length;l++) {
                    if (l == (espacos.length - 1)) {
                        System.out.print(espacos[l] + "\n");
                    } else {
                        System.out.print(espacos[l]);
                    }
                }
                System.out.println("A palavra era "+palavra);
                System.out.println("Você perdeu :(");
                break;
            }

            //deixar a palavraFinal em branco para não interferir no próximo loop
            palavraFinal = "";
        }
    }
}