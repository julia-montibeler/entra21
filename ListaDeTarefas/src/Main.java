import classes.Tarefa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarefa t = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        t.setNome(sc.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        t.setDescricao(sc.nextLine());



    }
}
