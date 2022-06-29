package classes;

public class Carta {
    Naipe naipe;
    ValorCarta num;

    @Override
    public String toString() {
        return num.getValorCarta() +" de "+ naipe.getNaipe();
    }

    //getters e setters


    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ValorCarta getNum() {
        return num;
    }

    public void setNum(ValorCarta num) {
        this.num = num;
    }
}


