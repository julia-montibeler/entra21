package classes;

public class XBurguer extends Lanche{
    public boolean aberto;

    @Override // sobre escrevendo o método para criar um comportamento reservado
    public void montarComanda() {
        super.montarComanda(); //chamar o comportamento genérico
        if (this.aberto) {
            System.out.println("Lanche Aberto");
        }
    }
    public XBurguer() {
        this.tipo = "X-Burguer";
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Hambúrguer");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Maionese");
    }
}
