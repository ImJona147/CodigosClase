public class FuncionRecursiva {

    public int DigitosN(int numero) {
        int contador = 1;
        if (numero < 10) {
            return contador;
        } else {
            numero = (numero / 10);
            contador = 1 + DigitosN(numero);
        }
        return contador;
    }
    
    public int Factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {    
            return numero * Factorial(numero - 1);
        }
    }

    public int Potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * Potencia(base, exponente - 1);
        }
    }

    public int Division(int dividendo, int divisor) {
        int contador = 1;
        if (divisor >= dividendo) {
            return contador;
        } else {
            dividendo = (dividendo - divisor);
            contador = 1 + Division(dividendo, divisor);
        }
        return contador;
    }

    public int ContarDivisores(int numero) {
        int cantidadato  = 2;
        int respuesta = 1;
        if (numero == 1) {
            return respuesta;
        } else {
            respuesta = 2 + ContarDivisores(numero, cantidadato);
        }
        return respuesta;
    }

    private int ContarDivisores(int numero, int div) {
        int cont = 0;
        if (div > (numero / 2)) {
            return cont;
        } else {
            int aux = 0;
            if (numero % div == 0) {
                aux = 1;
            }
            cont = aux + ContarDivisores(numero, div + 1);
        }
        return cont;
    }

    public int Fibonacci(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return Fibonacci(numero - 1) + Fibonacci(numero - 2);
        }
    }
}
