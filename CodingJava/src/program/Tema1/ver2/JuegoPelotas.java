package program.Tema1.ver2;

import program.Tema1.GrupoPelotas;
import program.Tema1.Pelota;
import program.Tema1.VentanaGrafica;

import java.awt.Color;
import java.util.Random;

/**
 * JuegoPelotas
 */
public class JuegoPelotas {

    private static int anchoCasilla = 200;
    private static int altoCasilla = 150;
    private static final int ALTO_CASILLAS = 5;
    private static final int ANCHO_CASILLAS = 5;
    private static final int NUM_PELOTAS = 20;
    private static VentanaGrafica vent;
    private static GrupoPelotas grupo;
    private static final int RADIO_MAXIMO = 50;
    private static final int RADIO_MINIMO = 10;
    private static final Color[] COLORES_PELOTA = new Color[] {Color.RED, Color.GREEN, Color.BLUE};

    public static void main(String[] args) {
        vent = new VentanaGrafica(ANCHO_CASILLAS * anchoCasilla, ALTO_CASILLAS * altoCasilla, "Juego");
        Random r = new Random();
        grupo = new GrupoPelotas(NUM_PELOTAS);
        for (int i = 0; i<NUM_PELOTAS; i++) {
            int radio = r.nextInt((RADIO_MAXIMO - RADIO_MINIMO + 1) + RADIO_MINIMO);
            Color color = COLORES_PELOTA[r.nextInt(COLORES_PELOTA.length)];
            Pelota p = new Pelota(0,0,radio,color);
            p.setX(r.nextInt(5) * anchoCasilla + (anchoCasilla/2));
            p.setX(r.nextInt(5) * altoCasilla + (altoCasilla/2));
        }
        grupo.dibuja(vent);
    }
}

