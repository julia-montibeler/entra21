package classes.lanches;

public class XBurguer extends Sanduiche{
    private boolean aberto;

    @Override // sobre escrevendo o método para criar um comportamento reservado
    public void montarComanda() {
        super.montarComanda(); //chamar o comportamento genérico
        if (this.aberto) {
            System.out.println("    Lanche Aberto");
        }
    }
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
