import classes.lanches.*;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            montarLanche();
        }

    private static void montarLanche() {
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

        //se for um instância de Sanduiche verifica se é uma instância de XBurguer, caso for, pergunta se é aberto, caso não, pede pelos adicionais
        if(lanche instanceof Sanduiche) {
            if(lanche instanceof XBurguer) {
                System.out.print("Lanche aberto? (S/N) ");
                String aberto = sc.nextLine();
                ((XBurguer) lanche).setAberto(aberto.equalsIgnoreCase("S")); // if ternário: se a condição for T a variável recebe T
                if (((XBurguer) lanche).isAberto()) { //((XBurguer) lanche) serve para dizer a classe do objeto
                    lanche.adicionarIngrediente("Batata Frita");
                }
            }
            System.out.print("Deseja colocar adicionais? (S/N)");
            String temAdicional = sc.nextLine();
            if (temAdicional.equalsIgnoreCase("S")){
                for (int i = 0; i < 10; i++) {
                    System.out.print("Adicional (digite enter para parar): ");
                    String adicional = sc.next();
                    if (adicional.equals("")) {
                        break;
                    }
                    ((Sanduiche) lanche).adicionarAdicionais(adicional);

                }
            }
        }

        //borda recheada somente para a pizza
        else {
            System.out.println("Escolha o sabor da pizza:");
            System.out.println("1 - 4 Queijos");
            System.out.println("2 - Calabresa");
            System.out.println("3 - Frango c/ catupiry");
            System.out.println("4 - Marguerita");
            System.out.println("5 - Portuguesa");
            int sabor = sc.nextInt();
            sc.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);

            switch (sabor){
                case 1: miniPizza.adicionarSaborEIngredientes("4 queijos");
                    break;
                case 2: miniPizza.adicionarSaborEIngredientes("Calabresa");
                    break;
                case 3: miniPizza.adicionarSaborEIngredientes("Frango c/ catupiry");
                    break;
                case 4: miniPizza.adicionarSaborEIngredientes("Marguerita");
                    break;
                case 5: miniPizza.adicionarSaborEIngredientes("Portuguesa");
                    break;
                default:
                    System.err.println("Escolha um sabor válido");
            }

            if (lanche instanceof Pizza) {
                System.out.println("Informe o tamanho da pizza: ");
                System.out.println("XS - broto");
                System.out.println("SM - pequena");
                System.out.println("MD - média");
                System.out.println("LG - grande");
                System.out.println("XL - Família");
                ((Pizza) lanche).setTamanho(sc.nextLine().toUpperCase());
            }

            System.out.print("Borda Recheada? (S/N) ");
            String aberto = sc.next();
            miniPizza.setBordaRecheada(aberto.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRecheada()){
                System.out.print("Digite o sabor da borda: ");
                ((MiniPizza) lanche).setSaborBorda(sc.next());
            }

        }

        System.out.print("Informe o valor de "+lanche.getTipo()+": R$");
        lanche.setValor(sc.nextDouble());
        lanche.montarComanda();
    }
}
