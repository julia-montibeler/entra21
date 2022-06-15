import classes.cliente.Cliente;
import classes.lanches.*;
import classes.pedido.Pedido;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            Cliente cliente = new Cliente();
            System.out.print("Nome do cliente: ");
            cliente.setNome(sc.nextLine());

            while (true){
                cliente.getPedido().adicionarLanche(montarLanche());
                System.out.print("Deseja mais alguma coisa? (S/N): ");
                String escolha = sc.next();
                if (escolha.equalsIgnoreCase("n")) {
                    break;
                }
            }

            System.out.println("\nCliente: "+cliente.getNome());
            cliente.getPedido().imprimirComanda();
        }

    private static Lanche montarLanche() {
        System.out.println("1 - X-Salada");
        System.out.println("2 - X-Burger");
        System.out.println("3 - Hot Dog");
        System.out.println("4 - Misto Quente");
        System.out.println("5 - Mini Pizza");
        System.out.println("6 - Pizza");
        int escolha = sc.nextInt();
        sc.nextLine();

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

            case 6:
                lanche = new Pizza();
                break;

            default:
                System.err.println("Escolha um valor válido");
        }

        lanche.mostrarDetalhesLanche(sc);

        System.out.print("Informe o valor de "+lanche.getTipo()+": R$");
        lanche.setValor(sc.nextDouble());
        sc.nextLine();
        return lanche;
    }
}
