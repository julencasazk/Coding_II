package program.Tema1;

import java.awt.Color;

public class PruebaVentana {

    public static void main(String[] args) {
        VentanaGrafica v = new VentanaGrafica(800, 600, "Prueba");
        Color miColor = new Color( 127, 2, 3);
        v.dibujaRect(20, 20, 50, 50, 2.0f, miColor, Color.LIGHT_GRAY);

    }
}