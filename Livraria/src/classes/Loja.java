package classes;

import classes.guardados.Estante;

import java.util.ArrayList;
import java.util.HashMap;

public class Loja {
    HashMap<String, Estante> estantes = new HashMap<>();

    public HashMap<String, Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(HashMap<String, Estante> estantes) {
        this.estantes = estantes;
    }
}
