import java.util.Scanner;
public class exercicios {
    public static void main(String[] args) {
        exe23();
    }
    public static void exe23() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        int ascii = letra;
        if (ascii >= 40 && ascii <= 90) {
            System.out.println("Maiúscula");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Minúscula");
        } else {
            System.out.println("Caractere inválido");
        }
    }
}
