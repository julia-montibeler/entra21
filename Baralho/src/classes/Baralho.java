package classes;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {
        for (Naipe n : Naipe.values()) {
            int valorCarta = 1;
            for (ValorCarta v : ValorCarta.values()) {
                Carta c = new Carta();
                c.setNaipe(n);
                c.setValor(v);
                c.setValorReal(valorCarta);
                cartas.add(c);
                valorCarta++;
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cartas);
    }

    public Carta getFromTop() {
        return cartas.remove(0);
    }

    public Carta getFromBottom() {
        return cartas.remove(cartas.size()-1);
    }

    public Carta searchCard(Naipe naipe, ValorCarta valor) {
        return this.cartas.stream().filter(
                carta -> naipe.equals(carta.getNaipe()) &&
                        valor.equals(carta.getValor())).findFirst().orElse(null);
    }

    public Carta searchCard2(Naipe naipe, int valorReal) {
        return this.cartas.stream().filter(
                carta -> naipe.equals(carta.getNaipe()) &&
                        valorReal == (carta.getValorReal())).findFirst().orElse(null);
    }




}
