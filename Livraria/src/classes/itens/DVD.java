package classes.itens;

import java.util.Scanner;

public class DVD extends Item{
    private String diretor;
    private double duracao;
    private int anoLancamento;
    @Override
    public void montarDetalhes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diretor: ");
        this.setDiretor(sc.nextLine());
        System.out.print("Duração: ");
        this.setDuracao(sc.nextDouble());
        sc.nextLine();
        System.out.print("Ano de lançamento: ");
        this.setAnoLancamento(sc.nextInt());
        sc.nextLine();
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println(" - " + this.getTitulo() + " (" + this.getGenero() + "): " + this.getAnoLancamento() + " - "
                + this.getDiretor());
    }

    // GETTERS & SETTERS

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


}