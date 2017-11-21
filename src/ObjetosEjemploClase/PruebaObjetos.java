
package ObjetosEjemploClase;

/**
 *
 * @author likendero
 */
public class PruebaObjetos {
    public static void main(String[] args) {
        Fraccion racional1=new Fraccion();
        Fraccion racional2=new Fraccion(2,3);
        Fraccion racional3=new Fraccion(racional2);
        
        racional1.suma(racional2);
        System.out.println(racional1.toString());
        racional2.suma(racional3);
        System.out.println(racional2.toString());
        racional3.multiplicacion(racional1);
        System.out.println(racional3.toString());
        racional1.division(racional2);
        System.out.println(racional1.toString());
    }
}
