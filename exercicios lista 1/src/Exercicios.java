import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        exe22();
    }

    public static void exe01() {
        int A=10;
        int B=20;
        int temp = A;
        A = B;
        B = temp;
        System.out.println(A);
        System.out.println(B);
    }

    public static void exe02() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = sc.nextInt();
        System.out.println(--a);
    }

    public static void exe03() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        double perimetro = base * 2 + altura * 2;
        double area = base * altura;
        System.out.println(perimetro);
        System.out.println(area);
    }

    public static void exe04() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Anos: ");
        int ano = sc.nextInt();
        System.out.print("Meses: ");
        int mes = sc.nextInt();
        System.out.print("Dias: ");
        int dia = sc.nextInt();
        int idade_dias = (ano*365)+(mes*30)+dia;
        System.out.println(idade_dias);
    }

    public static void exe05() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eleitores: ");
        int eleitores = sc.nextInt();
        System.out.print("Votos nulos: ");
        int vnulo = sc.nextInt();
        System.out.print("Votos brancos: ");
        int vbranco = sc.nextInt();
        int vvalido = eleitores - (vnulo + vbranco);
        double pvnulo = (vnulo * 100.0) / eleitores;
        double pvbranco = (vbranco * 100.0) / eleitores;
        double pvvalido = (vvalido * 100.0) / eleitores;
        System.out.printf("Votos válidos: %.1f%%",(pvvalido));
        System.out.printf("Votos nulos: %.1f%%",(pvnulo));
        System.out.printf("Votos branco: %.1f%%",(pvbranco));
    }

    public static void exe06() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        System.out.print("Reajuste: ");
        int percentual = sc.nextInt();
        double reajuste = salario * (percentual * 0.01);
        double salarioReajustado = salario + reajuste;
        System.out.printf("Salário reajustado: R$%.2f",(salarioReajustado));
    }

    public static void exe07() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Custo de fábrica: ");
        double custoFabrica = sc.nextDouble();
        double percentualD = custoFabrica * 0.28;
        double imposto = custoFabrica * 0.45;
        double custoFinal = custoFabrica + percentualD + imposto;
        System.out.printf("Preço final: R$%.2f",(custoFinal));
    }

    public static void exe08() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Carros vendidos: ");
        int carro = sc.nextInt();
        System.out.print("Total vendas: ");
        double vendas = sc.nextDouble();
        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        System.out.print("Comissão: ");
        double comissao = sc.nextDouble();
        double valorComissao = carro * comissao;
        double valorVendas = vendas * 0.05;
        double salarioFinal = salario + valorComissao + valorVendas;
        System.out.printf("Salário final: R$%.2f",(salarioFinal));
    }

    public static void exe09() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Fahrenheit: ");
        double tempF = sc.nextDouble();
        double tempC = ((tempF - 32) / 9) * 5;
        System.out.printf("Temperatura em Celsius: %.2f",tempC);
    }

    public static void exe10 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();
        double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        System.out.printf("Média final: %.1f", media);
    }
    public static void exe11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }

    public static void exe12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }
    }

    public static void exe13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Maçãs compradas: ");
        int macas = sc.nextInt();
        if (macas < 12) {
            double preco = macas * 1.3;
            System.out.printf("Preço: %.2f", preco);

        } else {
            double preco = macas * 1;
            System.out.printf("Preço: %.2f", preco);

        }
    }

    public static void exe14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.print("Ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não pode votar");
        }
    }

    public static void exe15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }

    public static void exe16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        int n2 = sc.nextInt();
        if (n2 > n1) {
            System.out.print(n1+", ");
            System.out.print(n2);
        } else {
            System.out.print(n2+", ");
            System.out.print(n1);
        }
    }

    public static void exe17() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hora de início: ");
        int horaI = sc.nextInt();
        System.out.print("Hora de término: ");
        int horaF = sc.nextInt();
        if (horaI >= horaF) {
            int horas = 24 - horaI + horaF;
            System.out.println("Duração: "+horas+" horas");
        } else {
            int horas = horaF - horaI;
            System.out.println("Duração: "+horas+" horas");
        }
    }

    public static void exe18() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Horas trabalhadas: ");
        int horasT = sc.nextInt();
        System.out.print("Salário por hora: ");
        double salarioH = sc.nextDouble();
        if (horasT > 160) {
            int horasE = horasT - 160;
            int horasN = horasT - horasE;
            double valorHoraE = horasE * (salarioH * 0.5);
            double salarioF = horasN * salarioH + valorHoraE;
            System.out.printf("Salário total: R$%.2f", salarioF);
        } else {
            double salarioF = horasT * salarioH;
            System.out.printf("Salário total: R$%.2f", salarioF);
        }
    }

    public static void exe19() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.print("Sexo (M ou F): ");
        String sexo = sc.next();
        double peso = 0;
        if (sexo.equals("M")) {
            peso = (72.7 * altura) - 58;
        } else if (sexo.equals("F")) {
            peso = (62.1 * altura) - 44.7;
        }
        System.out.printf("Seu peso ideal é: %.2f", peso);
    }

    public static void exe20() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.print("Vendas efetuadas: ");
        double vendas = sc.nextDouble();
        double comissao = 0;
        if (vendas <= 1500) {
            comissao = vendas * 0.03;
        } else {
            comissao = (vendas - 1500) * 0.05 + 1500 * 0.03;
        }
        double salarioTotal = salarioFixo + comissao;
        System.out.printf("Salário total: "+ salarioTotal);
    }

    public static void exe21() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta: ");
        int conta = sc.nextInt();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.print("Débito: ");
        double debito = sc.nextDouble();
        System.out.print("Crédito: ");
        double credito = sc.nextDouble();
        double saldoAtual = saldo - debito + credito;
        System.out.println("Saldo atual: "+ saldoAtual);

        if (saldoAtual < 0) {
            System.out.println("Saldo Negativo");
        } else {
            System.out.println("Saldo Positivo");
        }
    }

    public static void exe22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade em estoque: ");
        int estoqueAtual = sc.nextInt();
        System.out.print("Quantidade máxima do estoque: ");
        int estoqueMax = sc.nextInt();
        System.out.print("Quantidade mínima do estoque: ");
        int estoqueMin = sc.nextInt();
        int media = (estoqueMin + estoqueMax) / 2;
        System.out.println("Quantidade média: "+media);
        if (estoqueAtual >= media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }


}
