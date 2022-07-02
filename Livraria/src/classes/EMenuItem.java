package classes;

public enum EMenuItem implements IMenu{
    AVALIAR(1,"Avaliar"),
    VER_AVALIACOES(2, "Ver avaliações"),
    MOSTRAR_DETALHES(3,"Mostrar detalhes"),
    VOLTAR(0,"Voltar");

    private int valorOpcao;
    private String descricao;
    EMenuItem(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static EMenuItem getByValorOpcao(int escolha) {
        for (EMenuItem e : EMenuItem.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

    public int getValorOpcao() {
        return this.valorOpcao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setValorOpcao(int valorOpcao) {
        this.valorOpcao = valorOpcao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
