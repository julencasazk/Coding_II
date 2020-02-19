package program;

public class Tipos {
	public static void main(String[] args) {
		tipos();
		tiposNoPrimitivos();
		operaciones();
	}
	static void tipos() {
		byte a = 10; // -128 a 127
		short b = 10; // (2 bytes de memoria) -32768 a 32277
		int i = 5; // (32 bits)
		long l = 10; // (64 bits)
		System.out.println( Integer.MAX_VALUE );
		System.out.println(Long.MAX_VALUE);
		System.out.println(System.currentTimeMillis());
		System.out.println(a);
		float f = 14.14f; // F al final para 
		System.out.println(Float.MAX_VALUE);
		double d = 9217.21376;
		System.out.println(Double.MAX_VALUE);
		System.out.println(f);
		System.out.println(d);
		// Charset = Tabla de codificaci�n que usa el ordenador
		// A -> 65
		// ` ` -> 32
		// ASCII (255 en ESPA�A)
		// UTF - 8 es el charset mas extendido, STANDARDs
		
		char c = 'a'; // Normalmente es un byte, a menos que sea un caracter extendido
		boolean y = false; // Puede set true
		double d2 = d * f; // Conversión implícita de float a double
		// float f2 = d *  f; // No puedes hacer una conversión implícita si pierdes precision
		float f2 = (float) d * f; // Conversión explícita, así si se puede
		int d5 = (int) Math.round(i * d);
		
		
		
	
		
		
	}
	static void tiposNoPrimitivos() {
		String nombre = "Julen";
		System.out.println(nombre);
		int i = 12;
		System.out.println( "Longitud: " + nombre.length());
		System.out.println("Entero concatenado: " + i); // Conversion implicita de int a String
		
	}
	
	static void operaciones() {
		int i2 = 5;
		int i3 = 15;
		System.out.println( i2 + i3 );
	}
}