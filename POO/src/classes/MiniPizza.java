package classes;

public class MiniPizza extends Lanche{

    public boolean bordaRecheada;

    public String saborBorda;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Molho de tomate");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Cebola");
        this.adicionarIngrediente("Orégano");
        this.tipo = "Mini Pizza (Calabresa)";
    }
    @Override // sobre escrevendo o método para criar um comportamento reservado
    public void montarComanda() {
        super.montarComanda(); //chamar o comportamento genérico
        if (this.bordaRecheada) {
            System.out.println("Borda Recheada ("+this.saborBorda+")");
        }
    }
}
