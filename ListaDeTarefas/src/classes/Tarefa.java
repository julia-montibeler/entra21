package classes;
import static java.util.UUID.randomUUID;

public class Tarefa {

    private Checklistitem checkList[];
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
        for (Checklistitem item : this.getCheckList()) {
            if (item != null) {
                item.completar();
            }
        }
    }

    public boolean temChecklist() {
        return this.getCheckList() != null;
    }

    public void criarChecklist(int tamanho) {
        this.setCheckList(new Checklistitem[tamanho]);
    }

    public boolean adicionarChecklistItem(Checklistitem item) {
        for (int i = 0; i < this.getCheckList().length; i++) {
            if (this.getCheckList()[i] == null) {
                this.getCheckList()[i] = item;
                return true;
            }
        }
        return false;
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

    public Checklistitem[] getCheckList() {
        return checkList;
    }
    public void setCheckList(Checklistitem[] checkList) {
        this.checkList = checkList;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
}
