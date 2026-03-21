import java.util.Scanner;

public class programa {
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
        long nPrimo = 0;
        long numeroPrim = 2;
        long contadorPrim = 0;
        long primo = 0;
        boolean entradaValida = false; //usada para capturar errores en cada case
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\nEscoge una opcion: ");

            System.out.println("\n1: sumar n-avo número de fibonacci");
            System.out.println("2: n-avo número primo");
            System.out.println("3: Raices ecuacion cuadratica");
            System.out.println("4: Promedio n-números");
            System.out.println("5: Salir del sistema");

           try {
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                sc.nextLine(); 
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                        System.out.println("Ingrese el número de Fibonacci que desea: ");

                        entradaValida = false;

                        while (!entradaValida) {
                            try {
                                nFibonacci = sc.nextInt();
                                sc.nextLine();
                                entradaValida = true; 
                            } catch (Exception e) {
                                System.out.println("Error: Debe ingresar un número entero válido.");
                                sc.nextLine(); 
                                System.out.println("Ingrese nuevamente el número de Fibonacci: ");
                            }
                        }

                        if (nFibonacci == 0) {
                            resultadoFibo = 0;

                        } else if (nFibonacci == 1) {
                            resultadoFibo = 1;

                        } else {

                            for (int i = 2; i <= nFibonacci; i++) {
                                resultadoFibo = a + b;
                                a = b;
                                b = resultadoFibo;
                            }
                        }

                        System.out.println("El Fibonacci es: " + resultadoFibo);
                        break;

                case 2:
                    System.out.println("Ingrese el numero primo que desea conocer: ");

                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            nPrimo = sc.nextLong();
                            sc.nextLine();
                            entradaValida = true;
                            
                        } catch (Exception e) {
                            System.out.println("Error, debe ingresar un número entero valido");
                            sc.nextLine();
                            System.out.println("Ingrese nuevamente el número primo");
                        } 
                    }

                    while (contadorPrim < nPrimo) {
                        boolean esPrimo = true;

                        for (long i = 2; i <= Math.sqrt(numeroPrim); i++) {
                            if (numeroPrim % i == 0) {
                                esPrimo = false;
                                break;
                            }
                        }

                        if (esPrimo) {
                            contadorPrim++;
                            primo = numeroPrim;
                        }
                        numeroPrim++;
                    }
                    System.out.println("El primo número " + nPrimo + " es: " + primo);
                    break;

                case 3:
                    System.out.println("Vamos a calcular la raices de una ecuacion cuadratica, ");
                    break;

                case 4:
                    System.out.println("¿Cuantos numeros desea ingresar?: ");
                    
                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            n = sc.nextInt();
                            sc.nextLine();
                            entradaValida = true;
                        } catch (Exception e) {
                            System.out.println("Error, debe ingresar un número entero valido");
                            sc.nextLine();
                            System.out.println("Ingrese nuevamente la cantidad de números para que le saquemos el promedio");
                        }     
                    }

                    for (int i = 1; i <= n; i++) {
                        System.out.println("Ingrese el numero " + i + ": ");

                        entradaValida = false;

                        while (!entradaValida) {
                            try {
                                numero = sc.nextInt();
                                sc.nextLine();
                                entradaValida = true;
                            } catch (Exception e) {
                                System.out.println("Error, debes ingresar un numero entero valido: ");
                                sc.nextLine();
                                System.out.println("Ingresa nuevamente el número");
                            }
                        }

                        suma = suma + numero;
                    }

                    promedio = suma / n;

                    System.out.println("El promedio es: " + promedio);
                    break;

                case 5:
                    System.out.println("gracias por usar el programa, que tenga un buen día");
                    break;

                default:
                    System.out.println("Opcion equivocada, vuelve a ingresar la opcion porfavor");
                    break;
            }

        } while (opcion < 1 || opcion > 5);
    }
}