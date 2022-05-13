import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de palavras da lista: ");
        int n = sc.nextInt();
        String [] lista = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a palavra: ");
            lista[i] = sc.next();
        }
        for (int i = 0; i < lista.length; i++) {
            if (i == 0) {
                System.out.print(lista[i]);
            } else {
                System.out.println(", " + lista[i]);
            }
        }

    }
}
