import java.util.Scanner;

public class codescope {
    public static void main(String[] args) {
        exe03();
    }

    public static void exe01() {
        //Level 1, Questão 11 (tabela ASCII)
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        int ascii = letra;
        if (ascii >= 64 && ascii <= 90) {
            System.out.println("Maiúscula");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Minúscula");
        } else {
            System.out.println("Inválido");
        }
    }

    public static void exe02() {
        //Level 1, Questão 11 (isUpperCase)
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        if(Character.isUpperCase(letra)) {
            System.out.println("Maiúscula");
        } else {
            System.out.println("Minúscula");
        }
    }
    public static void exe03() {
        //Level 2, Questão 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        if ((ano % 100 == 0) && (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }
    }


}