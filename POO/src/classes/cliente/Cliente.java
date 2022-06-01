package classes.cliente;

import classes.pedido.Pedido;

public class Cliente {
    private String nome;
    private Pedido pedido;

    public Cliente() {
        this.setPedido(new Pedido());
    }

    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
