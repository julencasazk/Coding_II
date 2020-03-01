package program.DeustoCrash;
import java.lang.Math;
/**
 * TableroCaramelos
 */
public class TableroCaramelos {

    public CarameloUD[][] grid; // TODO // Cambiar a privado una vez terminado de testear
    private String[] colors = new String[] {"r","g","b","p"}; // red, green, blue, purple

    /**
     * Contructor con parametros
     * @param grid Tablero preestablecido con 6x6 caramelos
     */
    public TableroCaramelos(CarameloUD[][] grid) {
        this.grid = grid;
    }

    /**
     * Constructor por defecto
     */
    public TableroCaramelos() {
        this.grid = new CarameloUD[6][6];
        for (int i=0; i < this.grid.length; i++) {
            for (int j=0; j < this.grid.length; j++) {
                String c = this.colors[(int)(Math.random()*4)];
                this.grid[i][j] = new CarameloUD(i, j, c);
            }
        }
    }

    /**
     * @return El tablero
     */
    public CarameloUD[][] getGrid() {
        return grid;
    }
    
    /**
     * Establece un caramelo en la posicion del tablero deseada
     * @param c Caramelo a establecer
     * @param posCol Su posion columna
     * @param posFila Su posicion fila
     */
    public void setCaramelo(CarameloUD c, int posCol, int posFila) {

        this.grid[posCol][posFila] = c;

        }

    /**
     * Elimina un caramelo de la posicion deseada
     * @param posFila Su posicion fila
     * @param posCol Su posicion columna
     */
    public void rmCaramelo(int posFila, int posCol) {
        this.grid[posCol][posFila] = null;
        }

    /**
     * Mueve un caramelo a la una posición vacía
     * @param filainic Posición fila inicial del caramelo
     * @param columnainic Posición columna inicial del caramelo
     * @param filadest Posición fila destino del caramelo
     * @param columnadest Posición columna destino del caramelo
     */
    public void moveCaramelo(int filainic, int columnainic, int filadest, int columnadest) {
        // TODO

        if (this.grid[columnadest][filadest] != null) {

            System.out.println("¡La posicion a la que quieres mover el caramelo no esta vacía!");
            }
        else{

            this.grid[columnadest][filadest] = this.grid[columnainic][filainic];

            }
        }
    /**
     * Intercambia dos caramelos en el tablero
     * @param filainic
     * @param columnainic
     * @param filadest
     * @param columnadest
     */
    public void swapCaramelo(int filainic, int columnainic, int filadest, int columnadest) {
        // TODO / Limitar el swap a posiciones contiguas
        CarameloUD temp;
        temp = this.grid[columnadest][filadest];
        this.grid[columnadest][filadest] = this.grid[columnainic][filainic];
        this.grid[columnainic][filainic] = temp;
    }

    /**
     * @return La tabla en forma de String
     */
    public String toString() {
        String tablero = new String();
        int[] nums = {0,1,2,3,4,5};
        tablero = "      0 1 2 3 4 5 \n";
        for (int j = 0; j < grid[0].length; j++){

            tablero = tablero + nums[j] + " --> ";

            for (int i=0; i<grid.length; i++) {
                if (this.grid[i][j] == null){
                    tablero = tablero + "- ";
                }
                else {
                    tablero = tablero + this.grid[i][j].getColor() + " ";
                }

            }
            tablero = tablero + "\n";
        
        }
        return tablero;
    }
}