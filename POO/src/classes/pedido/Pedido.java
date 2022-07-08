package classes.pedido;

import classes.lanches.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    private LocalDateTime dataPedido = LocalDateTime.now();

    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public void imprimirComanda(){
        System.out.println("Data do pedido: "+dataPedido.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        for (Lanche lanche : this.getLanches()) {
            lanche.mostrarDetalhesComanda();
            System.out.printf("Valor: R$%.2f\n", lanche.getValor());
            System.out.println("---- Ingredientes ----");
            for (String ingrediente : lanche.getIngredientes()) {
                System.out.println(ingrediente);
            }
        }
        System.out.printf("==== Total: %.2f ====", calcularValorTotal());
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Lanche lanche : this.getLanches()) {
            valorTotal += lanche.getValor();
        }
        return valorTotal;
    }

    //getters e setters
    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }

    public void setLanches(ArrayList<Lanche> lanches) { 
        this.lanches = lanches;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }
}
