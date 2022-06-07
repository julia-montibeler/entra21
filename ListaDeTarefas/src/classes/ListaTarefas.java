package classes;

public class ListaTarefas {
    private Tarefa[] tarefas;
    private int tamanhoLista;
    private String nomeLista;

    public ListaTarefas(int tamanhoLista) {
        this.setTamanhoLista(tamanhoLista);
        this.setTarefas(new Tarefa[tamanhoLista]);
    }

    public boolean adicionarTarefa(Tarefa t) {
        if (t.getOrdem() < 0 ||
                t.getOrdem() >= this.getTamanhoLista()) {
            return false;
        }
        for (int i = 0; i < this.getTarefas().length; i++) {
            if (this.getTarefas()[i] == null) {
                this.getTarefas()[i] = t;
                return true;
            } else if (this.getTarefas()[i].getOrdem() == t.getOrdem()) {
                break;
            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int ordem) {
        for (Tarefa t : this.getTarefas()) {
            if (t != null && t.getOrdem() == ordem) {
                return t;
            }
        }
        return null;
    }

    public boolean alterarOrdemTareda(int antigaOrdem, int novaOrdem) {
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem);
        Tarefa novaTarefa = buscarTarefa(novaOrdem);
        if (tarefaAntiga == null || novaTarefa == null) {
            return false;
        }


        tarefaAntiga.setOrdem(novaOrdem);
        novaTarefa.setOrdem(antigaOrdem);

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
