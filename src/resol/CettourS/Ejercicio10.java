package resol.CettourS;

import java.util.Scanner;

public class Ejercicio10 {
    public void resolver() {
        String[] alumnos = {"Mateo", "Santiago", "Nicolas", "Juan", "Lucas", "Valentina", "Camila", "Martina", "Sofia", "Agustina"};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese calificación para " + alumnos[i] + ":");
            double calificacion = scanner.nextDouble();

            if (calificacion >= 0 && calificacion < 5) {
                System.out.println(alumnos[i] + Colores.ROJO + " Aplazado." + Colores.RESET);
            } else if (calificacion >= 5 && calificacion < 7) {
                System.out.println(alumnos[i] + Colores.AMARILLO + " Bueno." + Colores.RESET);
            } else if (calificacion >= 7 && calificacion <= 9) {
                System.out.println(alumnos[i] + Colores.CYAN + " Notable." + Colores.RESET);
            } else if (calificacion >= 9 && calificacion <= 10) {
                System.out.println(alumnos[i] + Colores.VERDE + " Sobresaliente. " + Colores.RESET);
            } else {
                System.out.println(Colores.BOLD + Colores.ROJO + "Calificación no válida" + Colores.RESET);

            }


        }


    }
}
