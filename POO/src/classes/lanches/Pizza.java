package classes.lanches;

import java.util.Scanner;

public class Pizza extends MiniPizza {
    private String tamanho;

    public Pizza() {
        this.setTipo("Pizza");
    }

    @Override
    public void mostrarDetalhesComanda() {
        super.mostrarDetalhesComanda();
        System.out.println("Tamanho: " + this.getTamanho());
    }

    @Override
    public void mostrarDetalhesLanche(Scanner sc) {
        super.mostrarDetalhesLanche(sc);
        System.out.println("Informe o tamanho da pizza: ");
        System.out.println("XS - broto");
        System.out.println("SM - pequena");
        System.out.println("MD - média");
        System.out.println("LG - grande");
        System.out.println("XL - Família");
        this.setTamanho(sc.nextLine().toUpperCase());
    }

    //Getters e setters
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public String getTamanho() {
        return this.tamanho;
    }
}
