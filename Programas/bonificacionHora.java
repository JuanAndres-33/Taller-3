import java.time.LocalTime;

public class bonificacionHora {
    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();

        int horaActual = hora.getHour();
        int minutoActual = hora.getMinute();

        int tiempoTotal = horaActual * 60 + minutoActual;

        System.out.println("Hora actual: " + horaActual + ":" + minutoActual);

        if (tiempoTotal >= (6 * 60) && tiempoTotal < (12 * 60)) {
            System.out.println("Buenos dias");
        } 
        else if (tiempoTotal >= (12 * 60) && tiempoTotal < (18 * 60)) {
            System.out.println("Buenas tardes");
        } 
        else {
            System.out.println("Buenas noches");
        }
    }
}