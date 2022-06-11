package classes.lanches;

import java.util.Scanner;

public abstract class Sanduiche extends Lanche{
    private String[] adicionais = new String[10];

    public void adicionarAdicionais(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    @Override
    public void mostrarDetalhesComanda() {
        System.out.println("===== " + this.getTipo() + " =====");
        if (this.getAdicionais()[0] != null) {
            System.out.println("----- Adicionais -----");
            for (String adicional : this.getAdicionais()) {
                if (adicional != null) {
                    System.out.println(adicional);
                }
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
    public String[] getAdicionais() {
        return this.adicionais;
    }
}
