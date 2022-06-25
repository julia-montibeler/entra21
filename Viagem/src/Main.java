import classes.Aviao;
import classes.Onibus;

public class Main {
    public static void main(String[] args) {
        Onibus a = new Onibus(5);
        a.getAssento("01").ocupar();
        a.getAssento("12").ocupar();
        a.getAssento("17").ocupar();
        a.getAssento("06").ocupar();
        a.getAssento("11").ocupar();
        a.mostrarAssentos();
    }
}
