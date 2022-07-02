package classes.guardados;

import classes.itens.Item;

import java.util.ArrayList;
import java.util.Locale;

public class Estante {
    private int capMaxima;
    private ArrayList<Item> itens = new ArrayList<>();

    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        return this.itens.size();
    }

    public Item buscarItem(String titulo) {
        return this.itens.stream().filter(
                item -> titulo.equalsIgnoreCase(item.getTitulo())).findFirst().orElse(null);
    }

    public boolean adicionarItem(Item item) {
        if (!estanteCheia()) {
            this.getItens().add(item);
            return true;
        }
        return false;
    }

    public Item removerItem(int posicao) {
        return this.itens.remove(posicao);
    }

    // GETTERS & SETTERS

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList itens) {
        this.itens = itens;
    }
}
