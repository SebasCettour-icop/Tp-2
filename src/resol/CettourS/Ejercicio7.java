package resol.CettourS;

import java.util.Scanner;

public class Ejercicio7 {
    public void resolver() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresá un número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
