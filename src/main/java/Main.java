
/**
 * Clase principal que ejecuta y prueba la funcionalidad de la clase CalculadoraEjemplo.
 * Crea una instancia de CalculadoraEjemplo, establece los valores de los operandos,
 * y muestra el resultado de cada operación aritmética básica.
 */
public class Main {

    /**
     * NUEVO CAMBIO PARA REALIZAR EL SEGUNDO COMMIT Método principal que ejecuta
     * el programa de prueba.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        CalculadoraEjemplo calc = new CalculadoraEjemplo();

        // Asignación de valores y ejecución de operaciones
        calc.setOperando1(10);
        calc.setOperando2(5);
        System.out.println("Suma: " + calc.suma());
        System.out.println("Resta: " + calc.resta());
        System.out.println("Multiplicación: " + calc.multiplicacion());
        System.out.println("División: " + calc.division());
    }
}
