import classes.Checklistitem;
import classes.ListaTarefas;
import classes.Tarefa;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Informe a qauntidade de tarefas: ");
        ListaTarefas lt = new ListaTarefas(sc.nextInt());
        sc.nextLine();
        System.out.print("Informe um nome para a lista de tarefas: ");
        lt.setNomeLista(sc.nextLine());
        while (true) {
            lt.adicionarTarefa(criarTarefa());
            System.out.println("Deseja adicionar mais tarefas? (S/N) ");
            String add = sc.nextLine();
            if (add.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static Tarefa criarTarefa() {
        Tarefa t = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(sc.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        t.setDescricao(sc.nextLine());
        System.out.print("Ordem da tarefa: ");
        t.setOrdem(sc.nextInt());
        sc.nextLine();
        System.out.print("Tem checklist? (S/N) ");
        String checklist = sc.nextLine();
        if (checklist.equalsIgnoreCase("S")) {
            System.out.print("Informe o tamanho da checklist: ");
            t.criarChecklist(sc.nextInt());
            sc.nextLine();
            while (true) {
                Checklistitem item = new Checklistitem();
                System.out.print("Informe o nome do item: ");
                item.setNome(sc.nextLine());
                System.out.print("Informe uma descrição para o item: ");
                item.setDescricao(sc.nextLine());
                System.out.println("Deseja adicionar mais itens? (S/N) ");
                String add = sc.nextLine();
                if (add.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
        return t;
    }
}
