package program.DeustoCrash;

/**
 * CarameloUD
 */
public class CarameloUD {

    private int posFila;
    private int posColumna;
    private String color;


    /**
     * Constructor
     * @param fila Posicion de fila inicial del caramelo
     * @param columna  Posicion de columna inicial del caramelo
     * @param color  Color del caramelo
     */
    public CarameloUD(int fila, int columna, String color) {

        this.color = color;
        this.posColumna = columna;
        this.posFila = fila;

    }
    
    /**
     * @return La posicion de la fila
     */
    public int getPosFila() {
        return posFila;
    }

    /**
     * @return La posicion de la columna
     */
    public int getPosColumna() {
        return posColumna;
    }

    /**
     * @return El color del caramelo
     */
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String mensaje = "Pelota de color "+this.color+" con posición (x,y): ("+posColumna+","+posFila+")";
        return mensaje;
    }
}