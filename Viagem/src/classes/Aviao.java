package classes;
import java.util.ArrayList;

public class Aviao implements MeioTransporte{
    ArrayList<AssentoVoo> assentos = new ArrayList<>();

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo a : assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int cont = 0;
        for (AssentoVoo a : assentos) {
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
        for (AssentoVoo a : assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    //getters e setters

    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }
}
