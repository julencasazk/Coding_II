package program.Tema1;

import java.awt.Color;

public class PruebaVentana {

    public static void main(String[] args) {
        VentanaGrafica v = new VentanaGrafica(800, 600, "Prueba");
        Color miColor = new Color( 127, 2, 3);
        v.dibujaRect(20, 20, 50, 50, 2.0f, miColor, Color.LIGHT_GRAY);
        Pelota miPelota = new Pelota();
        // miPelota.x = 5; No se puede hacer por que
        miPelota.setX(100);
        miPelota.setY(200);
        miPelota.setRadio(20);
        miPelota.setColor(miColor);
        miPelota.dibujar(v);

    }
}