package classes;

public class MistoQuente extends Lanche{
    public MistoQuente() {
        this.tipo = "Misto Quente";
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Tomate");
    }

}
