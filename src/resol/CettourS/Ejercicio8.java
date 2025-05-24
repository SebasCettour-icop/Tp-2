package resol.CettourS;

import java.util.Scanner;

public class Ejercicio8 {
    public void resolver(){
        double consumoNormal = 8.0;
        double consumoIrregular = consumoNormal * 1.15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese capacidad del tanque en litros");
        int capacidad = scanner.nextInt();
        System.out.printf(Colores.BOLD + Colores.AMARILLO + "Capacidad en carretera normal: %.2f kilómetros" + Colores.RESET + "\n", capacidad * 100 / consumoNormal);
        System.out.printf(Colores.BOLD + Colores.CYAN + "Capacidad en carretera irregular: %.2f kilómetros" + Colores.RESET + "\n", capacidad * 100 / consumoIrregular);


    }
}
