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
            System.out.println("Faltan " + diasRestantes + " días para el examen");

        } else if (diasRestantes == 0) {
            System.out.println("¡El examen es hoy!");
        }else {
            System.out.println("El exámen pasó hace " + Math.abs(diasRestantes) + " días");
        }

        System.out.println("Quedan " + clasesRestantes + " clases hasta el exámen");


    }
}
