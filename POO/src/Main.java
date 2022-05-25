import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - X-Salada");
        System.out.println("2 - X-Burger");
        System.out.println("3 - Hot Dog");
        System.out.println("4 - Misto Quente");
        System.out.println("5 - Mini Pizza (calabresa)");
        int escolha = sc.nextInt();

        while (!(escolha <= 5 && escolha >= 1)) {
            System.err.println("Escolha um valor válido!");
            System.out.println("1 - X-Salada");
            System.out.println("2 - X-Burger");
            System.out.println("3 - Hot Dog");
            System.out.println("4 - Misto Quente");
            System.out.println("5 - Mini Pizza (calabresa)");
            escolha = sc.nextInt();
        }

        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada(); //criando um objeto
                break;

            case 2:
                lanche = new XBurguer();
                break;

            case 3:
                lanche = new HotDog();
                break;

            case 4:
                lanche = new MistoQuente();
                break;
            case 5:
                lanche = new MiniPizza();
                break;
        }
        if(escolha == 1 || escolha == 2) {
            System.out.print("Lanche aberto? (S/N) ");
            String aberto = sc.next();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S"); // if ternário: se a condição for T a variável recebe T
            if (((XBurguer) lanche).aberto) { //((XBurguer) lanche) serve para dizer a classe do objeto
                lanche.adicionarIngrediente("Batata Frita");
            }
        }
        if(escolha == 5) {
            System.out.print("Borda Recheada? (S/N) ");
            String aberto = sc.next();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRecheada = aberto.equalsIgnoreCase("S"); // if ternário: se a condição for T a variável recebe T
            if(miniPizza.bordaRecheada){
                System.out.print("Digite o sabor da borda: ");
                ((MiniPizza) lanche).saborBorda = sc.next();
            }

        }

        System.out.print("Informe o valor de "+lanche.tipo+": R$");
        lanche.valor = sc.nextDouble();
        lanche.montarComanda();
    }
}
