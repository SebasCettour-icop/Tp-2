package resol.CettourS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio6 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Ingresa tu fecha de cumpleaños (dd/MM/yyyy):");
        String fecha = scanner.nextLine();

        try {
            LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);
            LocalDate hoy = LocalDate.now();

            LocalDate proximoCumple = fechaNacimiento.withYear(hoy.getYear());
            if (!proximoCumple.isAfter(hoy)) {
                proximoCumple = proximoCumple.plusYears(1);
            }

            long diasRestantes = ChronoUnit.DAYS.between(hoy, proximoCumple);
            System.out.println(Colores.BOLD + Colores.CYAN + "Faltan " + diasRestantes + " días para tu próximo cumpleaños." +Colores.RESET);
        } catch (DateTimeParseException e) {
            System.out.println(Colores.BOLD + Colores.ROJO + "Formato inválido. Usá el formato dd/MM/yyyy." +Colores.RESET);
        }
    }

    }
