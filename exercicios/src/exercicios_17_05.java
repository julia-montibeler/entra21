import java.util.Scanner;

public class exercicios_17_05 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        exe10();
    }

    public static void exe01() {
        System.out.print("Digite algo: ");
        String algo = sc.nextLine();
        System.out.println("Length: "+algo.length());
        System.out.println("Empty: "+algo.isEmpty());
        System.out.println("Uppercase: "+algo.toUpperCase());
        System.out.println("Lowercase: "+algo.toLowerCase());
    }

    public static void exe02() {
        System.out.print("Digite algo: ");
        String str1 = sc.nextLine();
        System.out.print("Digite algo: ");
        String str2 = sc.nextLine();
        if(str1.equals(str2)) {
            System.out.println("São exatamente iguais");
        } else if(str1.equalsIgnoreCase(str2)) {
            System.out.println("São iguais ignorando case");
        } else {
            System.out.println("São diferentes");
        }
    }

    public static void exe03() {
        System.out.print("Digite algo: ");
        String str1 = sc.nextLine();
        System.out.print("Digite algo: ");
        String str2 = sc.nextLine();
        if(str1.contains(str2)) {
            System.out.println(str2+" faz parte de "+str1);
        } else if (str2.contains(str1)) {
            System.out.println(str1+" faz parte de "+str2);
        } else {
            System.out.println("Nenhuma faz parte da outra");
        }
    }

    public static void exe04() {
        System.out.print("Digite algo: ");
        String str1 = sc.nextLine();
        System.out.print("Digite algo: ");
        String str2 = sc.nextLine();
        System.out.println(str1+" é prefixo de "+str2+": "+str2.startsWith(str1));
        System.out.println(str2+" é prefixo de "+str1+": "+str1.startsWith(str2));

    }

    public static void exe05() {
        System.out.print("Digite algo: ");
        String str1 = sc.nextLine();
        System.out.print("Digite algo: ");
        String str2 = sc.nextLine();
        System.out.println(str1+" é sufixo de "+str2+": "+str2.endsWith(str1));
        System.out.println(str2+" é sufixo de "+str1+": "+str1.endsWith(str2));
    }

    public static void exe06() {
        System.out.print("Digite algo: ");
        String str1 = sc.nextLine();
        System.out.print("Digite algo: ");
        String str2 = sc.nextLine();
        int posicao = str1.indexOf(str2);
        System.out.println("A posição de "+str2+" em "+str1+" é "+posicao);
    }

    public static void exe07() {
        String str = "lala#lwve#-rwgra22lalang!#<3";
        String decifrada = str.replace("w","o").replace("#"," ").replace("2","m")
                .replace("lala","i").replace("-","p");
        System.out.println(decifrada);
    }

    public static void exe08() {
        System.out.print("Informe a quantidade de números: ");
        int quantidade = sc.nextInt();
        int[] numeros = new int[quantidade] ;

        for(int i = 0; i < quantidade; i++) {
            System.out.print("Número: ");
            numeros[i] = sc.nextInt();
        }
        int par = 0, impar = 0;
        for(int valor : numeros) {
            if((valor % 2) == 0) {
                par += valor;
            } else {
                impar += valor;
            }
        }
        System.out.println("Soma par: "+par);
        System.out.println("Soma ímpar: "+impar
        );
    }

    public static void exe09() {
        System.out.print("Número de palavras: ");
        int n = sc.nextInt();
        String[] palavras = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("digite uma palavra: ");
            palavras[i] = sc.nextLine();
        }
        System.out.print("Digite um número: ");
        int tamanho = sc.nextInt();
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (palavras[i].length() < tamanho) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exe10() {
        System.out.print("Tamanho da primera lista: ");
        int tamanho1 = sc.nextInt();
        int [] lista1 = new int[tamanho1];
        for (int i = 0; i < tamanho1; i++) {
            System.out.print("Digite um número: ");
            lista1[i] = sc.nextInt();
        }


        System.out.print("Tamanho da segunda lista: ");
        int tamanho2 = sc.nextInt();
        int [] lista2 = new int[tamanho1];
        for (int i = 0; i < tamanho2; i++) {
            System.out.print("Digite um número: ");
            lista1[i] = sc.nextInt();
        }

        boolean t =  false;
        for(int valor : lista1) {
            for(int valor2 : lista2) {
                if (valor == valor2) {
                    t = true;
                    break;
                }
            }
            if (!t) {
                System.out.println(valor);
            }
            t = false;
        }



    }
}
