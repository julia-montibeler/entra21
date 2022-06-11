package classes.lanches;

import java.util.Scanner;

public class MiniPizza extends Lanche {
    private boolean bordaRecheada;
    private String sabor;
    private String saborBorda;

    public MiniPizza() {
        this.setTipo("Mini Pizza");
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Molho de tomate");
        this.adicionarIngrediente("Mussarela");
    }


    public void adicionarSaborEIngredientes(String sabor) {

        this.setSabor(sabor);

        switch(sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("Provolone");
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;
            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Manjericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Ovo");
                this.adicionarIngrediente("Cebola");
                break;
        }
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("==== " + this.getTipo() + " - " + this.getSabor() + " ====" +
                "" +
                "" +
                "");
        if (this.isBordaRecheada()) {
            System.out.println("Borda Recheada (" + this.getSaborBorda() + ")");
        }
    }

    @Override
    public void mostrarDetalhesLanche(Scanner sc) {
        System.out.println("Escolha o sabor da pizza:");
        System.out.println("1 - 4 Queijos");
        System.out.println("2 - Calabresa");
        System.out.println("3 - Frango c/ catupiry");
        System.out.println("4 - Marguerita");
        System.out.println("5 - Portuguesa");
        int sabor = sc.nextInt();
        sc.nextLine();

        switch (sabor){
            case 1: this.adicionarSaborEIngredientes("4 queijos");
                break;
            case 2: this.adicionarSaborEIngredientes("Calabresa");
                break;
            case 3: this.adicionarSaborEIngredientes("Frango c/ catupiry");
                break;
            case 4: this.adicionarSaborEIngredientes("Marguerita");
                break;
            case 5: this.adicionarSaborEIngredientes("Portuguesa");
                break;
            default:
                System.err.println("Escolha um sabor válido");
        }

        System.out.print("Borda Recheada? (S/N) ");
        String aberto = sc.nextLine();
        this.setBordaRecheada(aberto.equalsIgnoreCase("S"));
        if (this.isBordaRecheada()){
            System.out.print("Digite o sabor da borda: ");
            this.setSaborBorda(sc.nextLine());
        }
    }

    //Getters e setters

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }
    public boolean isBordaRecheada() { //usar is ao invés de get para valor boolean
        return this.bordaRecheada;
    }

    public void setSaborBorda(String saborBorda) {
        this.saborBorda = saborBorda;
    }
    public String getSaborBorda() {
        return this.saborBorda;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getSabor() {
        return this.sabor;
    }


}
