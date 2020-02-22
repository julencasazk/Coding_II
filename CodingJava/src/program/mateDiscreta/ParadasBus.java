package program.mateDiscreta;

/**
 * Fuerza bruta del ejercicio 3 del entregable 1 de Matemática discreta
 */
public class ParadasBus {

    public static void main(String[] args) {
        int posibilidades = 0; //  Casos totales de personas en paradas
        int parada2cero = 0; // Casos donde en la parada nº2 no para nadie
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int j2 = 0; j2 <= 10; j2++) {
                    if ((i + j + j2) == 10) {
                        System.out.println(i + " " + j + " " + j2);
                        posibilidades++;
                        if (j == 0){
                            parada2cero++;
                        }
                    }
                    
                }
                
            }
            
        }
        System.out.println("a: " + posibilidades);
        System.out.println("b: " + parada2cero);
    }

}