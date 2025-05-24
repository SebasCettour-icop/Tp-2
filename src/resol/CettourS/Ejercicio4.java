package resol.CettourS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    public void resolver(){
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Ingresa una fecha de nacimiento (dd/MM/aaaa)");
            String fecha = scanner.nextLine();
            Date fecha1 = formato.parse(fecha);
            SimpleDateFormat dia = new SimpleDateFormat("EEEE", new Locale("es", "ES"));
            String diaSemana = dia.format(fecha1);
            System.out.println(Colores.BOLD + Colores.AMARILLO + "Naciste un " + diaSemana + Colores.RESET);


        }catch (ParseException e) {
            System.out.println(Colores.BOLD + Colores.ROJO + "Formato de fecha inválido. Usá dd/MM/yyyy." + Colores.RESET);
        }

    }
}
