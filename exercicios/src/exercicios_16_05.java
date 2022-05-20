import java.util.Random;
import java.util.Scanner;

public class exercicios_16_05 {
    public static Scanner sc = new Scanner(System.in); //declarar scanner global

    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        System.out.print("Informe um número: ");
        String numero = String.valueOf(sc.nextInt()); //String.valueOf converte o valor para String
        String inverso = "";
        for(int i = numero.length() - 1; i >= 0 ; i--) {
            inverso += String.valueOf(numero.charAt(i));
        }
        System.out.println(inverso);
    }

    public static void exe02() {
        int maior = 0, menor = 0;
        int numero = 1;
        while (numero != 0) {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
            if (numero == 0) {
                break;}
            if (menor == 0) {
                menor = numero;}
            if(numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;}
        }
        System.out.println("Maior número: "+maior);
        System.out.println("Menor número: "+menor);
    }

    public static void exe03() {
        Random r = new Random();
        int aleatorio = r.nextInt();

        while (true) {
            System.out.println("Adivinhe o número: ");
            int numero = sc.nextInt();
            if (numero == aleatorio) {
                System.out.println("Você acertou!");
                break;
            } else if (numero < aleatorio) {
                System.out.println("Número muito baixo, tente de novo");
            } else {
                System.out.println("Número muito alto, tente de novo");
            }
        }
    }

    public static void exe04() {
        for (int i = 0; i < 4; i++) {
            System.out.print("\n");
            for (int j = 0; j < 10; j++ ) {
                System.out.print('*');
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("\n");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                if (i+j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 9; j++) {
                if (((i+j) < 4) || (j-i > 4)) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 9; j++) {
                if (((i+j) < 4) || (j-i > 4)) {
                    System.out.print(" ");
                }else {
                    System.out.print(i+1);
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 9; j++) {
                if (((i+j) < 4) || (j-i > 4)) {
                    System.out.print(" ");
                } else if (j <= 4) {
                    System.out.print(Math.abs(j-5));
                } else {
                    System.out.print(j-3);
                }
            }
        }
    }
}
