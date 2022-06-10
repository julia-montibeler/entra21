package classes.lanches;

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

    //Getters e setters

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean isAberto() {
        return this.aberto;
    }
}
