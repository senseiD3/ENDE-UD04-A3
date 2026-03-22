package figuras;

import java.awt.Color;

/**
 * Clase que representa un triángulo definido por la longitud de sus tres lados.
 * <p>
 * Permite calcular el perímetro y el área del triángulo.
 * El cálculo del área se realiza mediante la fórmula de Herón.
 * </p>
 * 
 * @version 03-2026
 * @author David_Miguel_Viguera
 * @since 22-03-2026
 */
public class Triangulo extends Figura {

    /** Lado 1 del triángulo */
    private double lado1;

    /** Lado 2 del triángulo */
    private double lado2;

    /** Lado 3 del triángulo */
    private double lado3;

    /**
     * Constructor del triángulo.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color del triángulo
     * @param lado1 longitud del lado 1
     * @param lado2 longitud del lado 2
     * @param lado3 longitud del lado 3
     */
    public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /** @return lado 1 */
    public double getLado1() {
        return lado1;
    }

    /** @return lado 2 */
    public double getLado2() {
        return lado2;
    }

    /** @return lado 3 */
    public double getLado3() {
        return lado3;
    }

    /** @param lado1 nuevo valor del lado 1 */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /** @param lado2 nuevo valor del lado 2 */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /** @param lado3 nuevo valor del lado 3 */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula el perímetro del triángulo.
     * 
     * @return suma de los tres lados
     */
    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el área del triángulo usando la fórmula de Herón:
     * <pre>
     * s = (lado1 + lado2 + lado3) / 2
     * área = √(s(s - lado1)(s - lado2)(s - lado3))
     * </pre>
     * 
     * @return área del triángulo
     */
    @Override
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}