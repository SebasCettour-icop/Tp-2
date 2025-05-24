package resol.CettourS;

public class Ejercicio3 {
    public void resolver() {
        System.out.println(Colores.BOLD + Colores.VERDE + "La actividad inicia a las 7:00 y finaliza a las 15:00" + Colores.RESET);
        int inicio = 7;
        int fin = 15;
        int minutos = (fin - inicio) * 60;
        System.out.println(Colores.BOLD + Colores.AMARILLO + "La jornada tiene una duración de " + minutos + " minutos" + Colores.RESET);
    }
}
