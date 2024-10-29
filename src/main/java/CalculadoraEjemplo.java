
/**
 * La clase CalculadoraEjemplo representa una calculadora simple que realiza operaciones
 * aritméticas básicas: suma, resta, multiplicación y división.
 *
 * @author Derimán Tejera Fumero
 * @version 1.0
 * @since 2024
 */
public class CalculadoraEjemplo {

    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor por defecto para la clase CalculadoraEjemplo.
     */
    public CalculadoraEjemplo() {
        // Inicializa una instancia de la calculadora sin valores específicos.
    }

    /**
     * Suma operando1 y operando2.
     *
     * @return El resultado de la suma.
     */
    public double suma() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Resta operando2 de operando1.
     *
     * @return El resultado de la resta.
     */
    public double resta() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Multiplica operando1 por operando2.
     *
     * @return El resultado de la multiplicación.
     */
    public double multiplicacion() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Divide operando1 por operando2.
     *
     * @return El resultado de la división o NaN si operando2 es 0.
     */
    public double division() {
        if (operando2 != 0) {
            resultado = operando1 / operando2;
        } else {
            System.out.println("Error: División por cero.");
            resultado = Double.NaN;
        }
        return resultado;
    }

    /**
     * Establece el valor de operando1.
     *
     * @param operando1 Primer operando para los cálculos.
     */
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    /**
     * Establece el valor de operando2.
     *
     * @param operando2 Segundo operando para los cálculos.
     */
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    /**
     * Devuelve el valor de operando1.
     *
     * @return El primer operando.
     */
    public double getOperando1() {
        return operando1;
    }

    /**
     * Devuelve el valor de operando2.
     *
     * @return El segundo operando.
     */
    public double getOperando2() {
        return operando2;
    }
}
