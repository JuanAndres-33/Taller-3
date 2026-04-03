import java.math.BigInteger; //esto se usara para el case de los numeros de fibonacci
import java.util.Scanner;

public class programaASCII {
    public static void main(String[] args) {

        int opcion = 0;
        double n = 0;
        double numero = 0;
        double suma = 0;
        double promedio = 0;
        long nFibonacci = 0;
        long nPrimo = 0;
        long numeroPrim = 2;
        long contadorPrim = 0;
        long primo = 0;
        double aCuad = 0;
        double bCuad = 0;
        double cCuad = 0;
        double discrm = 0;
        double raizCuadPos = 0;
        double raizCuadNeg = 0;
        boolean entradaValida = false; // usada para capturar errores en cada case
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("""
                    ╠═══════════════════════════════════════════════════════════╗
                    ║                       MENU PRINCIPAL                      ║
                    ║       Bienvenido, escoja el programa a ejecutar           ║
                    ╠═══════════════════════════════════════════════════════════╣
                    ║ 1. Sumar n-avo número de Fibonacci                        ║
                    ║ 2. N-avo número primo                                     ║
                    ║ 3. Raíces ecuación cuadrática                             ║
                    ║ 4. Promedio  N-números                                    ║
                    ║ 5. Salir                                                  ║
                    ╚═══════════════════════════════════════════════════════════╝
                        """);
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
                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║        FIBONACCI             ║
                            ╠══════════════════════════════╣
                            ║ Ingresa un número entero     ║
                            ╚══════════════════════════════╝
                            """);

                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            System.out.print(">> ");
                            nFibonacci = sc.nextInt();
                            sc.nextLine();
                            entradaValida = true;
                        } catch (Exception e) {
                            System.out.println("""
                                    ╔══════════════════════════════╗
                                    ║  ERROR: número inválido      ║
                                    ╚══════════════════════════════╝
                                    """);
                            sc.nextLine();
                        }
                    }

                    //BigInteger se usará para que no haya limites a la hora de hacer calculos del número de fibonacci

                    BigInteger a = BigInteger.ZERO; //reemplaza el long a = 0
                    BigInteger b = BigInteger.ONE; //remplaza el long b = 1
                    BigInteger resultadoFibo = BigInteger.ZERO; 

                    if (nFibonacci == 0) {
                        resultadoFibo = BigInteger.ZERO;
                    } else if (nFibonacci == 1) {
                        resultadoFibo = BigInteger.ONE;
                    } else {
                        for (int i = 2; i <= nFibonacci; i++) {
                            resultadoFibo = a.add(b); //reemplaza la suma de a y b
                            a = b;
                            b = resultadoFibo;
                        }
                    }

                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║       RESULTADO              ║
                            ╚══════════════════════════════╝
                            """);

                    System.out.println("Fibonacci = " + resultadoFibo);

                    break;

