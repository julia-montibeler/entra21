import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executa = true;
        HashMap<String,Double> produtos = new HashMap<>();
        while(executa) {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto");
            System.out.println("3 - Mostrar todos");
            System.out.println("4 - Deletar");
            System.out.println("0 - Sair");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.print("Informe o produto: ");
                    String chave = sc.nextLine().toLowerCase();
                    if (produtos.containsKey(chave)) {
                        System.out.println("Produto já existente, deseja atualizar o valor? (S/N) ");
                        if (sc.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.print("Valor do produto: ");
                    double valor = sc.nextDouble();
                    produtos.put(chave,valor);
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                    System.out.println("Não há produtos cadastrados");
                }
                    System.out.print("Qual produto deseja encontrar: ");
                    String produto = sc.nextLine().toLowerCase();
                    if (produtos.containsKey(produto)) {
                        System.out.println(produto + ": " + produtos.get(produto));
                    } else  {
                        System.out.println("Produto "+produto+" não encontrado");
                    }

                    break;
                case 3:
                    //TODO
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");
                    }
                    System.out.print("Produto a ser removido: ");
                    produto = sc.nextLine().toLowerCase();
                    if (produtos.containsKey(produto)) {
                        produtos.remove(produto);
                    } else {
                        System.out.println("O produto "+produto+" não existe");
                    }
                default:
                    System.out.println("Informe uma opção válida!");
            }
        }

    }
}
