import java.util.Scanner;

public class exercicio_10_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arvalap = "";
        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();

        arvalap = new StringBuilder(palavra).reverse().toString();


        if(palavra.equals(arvalap)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
