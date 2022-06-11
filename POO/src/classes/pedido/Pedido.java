package classes.pedido;

import classes.lanches.*;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;
            }
        }
    }

    public void imprimirComanda(){
        for (Lanche lanche : this.getLanches()) {
            if (lanche != null) {
                lanche.mostrarDetalhesComanda();
                System.out.printf("Valor: R$%.2f\n", lanche.getValor());
                System.out.println("---- Ingredientes ----");
                for (String ingrediente : lanche.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }

            }
        }
        System.out.printf("==== Total: %.2f ====", calcularValorTotal());
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Lanche lanche : this.getLanches()) {
            if (lanche != null) {
                valorTotal += lanche.getValor();
            }
        }
        return valorTotal;
    }

    //getters e setters
    public Lanche[] getLanches() {
        return this.lanches;
    }
}
