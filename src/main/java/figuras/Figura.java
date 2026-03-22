package figuras;

import java.awt.Color;

/**
 * Clase abstracta que representa una figura geométrica.
 * <p>
 * Define propiedades comunes como el centro y el color,
 * así como métodos abstractos para calcular el área y el perímetro.
 * </p>
 * 
 * @version 03-2026
 * @author David_Miguel_Viguera
 * @since 20-03-2026
 */
public abstract class Figura {

    /** Punto que representa el centro de la figura */
    private Punto centro;

    /** Color de la figura */
    private Color color;

    /**
     * Constructor de la clase Figura.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color de la figura
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }

    /**
     * Devuelve la coordenada X del centro.
     * 
     * @return coordenada X
     */
    public double getXCentro() {
        return centro.getX();
    }

    /**
     * Devuelve la coordenada Y del centro.
     * 
     * @return coordenada Y
     */
    public double getYCentro() {
        return centro.getY();
    }

    /**
     * Devuelve el color de la figura.
     * 
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Modifica la coordenada X del centro.
     * 
     * @param x nuevo valor de X
     */
    public void setXCentro(double x) {
        centro.setX(x);
    }

    /**
     * Modifica la coordenada Y del centro.
     * 
     * @param y nuevo valor de Y
     */
    public void setYCentro(double y) {
        centro.setY(y);
    }

    /**
     * Modifica el color de la figura.
     * 
     * @param color nuevo color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Calcula el perímetro de la figura.
     * 
     * @return valor del perímetro
     */
    public abstract double perimetro();

    /**
     * Calcula el área de la figura.
     * 
     * @return valor del área
     */
    public abstract double area();

    /**
     * Compara el área de esta figura con otra.
     * 
     * @param otraFigura figura con la que se compara
     * @return 1 si es mayor, -1 si es menor, 0 si son iguales
     */
    public int esMayorQue(Figura otraFigura) {
        int codigo;

        if (this.area() > otraFigura.area())
            codigo = 1;
        else if (this.area() < otraFigura.area())
            codigo = -1;
        else
            codigo = 0;

        return codigo;
    }
}