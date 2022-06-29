package classes;

public enum ValorCarta {
    UM("A"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    ONZE("J"),
    DOZE("Q"),
    TREZE("K");

    private String valorCarta;

    ValorCarta(String valorCarta) {
        this.valorCarta = valorCarta;
    }

    public String getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(String valorCarta) {
        this.valorCarta = valorCarta;
    }
}
