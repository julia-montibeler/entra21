import java.util.Scanner;

public class exercicio_06_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            soma += n;
        }
        System.out.println(soma);
    }
}
