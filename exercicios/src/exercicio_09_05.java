import java.util.Scanner;

public class exercicio_09_05 {
    public static void main(String[] args) {
        exe02();
    }

    public static void exe01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int f = 1;
        if (n == 0) {
            f = 0;
        } else {
            for (int i = 0; i < n; i++) {
                f *= (n - i);
            }
        }
        System.out.println(f);
    }

    public static void exe02() {
        Scanner sc = new Scanner(System.in);
        int senha = 0;
        boolean senhat = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            if (senha == 91352) {
                System.out.println("Senha correta");senhat = true;
                System.out.println("Acesso permitido");
                break;
            } else {
                System.out.println("Senha incorreta");
                if (i == 2) {
                    System.out.println("Acesso negado");
                }

            }
        }

    }
}
