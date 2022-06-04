package classes;

public class ListaTarefas {
    private Tarefa[] tarefas;
    private int tamanhoLista;
    private String nomeLista;

    public ListaTarefas(int tamanhoLista) {
        this.setTarefas(new Tarefa[tamanhoLista]);
    }

    public boolean adicionarTarefa(Tarefa t) {
        //TODO
        return false;
    }

    public Tarefa buscarTarefa(int n) {
        return this.getTarefas()[n];
    }

    public boolean alterarOrdemTareda(Tarefa t, int novaPosicao) {
        //TODO
        return true;
    }


    //getters e setters

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }
}
