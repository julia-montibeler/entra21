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
        System.out.println("============" +
                "" +
                "============");
        for (Lanche lanche : this.getLanches()) {
            if (lanche != null) {
                if (lanche instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) lanche);
                    System.out.println("---- " + mp.getTipo() + " - " + mp.getSabor() + " ----");
                    if (mp.isBordaRecheada()) {
                        System.out.println("Borda Recheada (" + mp.getSaborBorda() + ")");
                    }
                    if (lanche instanceof Pizza) {
                        System.out.println("Tamanho: " + ((Pizza) lanche).getTamanho());
                    }
                } else {
                    System.out.println("----- " + lanche.getTipo() + " -----");
                }
                if (lanche instanceof XBurguer) {
                    if (((XBurguer) lanche).isAberto()) {
                        System.out.println("     Lanche Aberto");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", lanche.getValor());
                System.out.println("---- Ingredientes ----");
                for (String ingrediente : lanche.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                if (lanche instanceof Sanduiche) {
                    if (((Sanduiche) lanche).getAdicionais()[0] != null) {
                        System.out.println("----- Adicionais -----");
                        for (String adicional : ((Sanduiche) lanche).getAdicionais()) {
                            if (adicional != null) {
                                System.out.println(adicional);
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("==== Total: %.2f ====",calcularValorTotal());
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
