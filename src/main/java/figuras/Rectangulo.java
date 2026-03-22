package figuras;

import java.awt.Color;

/**
 * Clase que representa un rectángulo definido por su base y altura.
 * <p>
 * Permite calcular el perímetro y el área del rectángulo.
 * </p>
 * 
 * @version 03-2026
 * @author David_Miguel_Viguera
 * @since 22-03-2026
 */
public class Rectangulo extends Figura {

    /** Base del rectángulo */
    private double base;

    /** Altura del rectángulo */
    private double altura;

    /**
     * Constructor del rectángulo.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color del rectángulo
     * @param base longitud de la base
     * @param altura longitud de la altura
     */
    public Rectangulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    /** @return base del rectángulo */
    public double getBase() {
        return base;
    }

    /** @return altura del rectángulo */
    public double getAltura() {
        return altura;
    }

    /** @param base nueva base */
    public void setBase(double base) {
        this.base = base;
    }

    /** @param altura nueva altura */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * <pre>
     * perímetro = 2 * base + 2 * altura
     * </pre>
     * 
     * @return perímetro del rectángulo
     */
    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }

    /**
     * Calcula el área del rectángulo.
     * <pre>
     * área = base * altura
     * </pre>
     * 
     * @return área del rectángulo
     */
    @Override
    public double area() {
        return base * altura;
    }
}