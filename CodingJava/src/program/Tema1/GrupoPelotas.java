package program.Tema1;


/**
 * Clase para manejar un grupo de pelotas
 */
public class GrupoPelotas {

    private Pelota pelotaArray[];
    private int numPelotas = 0;


    public GrupoPelotas( int tamanyo ) {
        this.pelotaArray = new Pelota[tamanyo];
    }

    /**
     * Checkea si hay espacio y añade pelota
     * @param pelota
     * @return false si no hay espacio
     * @return true si ha metido la pelota con éxito
     */
    public boolean addPelota( Pelota pelota) {
        if (numPelotas == pelotaArray.length) {
            return false;
        }
        else {
            pelotaArray[numPelotas] = pelota;
            ++numPelotas;
            return true;
        }
    }

    /**
     * Quitar pelota del grupo
     * @param numPelota Indice de la pelota a quitar
     */
    public void rmPelota( int numPelota ) {
        for (int i=numPelota+1; i<numPelotas; i++) {
            pelotaArray[i-1] = pelotaArray[i];

        }
        numPelotas--;
    }

    /**
     * @return the numPelotas
     */
    public int getNumPelotas() {
        for (int i = 0; i < pelotaArray.length; i++) {
            if (this.pelotaArray[i] != null) {
                ++numPelotas;
            }
        }
        return numPelotas;
    }
    /**
     * Devuelve una pelota del grupo
     * @param numPelota Indice de la pelota deseada
     * @return El objeto Pelota correspondiente al indice numPelota (No la quita del grupo)
     */
    public Pelota getPelota( int numPelota ) {
        return pelotaArray[numPelota];
        
    }

    /**
     * Busca en el grupo una pelota
     * @param pelota Pelota a buscar
     * @return Posicion de la pelota deseada
     */
    public int buscaPelota( Pelota pelota ) {
        for (int i = 0; i < pelotaArray.length; i++) {
            if (pelotaArray[i].equals(pelota)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Dibuja el grupo de pelotas
     * @param v Ventana grafica donde dibujar las pelotas
     */
    public void dibujaPelota( VentanaGrafica v ) {
        for (int i = 0; i < pelotaArray.length; i++) {
            pelotaArray[i].dibujar(v);
        }
        // TODO
    }  
}