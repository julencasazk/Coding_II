package program.Tema1;

/** Clase para implementar el manejo de libros y su informacion
 * @author julen.casal at julen.casal@opendeusto.es
 */
public class Libro {

    // Parte STATIC - de clase

    public static void main(String[] args) {
        Libro l = null;
        // System.out.println( l.numPaginas ); // Daría error NULLPOINTER!!
        l = new Libro();
        System.out.println( l.numPaginas ); // Si fuese fuera de la Clase habria que usar getNumPaginas()
        l.setTitulo("Sapiens");
        l.setTexto("Bruh");
        l.setNumPaginas(359);
        l.setISBN("XXSAD321321");
        Cliente c = new Cliente();
        c.setName("Maña Nano");
        c.setID(762155632);
        c.setUsername("manananohayclase");
        l.vender(c);
    }

    // Parte NO STATIC - de objeto
    private String texto;
    private String titulo;
    private String isbn;
    private int numPaginas;


    public String toString() {
        return titulo + "( " + numPaginas + " paginas )";
    }

    public void sacarAConsola() {
        System.out.println(this.titulo);

    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto( String texto ) {
        this.texto = texto;
    }

    public String getISBN() {
        return this.isbn;
    }

    public void setISBN( String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {

        return this.titulo;
        
    }

    public void setTitulo( String titulo ) {

        this.titulo = titulo;

    }

    public int getNumPaginas() {
 
        return this.numPaginas;

    }

    public void setNumPaginas( int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public void vender( Cliente cliente ) {
        // TODO
        System.out.println("Venta realizada del libro " + this + " a el cliente " + cliente );
        
    }
}