package program.DeustoCrash;

/**
 * Programa principal a ejecutar
 */
public class DeustoCrash {

    public static void main(String[] args) {
        //TODO
        CarameloUD[][] grid = new CarameloUD[6][15];
        System.out.println(grid[1].length);
        System.out.println((int)(Math.random()*4));
        TableroCaramelos tab = new TableroCaramelos();
        System.out.println(tab);
        buscaYQuitaLineas(tab);
        System.out.println(tab);
        caenLasPiezas(tab);
        System.out.println(tab);
        buscaYQuitaLineas(tab);
        System.err.println(tab);
        caenLasPiezas(tab);
        System.out.println(tab);
        
    }
    
    /**
     * Si hay 3 o más caramelos del mismo color contiguos los reemplaza por nulls
     * @param tablero Tablero de caramelos a analizar
     * @return
     */
    public static Boolean buscaYQuitaLineas(TableroCaramelos tablero) {
        for (int i = 1; i < tablero.getGrid().length-1; i++) {
            for (int j = 1; j < tablero.getGrid()[0].length-1; j++) {
                if (tablero.getGrid()[i][j] != null && tablero.getGrid()[i-1][j] != null && tablero.getGrid()[i+1][j] != null) {
                    if (( tablero.getGrid()[i][j].getColor() == tablero.getGrid()[i-1][j].getColor() ) && ( tablero.getGrid()[i][j].getColor() == tablero.getGrid()[i+1][j].getColor())) {
                        tablero.getGrid()[i][j].setStreakOn(true);
                        tablero.getGrid()[i-1][j].setStreakOn(true);
                        tablero.getGrid()[i+1][j].setStreakOn(true);
                    }

                }
                
            } 

        }
        
        for (int i = 1; i < tablero.getGrid().length-1; i++) {
            for (int j = 1; j < tablero.getGrid()[0].length-1; j++) {
                if (tablero.getGrid()[j][i] != null && tablero.getGrid()[j][i-1] != null && tablero.getGrid()[j][i+1] != null) {
                    if (( tablero.getGrid()[j][i].getColor() == tablero.getGrid()[j][i-1].getColor() ) && ( tablero.getGrid()[j][i].getColor() == tablero.getGrid()[j][i+1].getColor())) {
                        tablero.getGrid()[j][i].setStreakOn(true);
                        tablero.getGrid()[j][i-1].setStreakOn(true);
                        tablero.getGrid()[j][i+1].setStreakOn(true);
                    }

                }
                
            } 

        }

        for (int i = 0; i < tablero.getGrid().length; i++) {
            for (int j = 0; j < tablero.getGrid()[0].length; j++) {
                if (tablero.getGrid()[i][j] != null) {
                    if (tablero.getGrid()[i][j].getStreakOn()) {
                        tablero.getGrid()[i][j] = null;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Sube los nulls hasta la posición superior
     * @param tablero Tablero de caramelos a analizar 
     */
    public static void caenLasPiezas(TableroCaramelos tablero){
        boolean algunaCaida =  true;
        while (algunaCaida) {
            algunaCaida = false;
            for ( int col = 0; col < tablero.getGrid().length; col++ ) {
                for ( int fila = 4; fila >= 0; fila-- ) {
                    if ( tablero.getGrid()[col][fila] != null && tablero.getGrid()[col][fila+1] == null) {
                        tablero.swapCaramelo(fila, col, fila+1, col);
                        algunaCaida = true;
                    }
                }
            }
        }

    }
}