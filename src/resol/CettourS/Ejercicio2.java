package resol.CettourS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio2 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        LocalDate fecha_actual = LocalDate.now();

        try {
            System.out.println("Ingresa tu fecha de nacimiento (dd/mm/aaaa)");
            String fecha_nac = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha_nacimiento = LocalDate.parse(fecha_nac, formatter);

            LocalDate actual = fecha_nacimiento;
            int contador = 0;

            for (actual = fecha_nacimiento; actual.isBefore(fecha_actual); actual = actual.plusDays(1)) {
                contador++;


            }
            System.out.println("Han transcurrido " + contador + " días desde tu nacimiento");

        } catch (DateTimeParseException e) {
            System.out.println("Formato inválido. Usá el formato dd/MM/yyyy");
        }
    }
}