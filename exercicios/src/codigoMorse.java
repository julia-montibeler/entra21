import java.util.Scanner;

public class codigoMorse {
    public static void m




    ain(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1-Traduzir de Português para Morse");
        System.out.println("2-Traduzir de Morse para Português");
        int n = in.nextInt();
        if (n==1){
            codigo1();
        }else if (n==2) {
            codigo2();
        }

    }
    public static void codigo1(){
        Scanner in = new Scanner(System.in);
        char letra = ' ';
        String letraMorse = " ";
        String mensagemMorse = "";

        System.out.print("Digite uma mensagem: ");
        String mensagem = in.nextLine().toLowerCase();

        for (int i = 0; i < mensagem.length(); i++) {
            letra = mensagem.charAt(i);

            switch (letra) {
                case 'a':
                    letraMorse = ".-";
                    break;
                case 'b':
                    letraMorse = "-...";
                    break;
                case 'c':
                    letraMorse = "-.-.";
                    break;
                case 'd':
                    letraMorse = "-..";
                    break;
                case 'e':
                    letraMorse = ".";
                    break;
                case 'f':
                    letraMorse = "..-.";
                    break;
                case 'g':
                    letraMorse = "--.";
                    break;
                case 'h':
                    letraMorse = "....";
                    break;
                case 'i':
                    letraMorse = "..";
                    break;
                case 'j':
                    letraMorse = ".---";
                    break;
                case 'k':
                    letraMorse = "-.-";
                    break;
                case 'l':
                    letraMorse = ".-..";
                    break;
                case 'm':
                    letraMorse = "--";
                    break;
                case 'n':
                    letraMorse = "-.";
                    break;
                case 'o':
                    letraMorse = "---";
                    break;
                case 'p':
                    letraMorse = ".--.";
                    break;
                case 'q':
                    letraMorse = "--.-";
                    break;
                case 'r':
                    letraMorse = ".-.";
                    break;
                case 's':
                    letraMorse = "...";
                    break;
                case 't':
                    letraMorse = "-";
                    break;
                case 'u':
                    letraMorse = "..-";
                    break;
                case 'v':
                    letraMorse = "...-";
                    break;
                case 'w':
                    letraMorse = ".--";
                    break;
                case 'x':
                    letraMorse = "-..-";
                    break;
                case 'y':
                    letraMorse = "-.--";
                    break;
                case 'z':
                    letraMorse = "--..";
                    break;
                case '1':
                    letraMorse = ".----";
                    break;
                case '2':
                    letraMorse = "..---";
                    break;
                case '3':
                    letraMorse = "...--";
                    break;
                case '4':
                    letraMorse = "....-";
                    break;
                case '5':
                    letraMorse = ".....";
                    break;
                case '6':
                    letraMorse = "-....";
                    break;
                case '7':
                    letraMorse = "--...";
                    break;
                case '8':
                    letraMorse = "---..";
                    break;
                case '9':
                    letraMorse = "----.";
                    break;
                case '0':
                    letraMorse = "-----";
                    break;
                case ' ':
                    letraMorse = "*";
                case '.':
                    letraMorse = ".-.-.-";
                    break;
                case ',':
                    letraMorse = "--..--";
                    break;
                case '?':
                    letraMorse = "..--..";
                    break;
                case '!':
                    letraMorse = "-.-.--";
                    break;
                case ':':
                    letraMorse = "---...";
                    break;
                case ';':
                    letraMorse = "-.-.-";
                    break;
                case '\'':
                    letraMorse = ".----.";
                    break;
                case '"':
                    letraMorse = ".-..-.";
                    break;
                case '=':
                    letraMorse = "-...-";
                    break;
                case '+':
                    letraMorse = ".-.-.";
                    break;
                case '-':
                    letraMorse = "-....-";
                    break;
                case '/':
                    letraMorse = "-..-.";
                    break;
                case '(':
                    letraMorse = "-.--.";
                    break;
                case ')':
                    letraMorse = "-.--.-";
                    break;
            }
            mensagemMorse += letraMorse + "|";
        }
        System.out.println(mensagemMorse);
    }
    public static void codigo2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String mensagem = in.nextLine();
        String[] letraMorse = mensagem.split("\\|");
        String letra = "";
        String mensagemtraduzida = "";

        for (int i = 0; i < letraMorse.length; i++) {



            switch (letraMorse[i]) {
                case ".-":
                    letra = "a";
                    break;
                case "-...":
                    letra = "b";
                    break;
                case "-.-.":
                    letra = "c";
                    break;
                case "-..":
                    letra = "d";
                    break;
                case ".":
                    letra = "e";
                    break;
                case "..-.":
                    letra = "f";
                    break;
                case "--.":
                    letra = "g";
                    break;
                case "....":
                    letra = "h";
                    break;
                case "..":
                    letra = "i";
                    break;
                case ".---":
                    letra = "j";
                    break;
                case "-.-":
                    letra = "k";
                    break;
                case ".-..":
                    letra = "l";
                    break;
                case "--":
                    letra = "m";
                    break;
                case "-.":
                    letra = "n";
                    break;
                case "---":
                    letra = "o";
                    break;
                case ".--.":
                    letra = "p";
                    break;
                case "--.-":
                    letra = "q";
                    break;
                case ".-.":
                    letra = "r";
                    break;
                case "...":
                    letra = "s";
                    break;
                case "-":
                    letra = "t";
                    break;
                case "..-":
                    letra = "u";
                    break;
                case "...-":
                    letra = "v";
                    break;
                case ".--":
                    letra = "w";
                    break;
                case "-..-":
                    letra = "x";
                    break;
                case "-.--":
                    letra = "y";
                    break;
                case "--..":
                    letra = "z";
                    break;
                case ".----":
                    letra = "1";
                    break;
                case "..---":
                    letra = "2";
                    break;
                case "...--":
                    letra = "3";
                    break;
                case "....-":
                    letra = "4";
                    break;
                case ".....":
                    letra = "5";
                    break;
                case "-....":
                    letra = "6";
                    break;
                case "--...":
                    letra = "7";
                    break;
                case "---..":
                    letra = "8";
                    break;
                case "----.":
                    letra = "9";
                    break;
                case "-----":
                    letra = "0";
                    break;
                case "*":
                    letra = " ";
                    break;
                case ".-.-.-":
                    letra = ".";
                    break;
                case "--..--":
                    letra = ",";
                    break;
                case "..--..":
                    letra = "?";
                    break;
                case "-.-.--":
                    letra = "!";
                    break;
                case "---...":
                    letra = ":";
                    break;
                case "-.-.-":
                    letra = ";";
                    break;
                case ".----.":
                    letra = "'";
                    break;
                case ".-..-.":
                    letra = "\"";
                    break;
                case "-...-":
                    letra = "=";
                    break;
                case ".-.-.":
                    letra = "+";
                    break;
                case "-....-":
                    letra= "-";
                    break;
                case "-..-.":
                    letra = "/";
                    break;
                case "-.--.":
                    letra = "(";
                    break;
                case "-.--.-":
                    letra = ")";
                    break;
            }
            mensagemtraduzida+=letra;
        }
        System.out.println(mensagemtraduzida);
    }
}
