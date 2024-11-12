package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaCompuradoras {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("bluetooth", "lenovo");
        // System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("bluetooth", "lenovo");
        // System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("lenovo", 27);
        // System.out.println(monitorLenovo);

        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        // System.out.println(computadoraLenovo);

        // Creamos otro objeto de tipo computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Raton ratonDell = new Raton("USB", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell );

        // Creamos otro objeto de tipo computadora
        Monitor monitorMac = new Monitor("Mac", 15);
        Teclado tecladoMac = new Teclado("bluetooth", "Dell");
        Raton ratonMac = new Raton("USB", "Dell");
        Computadora computadoraMac = new Computadora("Computadora Dell", monitorMac, tecladoMac, ratonMac );

        // Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraMac);
        orden1.mostrarOrden();

        System.out.println();

        // Creamos una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.mostrarOrden();
    }
}