package rectangle;
import rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.height = 5.0;
        r.width = 3.0;

        System.out.println("Área do Retangulo: " +
                r.Area());
        System.out.println("Perimetro do Retangulo: " +
                r.Perimeter());
        System.out.println("Diagonal do Retangulo: " +
                r.Diagonal());
    }
}