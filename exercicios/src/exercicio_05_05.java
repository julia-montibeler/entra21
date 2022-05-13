import java.util.Scanner;

public class exercicio_05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isclass = true;
        while (isclass) {
            System.out.println("Abreviação da classe: ");
            String classe = sc.next().toUpperCase();
            if (classe.length() == 3) {
                switch (classe) {
                    case "PLD", "WAR", "DKN", "GNB":
                        System.out.println("Tank");
                        break;
                    case "WHM", "SCH", "AST", "SAG":
                        System.out.println("Healer");
                        break;
                    case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                        System.out.println("DPS");
                        break;
                    default:
                        System.out.println("Não é uma classe válida");
                        isclass = false;
                        break;
                }
            } else {
                System.out.println("Abreviação não é válida, digite uma abreviação de três letras");
                isclass = false;
                break;
            }
        }
    }
}
