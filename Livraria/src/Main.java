import classes.avaliacao.Avaliacao;
import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            Estante e = new Estante(20);
            boolean sair = false;
            int escolha = 1;
            while (escolha != 0) {
                System.out.println("1 - Adicionar item");
                System.out.println("2 - Buscar item");
                System.out.println("3 - Remover item");
                System.out.println("4 - Mostrar itens da estante");
                System.out.println("0 - Sair");
                escolha = sc.nextInt();
                sc.nextLine();

                switch (escolha) {
                    case 1:
                        adicionar(e);
                        break;
                    case 2:
                        buscarRetornar(e);
                        break;
                    case 3:
                        remover(e);
                        break;
                    case 4:
                        mostrar(e);
                        break;
                    default:
                        System.out.println("Digite uma escolha válida!");
                }
            }
        }


        public static void remover(Estante e) {
            int posicao = 0;
            if (e.quantidadeItens() == 0) {
                System.out.println("Estante vazia! Não é possível remover itens");
            } else {
                System.out.print("Digite a posição do item a ser removido: ");
                posicao = sc.nextInt();
                sc.nextLine();
                Item item = e.removerItem(posicao);
                if (item != null) {
                    System.out.println("O item " + item.getTitulo() + " foi removido");
                } else {
                    System.out.println("O item não foi encontrado");
                }
            }
        }
        public static void buscarRetornar( Estante e) {
            System.out.print("Digite o nome do item: ");
            String nome = sc.nextLine();
            int escolha = -1;
            Item item = e.buscarItem(nome);
            if (item == null) {
                System.out.println("Não foi possível encontrar este item");
            } else {

                if (item instanceof Livro) {
                    System.out.println(item.getTitulo() + " (" + item.getGenero() + "): " + ((Livro) item).getAnoPublicacao() + " - "
                            +((Livro) item).getAutor());
                } else if (item instanceof DVD) {
                    System.out.println(item.getTitulo() + " (" + item.getGenero() + "): " + ((DVD) item).getAnoLancamento() + " - "
                            +((DVD) item).getDiretor());
                }
                while (escolha < 0 || escolha > 2) {
                    System.out.println("1 - Avaliar");
                    System.out.println("2 - Ver avaliações");
                    System.out.println("0 - sair");
                    escolha = sc.nextInt();
                    sc.nextLine();
                }

                switch (escolha) {
                    case 1:
                        item.avaliar();
                        System.out.println("Item avaliado com sucesso!");
                        break;
                    case 2:
                        for (Avaliacao a : item.getAvaliacoes()) {
                            if (a != null) {
                                System.out.println("Nome: "+a.getNome());
                                System.out.println("Nota: "+a.getRating());
                                if (a.getFeedback() != null) {
                                    System.out.println("Feedback: "+a.getFeedback());
                                }

                            }
                        }
                        break;
                }
            }
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

            if (item instanceof Livro) {
                Livro l = ((Livro) item);
                System.out.print("Autor: ");
                l.setAutor(sc.nextLine());
                System.out.print("Quantidade de páginas: ");
                l.setQtdePaginas(sc.nextInt());
                System.out.print("Ano de publicação: ");
                l.setAnoPublicacao(sc.nextInt());
                sc.nextLine();
                System.out.print("Edição: ");
                l.setEdicao(sc.nextInt());
                sc.nextLine();
            }
            if (item instanceof DVD) {
                DVD dvd = ((DVD) item);
                System.out.print("Diretor: ");
                dvd.setDiretor(sc.nextLine());
                System.out.print("Duração: ");
                dvd.setDuracao(sc.nextDouble());
                sc.nextLine();
                System.out.print("Ano de lançamento: ");
                dvd.setAnoLancamento(sc.nextInt());
                sc.nextLine();
            }

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
            System.out.println("");
            for (int b = 0; b < e.getCapMaxima(); b++) {
                if (e.getItens()[b] != null) {
                    if (e.getItens()[b] instanceof Livro) {
                        System.out.println(b + " - " + e.getItens()[b].getTitulo() + " (" + e.getItens()[b].getGenero() + "): " + ((Livro) e.getItens()[b]).getAnoPublicacao() + " - "
                                + ((Livro) e.getItens()[b]).getAutor());
                    } else if (e.getItens()[b] instanceof DVD) {
                        System.out.println(b + " - " + e.getItens()[b].getTitulo() + " (" + e.getItens()[b].getGenero() + "): " + ((DVD) e.getItens()[b]).getAnoLancamento() + " - "
                                + ((DVD) e.getItens()[b]).getDiretor());
                    }
                }
            }
            System.out.println("");
        }
    }

}
