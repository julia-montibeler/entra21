package classes.lanches;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Sanduiche extends Lanche{
    private HashMap<String,Double> adicionais = new HashMap<>();

    public void adicionarAdicionais(String adicional, double valor) {
       adicionais.put(adicional, valor);
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("===== " + this.getTipo() + " =====");
        if (!this.getAdicionais().isEmpty()) {
            System.out.println("----- Adicionais -----");
            for (String adicional : this.getAdicionais().keySet()) {
                System.out.printf("%s: R$%.2f\n",adicional,adicionais.get(adicional));
            }
            System.out.println("----------------------");
        }
    }

    @Override
    public void mostrarDetalhesLanche(Scanner sc) {
        System.out.print("Deseja colocar adicionais? (S/N)");
        String temAdicional = sc.nextLine();
        if (temAdicional.equalsIgnoreCase("S")){
            for (int i = 0; i < 10; i++) {
                System.out.print("Adicional (digite enter para parar): ");
                String adicional = sc.nextLine();
                if (adicional.equals("")) {
                    break;
                }
                System.out.print("Valor do adicional: ");
                this.adicionarAdicionais(adicional,sc.nextDouble());
                sc.nextLine();

            }
        }
    }

    @Override
    public double getValor(){
        double valorSanduiche = super.getValor();
        for (Double v : this.adicionais.values()) {
            valorSanduiche += v;
        }
        return valorSanduiche
                ;
    }

    //Getters e setters
    public HashMap<String,Double> getAdicionais() {
        return this.adicionais;
    }
}
