package classes;
import static java.util.UUID.randomUUID;

public class Tarefa {
    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa;
    private int ordem;

    public Tarefa() {
        this.setUuid(randomUUID().toString());
    }

    public void completar() {
        this.setCompleta(true);
    }




    //getters e setters
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getUuid() {
        return this.uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
    public boolean isCompleta() {
        return this.completa;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
    public int getOrdem() {
        return this.ordem;
    }
}
