import java.util.Scanner;

public class juegoAdivinar {
    public static void main(String[] args) {

        boolean entradaValida = false;
        int nMinimo = 0;
        int mMaximo = 0;
        int numeroSecreto = 0;
        int intento = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Este es un juego donde tendras que adivinar un número entre un rango de números que tu escojas");
        System.out.println("Primero, escogeremos el rango del juego, ingresa el rango minimo que tendra el juego: ");

        entradaValida = false;
        while (!entradaValida) {
            try {
                nMinimo = sc.nextInt();
                sc.nextLine();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
                System.out.println("\nVuelve a ingresar el numero porfavor: ");
            }
        }

        System.out.println("Perfecto, ahora escojeremos el rango maximo que tendrá el juego: ");

        entradaValida = false;
        while (!entradaValida) {
            try {
                mMaximo = sc.nextInt();
                sc.nextLine();
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();
                System.out.println("\nVuelve a ingresar el numero porfavor: ");
            }
        }

        if (nMinimo > mMaximo) {
            System.out.println("El rango minimo que escogiste es mayor que el rango maximo por ende el juego no se puede realizar");
        }else if (nMinimo == mMaximo) {
            System.out.println("Los 2 rangos escogidos son iguales, por ende, no se puede realizar el juego");
        }else{
            numeroSecreto = (int)(Math.random() * (mMaximo - nMinimo + 1)) + nMinimo;

            while (true) {
                System.out.println("Perfecto, iniciemos el juego, el rango del número secreto estara dento del rango que escogiste");
                System.out.println("ingresa el número que crees que es: ");

                entradaValida = false;

                while (!entradaValida) {
                    try {
                        intento = sc.nextInt();
                        sc.nextLine();
                        entradaValida = true;
                    } catch (Exception e) {
                        System.out.println("Error al ingresar el número");
                        sc.nextLine();
                        System.out.println("\nVuelve a ingresar el número porfavor");
                    }
                }

                while (intento != numeroSecreto) {
                    if (intento > numeroSecreto) {
                        System.out.println("");
                        
                    }
                }

            }


        }
    }
}