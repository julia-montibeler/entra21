package classes;

public class HotDog extends Lanche{
    public HotDog() {
        this.tipo = "Hot Dog";
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Batata Palha");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Queijo Cheddar");
    }

}
