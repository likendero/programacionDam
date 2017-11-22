
package punto;

/**
 * clase que establece las coordenadas x e y de un punto y opera con ellas
 * @author diurno
 */
public class Punto {
    private int x;
    private int y;
    /**
     * cnstructor por defecto, establece x e y a 0
     */
    public Punto(){
        super();
        this.x=0;
        this.y=0;
    }
    /**
     * Constructor de clase, establece todos los atributos
     * @param x valor de la coordenada del punto en x
     * @param y valor de la coordenada del punto en y
     */
    public Punto(int x, int y){
        super();
        this.x=x;
        this.y=y;
    }
    /**
     * Constructor de copia, coge los atributos de otro punto
     * @param punto2 punto a copiar
     */
    public Punto(Punto punto2){
        super();
        this.x=punto2.x;
        this.y=punto2.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString(){
    
    }
}
