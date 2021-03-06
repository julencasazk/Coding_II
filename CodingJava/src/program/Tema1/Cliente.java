package program.Tema1;

/**@author julen.casal at julen.casal@opendeusto.es
 * Cliente
 */
public class Cliente {

    private String name;
    private int id;
    private String username;

    public String getName() {
        return this.name;
    }

    public void setName( String name ) {
        this.name = name;        
    }
    
    public int getID() {
        return this.id;
    }

    public void setID( int id ) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername( String username) {
        this.username = username;
    }

    public String toString() {
        return this.name + " (" + this.id + ")";
    }
}