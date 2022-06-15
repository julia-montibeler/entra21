package classes.lanches;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Sanduiche extends Lanche{
    private ArrayList<String> adicionais = new ArrayList<>();

    public void adicionarAdicionais(String adicional) {
       adicionais.add(adicional);
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("===== " + this.getTipo() + " =====");
        if (!this.getAdicionais().isEmpty()) {
            System.out.println("----- Adicionais -----");
            for (String adicional : this.getAdicionais()) {
                System.out.println(adicional);
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
                this.adicionarAdicionais(adicional);

            }
        }
    }

    //Getters e setters
    public ArrayList<String> getAdicionais() {
        return this.adicionais;
    }
}
