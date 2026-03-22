package figuras;

import java.awt.Color;

/**
 * Clase que representa un cuadrado.
 * <p>
 * Es un caso particular de rectángulo donde la base y la altura son iguales.
 * </p>
 * 
 * @version 03-2026
 * @author David_Miguel_Viguera
 * @since 22-03-2026
 */
public class Cuadrado extends Rectangulo {

    /**
     * Constructor del cuadrado.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color del cuadrado
     * @param lado longitud del lado
     */
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}