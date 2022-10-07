package P1;

public class Main {

    public static void main(String[] args) {
        Fecha f = new Fecha(5, 7, 1400);
        Fecha f1 = new Fecha(30, 11, 2016);

        if (f.esIgual(f1)) {
            System.out.println("¡Las fechas son iguales!");
            System.out.println("1. " + f + "     " + "2. " + f1);
        } else {
            System.out.println("¡Las fechas no son iguales!");
            System.out.println("1. " + f + "     " + "2. " + f1);
        }

        if (f.esAnterior(f1)) {
            System.out.println("¡Las fecha " + f + " es anterior a " + f1 + " por " + f.getDireferencia(f1));
        } else if (f.esPosterior(f1)) {
            System.out.println("¡Las fecha " + f + " es posterior a " + f1 + " por " + f.getDireferencia(f1));
        }
    }
}
