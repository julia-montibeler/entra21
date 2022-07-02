package classes;

public class Carta {
    Naipe naipe;
    ValorCarta valor;
    int valorReal = 0;

    @Override
    public String toString() {
        return valor.getValorCarta() +" de "+ naipe.getNaipe();
    }

    //getters e setters
    public int getValorReal() {
        return valorReal;
    }
    public void setValorReal(int valorReal) {
        this.valorReal = valorReal;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }
}


