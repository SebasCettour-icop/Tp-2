package resol.CettourS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Ingrese una fecha (dd/mm/aaaa):");
            String fecha1Texto = scanner.nextLine();
            Date fecha1 = formato.parse(fecha1Texto);

            System.out.println("Ingrese otra fecha (dd/mm/aaaa):");
            String fecha2Texto = scanner.nextLine();
            Date fecha2 = formato.parse(fecha2Texto);

            if (fecha1.after(fecha2)) {
                System.out.println("La primera fecha es mayor a la segunda.");
            } else if (fecha1.before(fecha2)) {
                System.out.println("La segunda fecha es mayor a la primera.");
            } else {
                System.out.println("Ambas fechas son iguales.");
            }
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Usá dd/MM/yyyy.");
        }
    }
}
