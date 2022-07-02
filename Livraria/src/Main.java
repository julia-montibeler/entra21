import classes.EMenuItem;
import classes.IMenu;
import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;
import classes.EMenu;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Estante e = new Estante(20);
        boolean sair = false;
        while (!sair) {
            EMenu opcao = (EMenu) escolherOpcao(null);
            switch (opcao) {
                case SAIR -> sair = true;
                case ADICIONAR_ITEM -> adicionar(e);
                case BUSCAR_ITEM -> buscarRetornar(e);
                case REMOVER_ITEM -> remover(e);
                case MOSTRAR_ITENS -> mostrar(e);
                default -> System.out.println("Opção não implementada!");
            }
        }
    }

    public static IMenu escolherOpcao(Item item) {
        IMenu escolha = null;
        if (item == null) {
            while (escolha == null) {
                for (EMenu e : EMenu.values()) {
                    System.out.println(e.getValorOpcao() + " - " + e.getDescricao());
                }
                escolha = EMenu.getByValorOpcao(sc.nextInt());
                sc.nextLine();
                if (escolha == null) {
                    System.out.println("Escolha uma opção válida!");
                }
            }
        } else {
            while (escolha == null) {
                for (EMenuItem e : EMenuItem.values()) {
                    System.out.println(e.getValorOpcao() + " - " + e.getDescricao());
                }
                escolha = EMenuItem.getByValorOpcao(sc.nextInt());
                sc.nextLine();
                if (escolha == null) {
                    System.out.println("Escolha uma opção válida!");
                }
            }
        }
        return escolha;
    }
    public static void remover(Estante e) {
        int posicao = -1;
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia! Não é possível remover itens");
        } else {
            while (posicao < 0 || posicao > e.quantidadeItens()) {
                System.out.print("Digite a posição do item a ser removido: ");
                posicao = sc.nextInt();
                sc.nextLine();
                if (posicao < 0 || posicao > e.quantidadeItens()) {
                    System.out.println("Digite uma posição válida");
                }
            }
            Item item = e.removerItem(posicao);
            System.out.println("O item " + item.getTitulo() + " foi removido");
        }
    }
    public static void buscarRetornar( Estante e) {
        System.out.print("Digite o nome do item: ");
        String nome = sc.nextLine();
        Item item = e.buscarItem(nome);
        if (item == null) {
            System.out.println("Não foi possível encontrar este item");
        } else {
            item.mostrarDetalhes();
            boolean sair = false;
            while (!sair) {
                EMenuItem opcao = (EMenuItem)escolherOpcao(item);
                switch (opcao) {
                    case VOLTAR -> sair = true;
                    case AVALIAR -> item.avaliar();
                    case VER_AVALIACOES -> mostrarAvaliacoes(item);
                    case MOSTRAR_DETALHES -> {
                        System.out.println("Título: "+item.getTitulo());
                        System.out.println("Gênero: "+item.getGenero());
                        item.mostrarDetalhes();
                        System.out.printf("Valor: R$%.2f",item.getValor());
                                                }
                    default -> System.out.println("Opção inválida");
                }
            }
        }
    }

    public static void mostrarAvaliacoes(Item item) {
        if (item.getAvaliacoes().isEmpty()) {
            System.out.println("Não há avaliações para esse item");
        } else {
            item.getAvaliacoes().forEach(a -> {
                System.out.println("Nome: " + a.getNome());
                System.out.println("Nota: " + a.getRating());
                System.out.println("Feedback: " + a.getFeedback());
            });
        }
        System.out.println("Nota geral: "+ item.getTotalRating());
    }
    public static void adicionar(Estante e) {
        int escolha = 0;
        if (e.estanteCheia()) {
            System.out.println("Sua estante está cheia! Não é possível adicionar mais itens.");
        }
        Item item = null;
        while (escolha < 1 || escolha > 2) {
            System.out.println("Selecione o tipo do item a ser adicionado");
            System.out.println("1 - Livro");
            System.out.println("2 - DVD");
            escolha = sc.nextInt();
            sc.nextLine();
            if (escolha < 1 || escolha > 2) {
                System.out.println("Digite uma opção válida!");
            }
        }
        switch(escolha) {
            case 1:
                item = new Livro();
                break;
            case 2:
                item = new DVD();
                break;
        }
        System.out.print("Título: ");
        item.setTitulo(sc.nextLine());
        System.out.print("Gênero: ");
        item.setGenero(sc.nextLine());
        System.out.print("Valor: ");
        item.setValor(sc.nextDouble());
        sc.nextLine();
        item.montarDetalhes();

        if (e.adicionarItem(item)) {
            System.out.println("Item adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar o item");
        }
    }

    public static void mostrar(Estante e) {
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia");
        } else {
            for (int i = 0; i < e.quantidadeItens(); i++) {
                Item item = e.getItens().get(i);
                System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
            }
            System.out.println("");
        }
    }
}
