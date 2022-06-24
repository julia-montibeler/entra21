import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exe3();
    }

    public static void ex1() {
        int n = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            arr.add(n);
        }

        System.out.println("Valores informados");
        System.out.println(arr);
    }

    public static void ex2() {
        int n = 0;
        int somaPar = 0;
        int somaImpar = 0;
        double somaTotal = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if ((n % 2) == 0) {
                somaPar += n;
            } else {
                somaImpar += n;
            }
            arr.add(n);
            somaTotal += n;

        }

        double media = somaTotal / arr.size();

        System.out.println(arr);
        System.out.println("Soma dos pares: "+somaPar);
        System.out.println("Soma dos ímpares: "+somaImpar);
        System.out.printf("Média: %.1f",media);
    }

    public static void exe3() {
        ArrayList<String> palavras = new ArrayList<>();
        String palavra = "";
        while (true) {
            System.out.print("Palavra (digite sair para parar): ");
            palavra = sc.nextLine();
            if (palavra.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(palavra);
        }

        System.out.print("Digite um inteiro: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < n) {
                palavras.remove(palavras.get(i));
                i--;
            }
        }

        System.out.println(palavras);
    }
}
