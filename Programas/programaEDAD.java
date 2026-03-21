
import java.util.Scanner;

public class programaEDAD {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int edad = 0;

        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        if (edad >= 18) {

            System.out.println("<(^_^)>   Puedes entrar a la fiesta");
            
        } else {
            
            System.out.println("¯\\_(:/)_/¯    No puedes ingresar, eres menor de edad");
        }
    }
}