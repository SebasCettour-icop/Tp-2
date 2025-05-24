package resol.CettourS;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. LocalDate");
            System.out.println("2. Días desde el nacimiento");
            System.out.println("3. Horario");
            System.out.println("4. Fecha de nacimiento");
            System.out.println("5. Tiempo restante");
            System.out.println("6. Días para el cumpleaños");
            System.out.println("7. Triángulo de números");
            System.out.println("8. Consumo de combustible");
            System.out.println("9. Cuenta billetes");
            System.out.println("10. Array de calificaciones");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción (0-10): ");

            String entrada = scanner.nextLine();
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcion = -1;
            }


            switch (opcion) {
                case 1:
                    new Ejercicio1().resolver();
                    break;

                case 2:
                    new Ejercicio2().resolver();
                    break;

                case 3:
                    new Ejercicio3().resolver();
                    break;

                case 4:
                    new Ejercicio4().resolver();
                    break;

                case 5:
                    new Ejercicio5().resolver();
                    break;

                case 6:
                    new Ejercicio6().resolver();
                    break;

                case 7:
                    new Ejercicio7().resolver();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}