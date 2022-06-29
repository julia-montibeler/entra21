package classes;
import java.util.ArrayList;

public class Aviao implements MeioTransporte{
    ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {

        String letrasLuxo[] = {"A","B","C","D"};
        for (int j = 1; j <= linhasCadeirasLuxo; j++) {
            for (int i = 0; i < 4; i++) {
                AssentoVoo assento = new AssentoVoo();
                assento.setClasse(ClasseAssentoVoo.LUXO);
                assento.setCodigo(letrasLuxo[i]+j);
                assentos.add(assento);
            }
        }

        String letrasEconomica[] = {"A","B","C","D","E","F"};
        for (int j = 1; j <= linhasCadeirasEconomicas; j++) {
            for (int i = 0; i < 6; i++) {
                AssentoVoo assento = new AssentoVoo();
                assento.setClasse(ClasseAssentoVoo.ECONOMICA);
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
        int contLuxo = 0;
        int contEconomica = 0;
        for (AssentoVoo a : assentos) {
            if (a.getClasse().equals(ClasseAssentoVoo.LUXO)) {
                contLuxo++;
                if (a.isOcupado()) {
                    System.out.printf("[XX]");
                } else {
                    System.out.printf("[" + a.getCodigo() + "]");
                }
                if ((contLuxo % 4) == 0) {
                    System.out.println("");
                } else if ((contLuxo % 2) == 0) {
                    System.out.print(" || ");
                }
            } else {
                contEconomica++;
                if (a.getCodigo().equalsIgnoreCase("A1")) {
                    System.out.println("");
                }
                if (a.isOcupado()) {
                    System.out.printf("[XX]");
                } else {
                    System.out.printf("[" + a.getCodigo() + "]");
                }
                if ((contEconomica % 6) == 0) {
                    System.out.println("");
                } else if ((contEconomica % 3) == 0) {
                    System.out.print(" || ");
                }
            }
        }
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
    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo a : assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)
                && a.getClasse().equals(classe)) {
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
