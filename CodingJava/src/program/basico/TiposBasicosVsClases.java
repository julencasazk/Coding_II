package program.basico;
import java.util.Date;

// Esta clase realmente se llama
// program.basico.TiposBasicosVsClases
public class TiposBasicosVsClases {
	public static void main(java.lang.String[] args) {
		
		difPrimitivosYObjetos();
		pruebaParams();
		
	}
	
	public static int i; // Variable accesible en todos los metodos // ATRIBUTO
	
	private static void pruebaParams() {
		int i = 0;
		System.out.println(i);
		pasoEntero(i);
		Date fecha = new Date(); // Coge la fecha atual, hora de ahora
		System.out.println( fecha );
		pasoFecha(fecha);
		System.out.println( fecha );
	}
	
	private static void pasoFecha( Date mifecha) {
		System.out.println(mifecha);
		mifecha = new Date();  // Ya no referencia al mismo objeto, por lo que la fecha original no se modifica
		mifecha.setTime( System.currentTimeMillis() + 24*3600000L);
	}
	private static void pasoEntero( int i ) {
		i++; // Es lo mismo que i = i + 1
		// no es lo mismo que ++i;
		System.out.println(i);
	}
	
	private static void difPrimitivosYObjetos() {
		int i = 5; // Primitiva: Se DECLARA
		int j;
		j = 7 - 2;
	
		
		String s = "hola"; // String esta en java-lang
		// Lo que en verdad esta pasando es esto:
		String s2 = new String( "hola" ); // Objeto: new lo declara y lo crea
		String s3 =  new String( "ho" );
		s3 = s3 + "la";
		System.out.println( j == i);
		System.out.println( s3 == s2);
		if ( s == "hola") {
			// ... Ejemplo de estructura
		}
		String s4 = s3; // La asignación funciona diferente con objetos que con primitivos // ALIASING o referencias sinónimas ( 2 refs al mismo obj ) 
		System.out.println( s3 == s4); 
		// Si queremos comparar contenido --> EQUALS:
		System.out.println(s2.contentEquals(s3));
		if (s3.contentEquals(s3)) {
			
		}
		if ("Hola".equals(s3)) { // Al escribir hola crea un objeto nuevo, que elimina despues de la comparacion
			
		}
		System.out.println("hola".contentEquals("Hola")); // Ejemplo de equals false
		
//		java.util.Date fecha = new Date(); //  Si no haces import // Vease la similitud con package
		Date fecha = new Date();
	}

}