                case 2:
                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║        NÚMEROS PRIMOS        ║
                            ╠══════════════════════════════╣
                            ║ Ingresa la posición (n)      ║
                            ╚══════════════════════════════╝
                            """);

                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            System.out.print(">> ");
                            nPrimo = sc.nextLong();
                            sc.nextLine();
                            entradaValida = true;
                        } catch (Exception e) {
                            System.out.println("""
                                    ╔══════════════════════════════╗
                                    ║  ERROR: número inválido      ║
                                    ╚══════════════════════════════╝
                                    """);
                            sc.nextLine();
                        }
                    }

                    contadorPrim = 0;
                    numeroPrim = 2;

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

                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║          RESULTADO           ║
                            ╚══════════════════════════════╝
                            """);

                    System.out.println("El primo número " + nPrimo + " es: " + primo);

                    break;

                case 3:
                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║   ECUACIÓN CUADRÁTICA        ║
                            ╠══════════════════════════════╣
                            ║ Forma: ax² + bx + c = 0      ║
                            ╚══════════════════════════════╝
                            """);

                    // ----------- a -----------
                    System.out.print("Ingrese a: ");
                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            aCuad = sc.nextDouble();
                            sc.nextLine();
                            entradaValida = true;
                        } catch (Exception e) {
                            System.out.println("""
                                    ╔══════════════════════════════╗
                                    ║  ERROR: Numero invalido      ║
                                    ╚══════════════════════════════╝
                                    """);
                            sc.nextLine();
                            System.out.print("Ingrese nuevamente a: ");
                        }
                    }

                    // ----------- b -----------
                    System.out.print("Ingrese b: ");
                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            bCuad = sc.nextDouble();
                            sc.nextLine();
                            entradaValida = true;
                        } catch (Exception e) {
                            System.out.println("""
                                    ╔══════════════════════════════╗
                                    ║  ERROR: Numero invalido      ║
                                    ╚══════════════════════════════╝
                                    """);
                            sc.nextLine();
                            System.out.print("Ingrese nuevamente b: ");
                        }
                    }

                    // ----------- c -----------
                    System.out.print("Ingrese c: ");
                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            cCuad = sc.nextDouble();
                            sc.nextLine();
                            entradaValida = true;
                        } catch (Exception e) {
                            System.out.println("""
                                    ╔══════════════════════════════╗
                                    ║  ERROR: Numero invalido      ║
                                    ╚══════════════════════════════╝
                                    """);
                            sc.nextLine();
                            System.out.print("Ingrese nuevamente c: ");
                        }
                    }

                    // Validación importante
                    if (aCuad == 0) {
                        System.out.println("""
                                ╔══════════════════════════════╗
                                ║ No es ecuación cuadrática    ║
                                ╚══════════════════════════════╝
                                """);
                        break;
                    }

                    // ----------- cálculo -----------
                    discrm = Math.pow(bCuad, 2) - (4 * aCuad * cCuad);

                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║         RESULTADO            ║
                            ╚══════════════════════════════╝
                            """);

                    if (discrm < 0) {
                        System.out.println("No tiene raíces reales");

                    } else if (discrm == 0) {
                        raizCuadPos = (-bCuad) / (2 * aCuad);
                        System.out.println("Una raíz:");
                        System.out.println("x = " + raizCuadPos);

                    } else {
                        raizCuadPos = (-bCuad + Math.sqrt(discrm)) / (2 * aCuad);
                        raizCuadNeg = (-bCuad - Math.sqrt(discrm)) / (2 * aCuad);

                        System.out.println("Dos raíces:");
                        System.out.println("x1 = " + raizCuadPos);
                        System.out.println("x2 = " + raizCuadNeg);
                    }

                    break;

                case 4:
                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║          PROMEDIO            ║
                            ╠══════════════════════════════╣
                            ║ Calcula el promedio de n     ║
                            ╚══════════════════════════════╝
                            """);

                    System.out.print("¿Cuántos números desea ingresar?: ");
                    entradaValida = false;

                    while (!entradaValida) {
                        try {
                            n = sc.nextInt();
                            sc.nextLine();
                            entradaValida = true;
                        } catch (Exception e) {
                            System.out.println("""
                                    ╔══════════════════════════════╗
                                    ║  ERROR: Numero invalido      ║
                                    ╚══════════════════════════════╝
                                    """);
                            sc.nextLine();
                            System.out.print("Ingrese nuevamente la cantidad: ");
                        }
                    }

                    suma = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.print("Ingrese el número " + i + ": ");

                        entradaValida = false;

                        while (!entradaValida) {
                            try {
                                numero = sc.nextDouble();
                                sc.nextLine();
                                entradaValida = true;
                            } catch (Exception e) {
                                System.out.println("""
                                        ╔══════════════════════════════╗
                                        ║  ERROR: Numero invalido      ║
                                        ╚══════════════════════════════╝
                                        """);
                                sc.nextLine();
                                System.out.print("Ingrese nuevamente el número: ");
                            }
                        }

                        suma += numero;
                    }

                    promedio = suma / n;

                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║         RESULTADO            ║
                            ╚══════════════════════════════╝
                            """);

                    System.out.println("El promedio es: " + promedio);

                    break;

                case 5:
                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║   GRACIAS POR USAR EL        ║
                            ║         PROGRAMA             ║
                            ╚══════════════════════════════╝
                            """);
                    break;

                default:
                    System.out.println("""
                            ╔══════════════════════════════╗
                            ║     OPCIÓN INVÁLIDA          ║
                            ╚══════════════════════════════╝
                            """);
                    break;
            }

        } while (opcion != 5);
        sc.close();
    }
}