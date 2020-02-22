package program.Tema1;

import java.lang.reflect.Array;

/**
 * Clase para manejar un grupo de pelotas
 */
public class GrupoPelotas {

    Pelota[] arrayPelotas = {
        new Pelota(), new Pelota(), new Pelota(), new Pelota()
        // TODO
    };

    /**
     * Meter nueva pelota al grupo
     * @param pelota Nueva pelota a meter en el grupo
     * @return True si se ha metido en la pelota, False si no es posible (grupo lleno)
     */
    public boolean addPelota( Pelota pelota ) {
        // TODO
        
    }

    /**
     * Quitar pelota del grupo
     * @param numPelota Indice de la pelota a quitar
     */
    public void rmPelota( int numPelota ) {
        // TODO

        
    }

    /**
     * Devuelve una pelota del grupo
     * @param numPelota Indice de la pelota deseada
     * @return El objeto Pelota correspondiente al indice numPelota (No la quita del grupo)
     */
    public Pelota getPelota( int numPelota ) {
        // TODO
        
    }

    /**
     * Busca en el grupo una pelota
     * @param pelota Pelota a buscar
     * @return Posicion de la pelota deseada
     */
    public int buscaPelota( Pelota pelota ) {
        // TODO
        
    }


    /**
     * Dibuja el grupo de pelotas
     * @param v Ventana grafica donde dibujar las pelotas
     */
    public void dibujaPelota( VentanaGrafica v ) {
        // TODO

    }



    

}