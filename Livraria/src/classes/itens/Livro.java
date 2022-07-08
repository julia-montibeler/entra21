package classes.itens;

import java.util.Scanner;

public class Livro extends Item{
    private String autor;
    private int qtdePaginas;
    private int anoPublicacao;
    private int edicao;

    @Override
    public void montarDetalhes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Autor: ");
        this.setAutor(sc.nextLine());
        System.out.print("Quantidade de páginas: ");
        this.setQtdePaginas(sc.nextInt());
        System.out.print("Ano de publicação: ");
        this.setAnoPublicacao(sc.nextInt());
        sc.nextLine();
        System.out.print("Edição: ");
        this.setEdicao(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("");
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Quantidade de páginas: "+this.getQtdePaginas());
        System.out.println("Ano publicação: "+this.getAnoPublicacao());
        System.out.println("Edição: "+this.getEdicao());
    }

    // GETTERS & SETTERS




    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }


}