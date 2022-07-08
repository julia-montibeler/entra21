package classes;

public enum EMenu implements IMenu{
    ADICIONAR_ITEM(1,"Adicionar item"),
    BUSCAR_ITEM(2, "Buscar item"),
    REMOVER_ITEM(3,"Remover item"),
    MOSTRAR_ITENS(4,"Mostrar itens da estante"),

    ADICIONAR_ESTANTE(5,"Adicionar estante"),
    SAIR(0,"Sair");

    private int valorOpcao;
    private String descricao;
    EMenu(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static EMenu getByValorOpcao(int escolha) {
        for (EMenu e : EMenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        throw new RuntimeException();
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
