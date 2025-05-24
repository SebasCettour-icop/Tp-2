package resol.CettourS;

import java.lang.classfile.attribute.CharacterRangeInfo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio5 {
    public void resolver() {
        LocalDate fechaExamen = LocalDate.of(2025, 6, 26);
        LocalDate fechaActual = LocalDate.now();
        long clasesRestantes = ChronoUnit.WEEKS.between(fechaActual, fechaExamen);
        long diasRestantes = ChronoUnit.DAYS.between(fechaActual, fechaExamen);

        if (diasRestantes > 0) {
            System.out.println(Colores.BOLD + Colores.CYAN + "Faltan " + diasRestantes + " días para el examen" + Colores.RESET);

        } else if (diasRestantes == 0) {
            System.out.println(Colores.BOLD + Colores.AMARILLO + "¡El examen es hoy!" + Colores.RESET);
        } else {
            System.out.println(Colores.BOLD + Colores.ROJO + "El exámen pasó hace " + Math.abs(diasRestantes) + " días" + Colores.RESET);
        }

        System.out.println(Colores.BOLD + Colores.CYAN + "Quedan " + clasesRestantes + " clases hasta el exámen" + Colores.RESET);


    }
}
