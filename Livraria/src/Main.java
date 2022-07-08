import classes.EMenuItem;
import classes.IMenu;
import classes.Loja;
import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;
import classes.EMenu;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Loja loja = new Loja();
    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            try {
                EMenu opcao = (EMenu) escolherOpcao(null);
                switch (opcao) {
                    case SAIR -> sair = true;
                    case ADICIONAR_ITEM -> adicionar();
                    case BUSCAR_ITEM -> buscarRetornar();
                    case REMOVER_ITEM -> remover();
                    case MOSTRAR_ITENS -> mostrar();
                    case ADICIONAR_ESTANTE -> adicionarEstante();
                    default -> System.out.println("Opção não implementada!");
                }
            } catch (Exception e) {
                if (sc.hasNext()) {
                    sc.nextLine();
                }
                System.out.println("Aconteceu um erro!");
                e.printStackTrace();
            }
        }
    }

    private static void adicionarEstante() {
        while (true) {
            System.out.print("Informe um identificador: ");
            String id = sc.nextLine().toLowerCase();
            if (loja.getEstantes().containsKey(id)) {
                System.out.println("Identificador já utilizado!");
            } else {
                System.out.print("Informe a capacidade máxima da estante: ");
                loja.getEstantes().put(id, new Estante(sc.nextInt()));
                sc.nextLine();
                break;
            }
        }
    }

    public static IMenu escolherOpcao(Item item) {
        IMenu escolha = null;
        System.out.println("");
            while (escolha == null) {
                try {
                    if (item != null) {
                        for (EMenu e : EMenu.values()) {
                            System.out.println(e.getValorOpcao() + " - " + e.getDescricao());
                        }
                        return EMenu.getByValorOpcao(sc.nextInt());
                    } else {
                        System.out.println("Selecione uma opção");
                        for (EMenuItem e : EMenuItem.values()) {
                            System.out.println(e.getValorOpcao() + " - " + e.getDescricao());
                        }
                        return EMenuItem.getByValorOpcao(sc.nextInt());
                    }
                } catch (RuntimeException e) {
                    System.out.println("Selecione uma opcão válida");
                } finally {
                    sc.nextLine();
            }

        }
        return escolha;
    }
    public static void remover() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        } else {
            Estante e = buscarEstante();
            if (e.quantidadeItens() == 0) {
                System.err.println("Não é possível remover itens de uma estante vazia!");
            } else {
                int posicao = -1;
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
    }
    public static void buscarRetornar() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        } else {
            System.out.print("Informe o título para busca: ");
            String titulo = sc.nextLine();
            Item item = null;
            for (Estante e : loja.getEstantes().values()) {
                item = e.buscarItem(titulo);
                if (item != null) {
                    break;
                }
            }
            if (item == null) {
                System.err.println("O título buscado não existe na loja!");
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
                            System.out.println("Título: " + item.getTitulo());
                            System.out.println("Gênero: " + item.getGenero());
                            item.mostrarDetalhes();
                            System.out.printf("Valor: R$%.2f \n", item.getValor());
                        }
                        default -> System.out.println("Opção inválida");
                    }
                }
            }
        }
    }

    public static Estante buscarEstante() {
        Estante e = null;
        while(e == null) {
            System.out.print("Informe o identificador da estante: ");
            e = loja.getEstantes().get(sc.nextLine().toLowerCase());
            if (e == null) {
                System.out.println("Estante não encontrada!");
            }
        }
        return e;
    }

    public static void mostrarAvaliacoes(Item item) {
        if (item.getAvaliacoes().isEmpty()) {
            System.out.println("Não há avaliações para esse item");
        } else {
            item.getAvaliacoes().forEach(a -> {
                System.out.println("Data: "+a.getDataAvaliacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                System.out.println("Nome: " + a.getNome());
                System.out.println("Nota: " + a.getRating());
                System.out.println("Feedback: " + a.getFeedback());
            });
        }
        System.out.println("Nota geral: "+ item.getTotalRating());
    }
    public static void adicionar() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        } else {
            Estante e = buscarEstante();
            if (e.estanteCheia()) {
                System.err.println("Sua estante está cheia! Não é possível adicionar mais itens!");
            } else {
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
                switch (escolha) {
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
        }
    }

    public static void mostrar() {
        if (loja.getEstantes().isEmpty()) {
            System.out.println("Sem estantes!");
        }
        for (String key: loja.getEstantes().keySet()) {
            Estante e = loja.getEstantes().get(key);
            System.out.println("Estante: '"+key+"'");
            if (e.quantidadeItens() == 0) {
                System.out.println("Estante vazia");
            } else {
                for (int i = 0; i < e.quantidadeItens(); i++) {
                    Item item = e.getItens().get(i);
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
        }
    }
}
