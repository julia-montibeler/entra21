package classes;
import java.util.ArrayList;

public class Onibus implements MeioTransporte{
    ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    public Onibus(int linhasCadeiras) {
        for (int i = 1; i <= linhasCadeiras * 4; i++) {
            AssentoOnibus assento = new AssentoOnibus();
            if (i < 10) {
                assento.setLugar("0"+i);
            } else {
                assento.setLugar(String.valueOf(i));
            }
            assentos.add(assento);
        }
    }

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
        int cont = 0;
        for (AssentoOnibus a : assentos) {
            cont++;
            if (a.isOcupado()) {
                System.out.printf("[XX]");
            } else {
                System.out.printf("["+a.getLugar()+"]");
            } if ((cont % 4) == 0) {
                System.out.println("");
            } else if ((cont % 2) == 0) {
                System.out.print(" || ");
            }
        }
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
