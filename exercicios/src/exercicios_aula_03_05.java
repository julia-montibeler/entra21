public class exercicios_aula_03_05 {
    public static void main(String[] args) {
        if(forbiddenLetter(new String[]{"abc","def","ghi"}, 'a')) {
            System.out.println("Encontrou letra proibida");
        }else {
            System.out.println("Não encontrou letra proibida");
        }
    }

    public static boolean forbiddenLetter(String[] palavras, char letraProibida) {
        boolean achou = false;
        for (String palavra:palavras) {
            for (int i = 0; i <= palavra.length(); i++) {
                achou = palavra.charAt(i) == letraProibida;
                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }
        }
        return achou;
    }

    public static boolean forbiddenLetter1(String[] palavras, char letraProibida) {
        boolean achou = false;
        for (String palavra : palavras) {
            achou = palavra.contains(String.valueOf(letraProibida));
            if (achou) {
                break;
            }
        }
        return achou;
    }
}
