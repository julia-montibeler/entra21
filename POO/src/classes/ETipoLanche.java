package classes;

public enum ETipoLanche {
    XS(1,"X-Salada"),
    XB(2,"X-Burguer"),
    HD(3,"Hot Dog"),
    MQ(4,"Misto Quente"),
    MP(5,"Mini Pizza"),
    P(6,"Pizza");

    private int valorOpcao;
    private String descricao;
    ETipoLanche(int valor, String descricao) {
        this.valorOpcao = valor;
        this.descricao = descricao;
    }

    public static ETipoLanche getByValorOpcao(int escolha) {
        for (ETipoLanche e : ETipoLanche.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        throw new RuntimeException();
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
