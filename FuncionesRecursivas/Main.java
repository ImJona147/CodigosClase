import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner eScanner = new Scanner(System.in);
        boolean term = false;
        FuncionRecursiva fun = new FuncionRecursiva();
        int l1;

        do {
            System.out.println("1. Sacar factorial");
            System.out.println("2. Sacar Potencia");
            System.out.println("3. Obtener secuencia Fibonacci");
            System.out.println("4. Contar digitos de un número");
            System.out.println("5. Divisores de un numero");
            System.out.println("6. Restas en un número");
            System.out.println("7. Finalizar");
            l1 = eScanner.nextInt();
            switch (l1) {
                case 1:
                    System.out.println("Ingrese un numero");
                    int fac = fun.Factorial(eScanner.nextInt());
                    System.out.println("El Factorial es: " + fac);
                    break;
                case 2:
                    System.out.println("Ingrese un numero");
                    l1 = eScanner.nextInt();
                    System.out.println("Ingrese otro numero");
                    int po = fun.Potencia(l1, eScanner.nextInt());
                    System.out.println("La Potencia es: " + po);
                    break;
                case 3:
                    System.out.println("Ingrese un numero");
                    l1 = eScanner.nextInt();
                    int fibo = 0;
                    System.out.println("La secuencia es: ");
                    for (int i=0;i<l1;i++) {
                        fibo = fun.Fibonacci(i);
                        System.out.print(fibo + " ");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese un numero");
                    int di = fun.DigitosN(eScanner.nextInt());
                    System.out.println("La cantidad de digitos es: " + di);
                    break;
                case 5:
                    System.out.println("Ingrese un numero");
                    int div = fun.ContarDivisores(eScanner.nextInt());
                    System.out.println("Fue dividido por: " + div);
                    break;
                case 6:
                    System.out.println("Ingrese un numero");
                    l1 = eScanner.nextInt();
                    System.out.println("Ingrese otro numero");
                    int res = fun.Division(l1, eScanner.nextInt());
                    System.out.println("Fue restado: " + res);
                    break;
                case 7:
                    term = true;
                    System.out.println("Esta terminado...");
                    break;
                default:
                    System.out.println("Solo hay 7 opciones");
                    break;
            }
        } while (!term);
    }
}
