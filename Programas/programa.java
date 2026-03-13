import java.util.Scanner;

public class programa{
    public static void main(String[] args) {

        int opcion = 0;
        double n = 0;
        double numero = 0;
        double suma = 0;
        double promedio = 0;
        int nFibonacci = 0;
        long a = 0;
        long b = 1;
        long resultadoFibo = 0;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("Escoge una opcion: ");

            System.out.println("1: sumar n-avo número de fibonacci");
            System.out.println("2: n-avo número primo");
            System.out.println("3: Raices ecuacion cuadratica");
            System.out.println("4: Promedio n-números");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número de Fibonacci que desea: ");
                    nFibonacci = sc.nextInt();
                    
                    if (nFibonacci == 0){
                        resultadoFibo = 0;

                    } else if (nFibonacci == 1){
                        resultadoFibo = 1;
                    }else {     

                        for (int i = 2; i <= nFibonacci; i++){
                            resultadoFibo = a + b;
                            a = b;
                            b = resultadoFibo;
                        }
                    }
                    System.out.println("El Fibonacci es: " + resultadoFibo);
                    break;

                case 2:
                    System.out.println("2");
                    break;

                case 3:
                    System.out.println("3");
                    break;

                case 4:
                    System.out.println("¿Cuantos numeros desea ingresar?: ");
                    n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("Ingrese el numero " + i + ": ");
                        numero = sc.nextInt();

                        suma = suma + numero;
                    }
                    
                    promedio = suma / n;

                    System.out.println("El promedio es: " + promedio);
                    break;

                default:
                    System.out.println("Opcion equivocada, vuelve a ingresar la opcion porfavor");
                    break;
            }
            
        } while (opcion < 1 | opcion > 4);
    }
}