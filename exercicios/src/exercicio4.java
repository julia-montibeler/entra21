import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int cont = 0;
        while (n != 0) {
            System.out.print("Número: ");
            n = sc.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(n+" x "+i+" = "+n * i);
            }
        }
    }

}
