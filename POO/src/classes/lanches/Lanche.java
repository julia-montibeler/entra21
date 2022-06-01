package classes.lanches;

public abstract class Lanche {
    private String[] ingredientes = new String[10];
    private double valor;
    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        for (int i = 0; i < 10; i++) {
            if (this.ingredientes[i] == null) {
                this.ingredientes[i] = ingrediente;
                break;
            }
        }
    }
    public void montarComanda() {
        System.out.println("");
        if (this instanceof MiniPizza) {
            System.out.println("==== "+this.tipo+" - "+((MiniPizza)this).getSabor()+" ====");
        } else {
            System.out.println("======= " + this.tipo + " =======");
        }
        System.out.printf("Valor: R$%.2f\n", this.valor);
        System.out.println("----- Ingredientes -----");
        for (String ingrediente: this.ingredientes) {
            if (ingrediente != null) {
                System.out.println(ingrediente);
            }
        }
        System.out.println("======================");
    }

    //Getters e setters

    public String[] getIngredientes() {
        return this.ingredientes;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return this.valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
}
