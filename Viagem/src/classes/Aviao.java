package classes;
import java.util.ArrayList;

public class Aviao implements MeioTransporte{
    ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {

        String letrasLuxo[] = {"A","B","C","D"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < linhasCadeirasLuxo; j++) {
                AssentoVoo assento = new AssentoVoo();
                assento.setClasse("luxo");
                assento.setCodigo(letrasLuxo[i]+j);
                assentos.add(assento);
            }
        }

        String letrasEconomica[] = {"A","B","C","D","E","F"};
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < linhasCadeirasEconomicas; j++) {
                AssentoVoo assento = new AssentoVoo();
                assento.setClasse("econômica");
                assento.setCodigo(letrasEconomica[i]+j);
                assentos.add(assento);
            }
        }
    }

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
        int assentosLivres = 0;
        for (AssentoVoo a : assentos) {
            if (!a.isOcupado()) {
                assentosLivres += 1;
            }
        }
        return assentosLivres;
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
    public Assento getAssento(String assento, String classe) {
        for (AssentoVoo a : assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)
                && a.getClasse().equalsIgnoreCase(classe)) {
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
