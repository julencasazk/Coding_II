package program.Tema1;


/**
 * Clase para manejar un grupo de pelotas
 */
public class GrupoPelotas {

    private int grupoTamanyo;
    private Pelota pelotaArray[] = new Pelota [grupoTamanyo];


    public GrupoPelotas( int tamanyo ) {
        grupoTamanyo = tamanyo;
    }

    /**
     * Meter nueva pelota al grupo
     * @param pelota Nueva pelota a meter en el grupo
     * @return True si se ha metido en la pelota, False si no es posible (grupo lleno)
     */
    public boolean addPelota( Pelota pelota ) {

        Pelota nuevoGrupo[] = new Pelota [grupoTamanyo + 1];
        for (int i = 0; i < nuevoGrupo.length; i++) {
            nuevoGrupo[i] = pelotaArray [i];
        }
        nuevoGrupo[nuevoGrupo.length - 1] = pelota;
        pelotaArray = nuevoGrupo;
        ++grupoTamanyo;
        return true;

        // TODO
        // ¿Como pongo límite a los items que puedo meter?
        // Ahora mismo creo un array con length + 1 para poder meter una Pelota nueva
        // Por lo que NUNCA va a devolver FALSE
    }

    /**
     * Quitar pelota del grupo
     * @param numPelota Indice de la pelota a quitar
     */
    public void rmPelota( int numPelota ) {
        Pelota nuevoGrupo[] = new Pelota [grupoTamanyo - 1];
        for (int i = 0; i < pelotaArray.length; i++) {
            if (i != numPelota) {
                nuevoGrupo[i] = pelotaArray[i];
            }
        }
        pelotaArray = nuevoGrupo;
        --grupoTamanyo;
        // TODO       
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
        // TODO
        // Aparece que no devuelve un int, pero la var "i" es un int  
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