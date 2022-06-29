package classes;

public enum Naipe {
    OUROS("Ouros"),
    COPAS("Copas"),
    PAUS("Paus"),
    ESPADAS("Espadas");

    private String naipe;

    Naipe (String naipe) {
        this.naipe = naipe;
    }


    //getters e setters
    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
}



