package program.Tema1;

import java.awt.Color;
import java.awt.Point;

public class PruebaVentana {

    public static void main(String[] args) {
        VentanaGrafica v = new VentanaGrafica(800, 600, "Prueba");
        Color miColor = new Color( 127, 2, 3);
        v.dibujaRect(20, 20, 50, 50, 2.0f, miColor, Color.LIGHT_GRAY);
        Pelota miPelota = new Pelota();
        Pelota miPelota2 = new Pelota();
        // miPelota.x = 5; No se puede hacer por que
        miPelota2.setX(200);
        miPelota2.setY(100);
        miPelota2.setColor(miColor);
        miPelota2.setRadio(30);

        miPelota.setX(100);
        miPelota.setY(400);
        miPelota.setRadio(20);
        miPelota.setColor(miColor);

        miPelota.dibuja(v);
        miPelota2.dibuja(v);
        
        GrupoPelotas grupo = new GrupoPelotas(0);
        grupo.anyadePelota(miPelota);
        grupo.anyadePelota(miPelota2);
        grupo.dibuja(v);
         moverEnParalelo(v, miPelota, miPelota2);
        //moverConRaton(v, miPelota);
        // miPelota.move50Right(v); / No se va a ejecutar nunca, pues moverconraton no termina hasta cerrar la ventana

        

    }

    /**
     * Mover 2 pelotas simultáneamente en pantalla
     * @param v
     * @param p1
     * @param p2
     */
    public static void moverEnParalelo( VentanaGrafica v, Pelota p1, Pelota p2) { // Los objetos no se duplican(Pelota)
        int a = -15; // Aceleracion de gravedad -g
        for (int i = 0; i < 50; i++) {
            p1.moverYDibujar(v, 15, a);
            a++;
            p2.moverYDibujar(v, 5, 15);
            v.espera(40); // 2000 milisegundos / 50 movimientos
         
        }
    }
    
    /**
     * Mueve la pelota a la posicion del raton al hacer click
     * @param v
     * @param p
     */
    public static void moverConRaton(VentanaGrafica v, Pelota p) {
        while (!v.estaCerrada()) {
            Point punto = v.getRatonPulsado();
            if (punto!=null) {
                p.rmPelota(v);
                p.setX(punto.x);
                p.setY(punto.y);
                p.dibujar(v);
            }
            v.espera(20);
        }
    }

}