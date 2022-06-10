package classes.lanches;

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
