import classes.guardados.Estante;
import classes.itens.DVD;
import classes.itens.Item;
import classes.itens.Livro;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.print("Digite a capacidade máxima da estante: ");
            Estante e = new Estante(sc.nextInt());
        }

    public static void adicionar(Estante e) {
        int escolha = 0;
        for (int i = 0; i < e.getCapMaxima(); i++) {
            Item item = null;
            System.out.println("Selecione o tipo do item a ser adicionado");
            System.out.println("1 - Livro");
            System.out.println("2 - DVD");
            escolha = sc.nextInt();
            sc.nextLine();

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

            if (item instanceof Livro) {
                System.out.print("Autor: ");
                ((Livro) item).setAutor(sc.next());
                System.out.print("Quantidade de páginas: ");
                ((Livro) item).setQtdePaginas(sc.nextInt());
                System.out.print("Ano de publicação: ");
                ((Livro) item).setAnoPublicacao(sc.nextInt());
                sc.nextLine();
                System.out.print("Edição: ");
                ((Livro) item).setEdicao(sc.nextInt());
                sc.nextLine();
            }
            if (item instanceof DVD) {
                System.out.print("Diretor: ");
                ((DVD) item).setDiretor(sc.next());
                System.out.print("Duração: ");
                ((DVD) item).setDuracao(sc.nextDouble());
                sc.nextLine();
                System.out.print("Ano de lançamento: ");
                ((DVD) item).setAnoLancamento(sc.nextInt());
                sc.nextLine();
            }

            e.adicionarItem(item);

            System.out.println("");
            System.out.println("Itens na estante: "+e.quantidadeItens());

            for (int b = 0; b < e.getCapMaxima(); b++) {
                if (e.getItens()[b] != null) {
                    if (e.getItens()[b] instanceof Livro) {
                        System.out.println(e.getItens()[b].getTitulo() + " (" + e.getItens()[b].getGenero() + "): " + ((Livro) e.getItens()[b]).getAnoPublicacao() + " - "
                                +((Livro) e.getItens()[b]).getAutor());
                    } else if (e.getItens()[b] instanceof DVD) {
                        System.out.println(e.getItens()[b].getTitulo() + " (" + e.getItens()[b].getGenero() + "): " + ((DVD) e.getItens()[b]).getAnoLancamento() + " - "
                                +((DVD) e.getItens()[b]).getDiretor());                    }
                }
            }
            System.out.println("");

            System.out.println("Deseja adicionar mais um item? (S/N) ");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

}
