package program.Tema1;
import java.awt.Color;


/**
 * @author julen.casal at julen.casal@opendeusto.es
 */
public class Pelota {

    private int radio;
    private double x;
    private double y;
    // Private Point centro // Se podria hacer un punto en lugar de x,y
    private Color color;

    /** Devuelve el radio de la pelota
     * @return Radio en pixeles
     */
    public int getRadio() {
        return radio;
    }

    /**
     *  Establece el radio de la pelota
     * @param radio Radio en pixeles
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * Devuelve la coordenada x del centro de la pelota, con respecto a la pantalla
     * @return Coordenada x de la pelota
     */
    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Devuelve el color de la linea de la pelota
     * @return Color de la linea de la pelota
     */
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void dibujar( VentanaGrafica v ) { // No hace falta pasar los atributos de la clase
        v.dibujaCirculo( x, y, radio, 2.0f, color);
    }

}