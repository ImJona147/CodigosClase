package P1;

public class Fecha {
    private int d;
    private int m;
    private int a;

    public Fecha(int d, int m, int a) {
        boolean fechaValida = m >= 1 && m <= 12 && a > 0;
        boolean diaValido = false;
        switch(m) {
            case 2:
                if (fechaValida) {
                    if (esBisiesto(a)) {
                        diaValido = d >= 1 && d <= 29;
                    } else {
                        diaValido = d >= 1 && d <= 28;
                    }
                } 
                break;
            case 4,6,9,11:
                if (fechaValida) {
                    diaValido = d >= 1 && d <= 30;
                }
                break;
            default:
                if (fechaValida) {
                    diaValido = d >= 1 && d <= 31;
                }
        }
        if (fechaValida && diaValido) {
            this.d = d;
            this.m = m;
            this.a = a;
            System.out.println("Fecha Válida: " + toString());
        } else {
            System.out.println("La fecha ingresada es inválida");
        }
    }

    private boolean esBisiesto(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) 
            return true;
        return false;
    }

    private int compareT0(Fecha f) {
        int cmp = (a - f.getAño());
        if (cmp == 0) {
            cmp = (m - f.getMes());
            if (cmp == 0) {
                cmp = (d - f.getDia());
            }
        }
        return cmp;
    } 

    public boolean esIgual(Fecha f) {
        if (f instanceof Fecha)
            return compareT0(f) == 0;
        return false; 
    }

    public int compareTo(Fecha f) {
        if (f instanceof Fecha) {
            return compareT0(f);
        }
        return 0;
    }

    public boolean esAnterior(Fecha f) {
        if (f instanceof Fecha) {
            return compareT0(f) < 0;
        }
        return false;
    }

    public boolean esPosterior(Fecha f) {
        if (f instanceof Fecha) {
            return compareT0(f) > 0;
        }
        return false;
    }

    public String getDireferencia(Fecha f) {
        int dia = (f.getDia() -  getDia() < 0 ? getDia() - f.getDia() : f.getDia() -  getDia());
        int mes = (f.getMes() -  getMes() < 0 ? getMes() - f.getMes() : f.getMes() -  getMes());
        int año = (f.getAño() -  getAño() < 0 ? getAño() - f.getAño() : f.getAño() -  getAño());
        return dia + (dia > 1 ? " dias " : " dia ") + 
        mes + (mes > 1 ? " meses y " : " mes y ") + 
        año + (año > 1 ? " años." : " año.");
    }

    @Override
    public String toString() {
        return d + "/" + m + "/" + a;
    }

    public int getDia() {
        return d;
    }

    public int getMes() {
        return m;
    }

    public int getAño() {
        return a;
    }
}