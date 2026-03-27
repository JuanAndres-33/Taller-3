import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese un número entero: ");
                numero = sc.nextInt();
                sc.nextLine();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Ingrese un entero valido");
                sc.nextLine();
                System.out.println("\nVuelve a ingresar el numero porfavor: ");
            }

        }

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }

}
