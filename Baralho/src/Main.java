import classes.Carta;
import classes.Naipe;
import classes.ValorCarta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();
        for (Naipe n : Naipe.values()) {
            for (ValorCarta v : ValorCarta.values()) {
                Carta c = new Carta();
                c.setNaipe(n);
                c.setNum(v);
                cartas.add(c);
                System.out.println(c);
            }
        }

    }
}
