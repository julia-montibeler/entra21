package classes.lanches;

import java.util.Scanner;

public class XBurguer extends Sanduiche{
    private boolean aberto;
    public XBurguer() {
        this.setTipo("X-Burguer");
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Hambúrguer");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Maionese");
    }

    @Override
    public void mostrarDetalhesComanda() {
        super.mostrarDetalhesComanda();
        System.out.println("     Lanche Aberto");
    }

    @Override
    public void mostrarDetalhesLanche(Scanner sc) {
        System.out.print("Lanche aberto? (S/N) ");
        String aberto = sc.nextLine();
        this.setAberto(aberto.equalsIgnoreCase("S")); // if ternário: se a condição for T a variável recebe T
        if (this.isAberto()) { //((XBurguer) lanche) serve para dizer a classe do objeto
            this.adicionarIngrediente("Batata Frita");
        }
        super.mostrarDetalhesLanche(sc);
    }

    //Getters e setters

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean isAberto() {
        return this.aberto;
    }
}
