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
        int c = 0;
        if (div > (numero / 2)) {
            return c;
        } else {
            int aux = 0;
            if (numero % div == 0) {
                aux = 1;
            }
            c = aux + ContarDivisores(numero, div + 1);
        }
        return c;
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

    public int MinimoComunMultiplo(int numero, int numero2) {
        if (numero2 <= 0) {
            return numero;
        } else {
            return numero / maximoComunDivisor(numero, numero2) * numero2;
        }
    }

    private int maximoComunDivisor(int numero1, int numero2) {
        if (numero2 <= 0) {
            return numero1;
        } else {
            return maximoComunDivisor(numero2, numero1 % numero2);
        }
    }

    public String InversaDeUnNumero(int numero) {
        if (numero < 10){
            return String.valueOf(numero);
         } else{
            return String.valueOf(numero % 10) + InversaDeUnNumero(numero / 10);
         }
       }
}
