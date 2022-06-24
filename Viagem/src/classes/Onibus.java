package classes;
import java.util.ArrayList;

public class Onibus implements MeioTransporte{
    ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus a : assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int cont = 0;
        for (AssentoOnibus a : assentos) {
            if (!a.isOcupado()) {
                cont += 1;
            }
        }
        return cont;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    //getters e setters

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }
}
