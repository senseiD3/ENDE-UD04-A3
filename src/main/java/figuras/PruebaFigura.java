package figuras;

import java.util.Scanner;
import java.awt.Color;

/**
 * Clase principal que permite al usuario crear diferentes figuras geométricas
 * (triángulo, rectángulo y cuadrado) mediante entrada por teclado.
 * <p>
 * Solicita las coordenadas del centro de la figura y sus dimensiones,
 * y muestra por pantalla su perímetro y área.
 * </p>
 * 
 * @version 03-2026
 * @author David_Miguel_Viguera
 * @since 20-03-2026
 */
public class PruebaFigura {

    /**
     * Método principal del programa.
     * Controla el flujo de ejecución mostrando el menú y gestionando
     * la creación de figuras hasta que el usuario decide salir.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        int opción;
        Scanner teclado = new Scanner(System.in);

        do {
            opción = mostrarMenu();
            if (opción != 4) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();

                String frasePerimetro = "El perímetro es ";
                String fraseArea = "El área es ";

                switch (opción) {
                    case 1:
                        triangulo(teclado, x, y, frasePerimetro, fraseArea);
                        break;
                    case 2:
                        rectangulo(teclado, x, y, frasePerimetro, fraseArea);
                        break;
                    case 3:
                        cuadrado(teclado, x, y, frasePerimetro, fraseArea);
                        break;
                }
            }
        } while (opción != 4);

        teclado.close();
    }

    /**
     * Solicita los datos necesarios para crear un cuadrado y muestra
     * su perímetro y área.
     * 
     * @param teclado objeto Scanner para la entrada de datos
     * @param x coordenada X del centro del cuadrado
     * @param y coordenada Y del centro del cuadrado
     * @param frasePerimetro texto a mostrar antes del perímetro
     * @param fraseArea texto a mostrar antes del área
     */
    private static void cuadrado(Scanner teclado, double x, double y, String frasePerimetro, String fraseArea) {
        System.out.print("Introduzca el lado del cuadrado: ");
        double lado = teclado.nextDouble();

        Cuadrado c = new Cuadrado(x, y, Color.red, lado);

        System.out.println(frasePerimetro + c.perimetro());
        System.out.println(fraseArea + c.area());
    }

    /**
     * Solicita los datos necesarios para crear un rectángulo y muestra
     * su perímetro y área.
     * 
     * @param teclado objeto Scanner para la entrada de datos
     * @param x coordenada X del centro del rectángulo
     * @param y coordenada Y del centro del rectángulo
     * @param frasePerimetro texto a mostrar antes del perímetro
     * @param fraseArea texto a mostrar antes del área
     */
    private static void rectangulo(Scanner teclado, double x, double y, String frasePerimetro, String fraseArea) {
        System.out.print("Introduzca la base del rectángulo: ");
        double base = teclado.nextDouble();

        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = teclado.nextDouble();

        Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);

        System.out.println(frasePerimetro + r.perimetro());
        System.out.println(fraseArea + r.area());
    }

    /**
     * Solicita los datos necesarios para crear un triángulo y muestra
     * su perímetro y área.
     * 
     * @param teclado objeto Scanner para la entrada de datos
     * @param x coordenada X del centro del triángulo
     * @param y coordenada Y del centro del triángulo
     * @param frasePerimetro texto a mostrar antes del perímetro
     * @param fraseArea texto a mostrar antes del área
     */
    private static void triangulo(Scanner teclado, double x, double y, String frasePerimetro, String fraseArea) {
        System.out.print("Introduzca el lado 1 del triángulo: ");
        double lado1 = teclado.nextDouble();

        System.out.print("Introduzca el lado 2 del triángulo: ");
        double lado2 = teclado.nextDouble();

        System.out.print("Introduzca el lado 3 del triángulo: ");
        double lado3 = teclado.nextDouble();

        Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);

        System.out.println(frasePerimetro + t.perimetro());
        System.out.println(fraseArea + t.area());
    }

    /**
     * Muestra el menú de opciones al usuario y valida la entrada.
     * 
     * @return un número entero entre 1 y 4 que representa la opción elegida
     */
    public static int mostrarMenu() {
        int opción;
        System.out.println("1) Triángulo");
        System.out.println("2) Rectángulo");
        System.out.println("3) Cuadrado");
        System.out.println("4) Salir");

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Introduzca una opción (1-4): ");
            opción = teclado.nextInt();

            if (opción < 1 || opción > 4) {
                System.out.println("Debe introducir un número entre 1 y 4");
            }
        } while (opción < 1 || opción > 4);

        return opción;
    }
}