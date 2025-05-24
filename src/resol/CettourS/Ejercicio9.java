package resol.CettourS;

import java.util.Scanner;

public class Ejercicio9 {
    public void resolver() {
        int[] billetes = {20000, 10000, 1000, 500, 200, 100, 50, 20, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un monto de dinero");
        int monto = scanner.nextInt();
        for (int i = 0; i < billetes.length; i++) {
            int cantidad = monto / billetes[i];
            monto = monto % billetes[i];
            if (cantidad > 0) {
                System.out.println(Colores.AMARILLO + "Billetes de $" + billetes[i] + ": " +Colores.VERDE + cantidad + Colores.RESET);
            }
        }
    }
}
