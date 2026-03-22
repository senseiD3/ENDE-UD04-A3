package figuras;

/**
 * Clase que representa un punto en el plano cartesiano mediante
 * sus coordenadas X e Y.
 * <p>
 * Permite realizar operaciones como calcular distancias,
 * obtener el punto simétrico y comparar puntos.
 * </p>
 * 
 * @version 03-2026
 * @author David_Miguel_Viguera
 * @since 20-03-2026
 */
public class Punto {

    /** Coordenada X del punto */
    private double x;

    /** Coordenada Y del punto */
    private double y;

    /**
     * Constructor por defecto.
     * Inicializa el punto en el origen (0,0).
     */
    public Punto() {
        x = 0;
        y = 0;
    }

    /**
     * Constructor con parámetros.
     * 
     * @param x coordenada X del punto
     * @param y coordenada Y del punto
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor copia.
     * 
     * @param p punto a copiar
     */
    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }

    /**
     * Devuelve la coordenada X.
     * 
     * @return valor de X
     */
    public double getX() {
        return x;
    }

    /**
     * Devuelve la coordenada Y.
     * 
     * @return valor de Y
     */
    public double getY() {
        return y;
    }

    /**
     * Modifica la coordenada X.
     * 
     * @param x nuevo valor de X
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Modifica la coordenada Y.
     * 
     * @param y nuevo valor de Y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calcula la distancia entre este punto y otro.
     * 
     * @param p punto con el que se calcula la distancia
     * @return distancia entre ambos puntos
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    /**
     * Devuelve el punto simétrico respecto al eje Y.
     * 
     * @return nuevo punto simétrico
     */
    public Punto simetrico() {
        Punto nuevoP = new Punto(this.x * -1, this.y);
        return nuevoP;
    }

    /**
     * Compara si dos puntos son iguales.
     * 
     * @param p punto a comparar
     * @return true si son iguales, false en caso contrario
     */
    public boolean compara(Punto p) {
        if (p.x == x && p.y == y)
            return true;
        else
            return false;
    }

    /**
     * Devuelve una representación en texto del punto.
     * 
     * @return cadena con formato (x,y)
     */
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}