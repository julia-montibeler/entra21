import classes.HotDog;
import classes.MistoQuente;
import classes.XBurguer;
import classes.XSalada;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - X-Salada");
        System.out.println("2 - X-Burger");
        System.out.println("3 - Hot Dog");
        System.out.println("4 - Misto Quente");
        int escolha = sc.nextInt();

        while (!(escolha <= 4 && escolha >= 1)) {
            System.err.println("Escolha um valor válido!");
            System.out.println("1 - X-Salada");
            System.out.println("2 - X-Burger");
            System.out.println("3 - Hot Dog");
            System.out.println("4 - Misto Quente");
            escolha = sc.nextInt();
        }

        switch (escolha) {
            case 1:
                XSalada lanche = new XSalada();

                System.out.print("Informe o valor do X-Salada: R$");
                lanche.valor = sc.nextDouble();

                System.out.print("Lanche aberto? (S/N) ");
                String aberto = sc.next();
                lanche.aberto = aberto.equalsIgnoreCase("S"); // if ternário: se a condição for T a variável recebe T
                if (lanche.aberto) {
                    lanche.adicionarIngrediente("Batata Frita");
                }

                lanche.montarComanda();
                break;

            case 2:
                XBurguer lanche2 = new XBurguer();

                System.out.print("Informe o valor do X-Burguer: R$");
                lanche2.valor = sc.nextDouble();

                System.out.print("Lanche aberto? (S/N) ");
                String aberto2 = sc.next();
                lanche2.aberto = aberto2.equalsIgnoreCase("S"); // if ternário: se a condição for T a variável recebe T
                if (lanche2.aberto) {
                    lanche2.adicionarIngrediente("Batata Frita");
                }

                lanche2.montarComanda();
                break;

            case 3:
                HotDog lanche3 = new HotDog();

                System.out.print("Informe o valor do Hot Dog: R$");
                lanche3.valor = sc.nextDouble();

                lanche3.montarComanda();
                break;

            case 4:
                MistoQuente lanche4 = new MistoQuente();

                System.out.print("Informe o valor do Misto Quente: R$");
                lanche4.valor = sc.nextDouble();

                lanche4.montarComanda();
                break;
        }
    }
}
