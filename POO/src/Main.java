import classes.ETipoLanche;
import classes.cliente.Cliente;
import classes.lanches.*;
import classes.pedido.Pedido;

import java.util.InputMismatchException;
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
        Lanche lanche = null;
        ETipoLanche escolha = escolherOpcao();
        switch (escolha) {
            case XS -> lanche = new XSalada(); //criando um objeto
            case XB -> lanche = new XBurguer();
            case HD -> lanche = new HotDog();
            case MQ -> lanche = new MistoQuente();
            case MP -> lanche = new MiniPizza();
            case P -> lanche = new Pizza();
            default -> System.err.println("Escolha um valor válido");
        }
        lanche.mostrarDetalhesLanche(sc);
        System.out.print("Informe o valor de "+lanche.getTipo()+": R$");
        lanche.setValor(sc.nextDouble());
        sc.nextLine();
        return lanche;
    }

    public static ETipoLanche escolherOpcao() {
        ETipoLanche escolha = null;
        System.out.println("");
        while (escolha == null) {
            try {
                for (ETipoLanche e : ETipoLanche.values()) {
                    System.out.println(e.getValorOpcao() + " - " + e.getDescricao());
                }
                return ETipoLanche.getByValorOpcao(sc.nextInt());
            } catch (RuntimeException e) {
                System.out.println("Selecione uma opcão válida");
            } finally {
                sc.nextLine();
            }
        }
        return escolha;
    }
}
