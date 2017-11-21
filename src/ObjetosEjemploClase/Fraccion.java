
package ObjetosEjemploClase;

/**
 *
 * @author likendero
 */
public class Fraccion {
    private int denominador;
    private int numerador;
    //constructores
    public Fraccion(){
        super();
        this.denominador=1;
        this.numerador=1;
    }
    public Fraccion(int numerador,int denominador){
        super();
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public Fraccion(Fraccion fraccion2){
        super();
        this.numerador=fraccion2.numerador;
        this.denominador=fraccion2.denominador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    @Override
    public String toString(){
        return "numerador "+numerador+" denominador "+denominador;
    }
    /**
     * suma a la fraccion instanciada otra fraccion
     * @param fraccion2 fracción que se va  a sumar
     */
    public void suma (Fraccion fraccion2){
        if(this.getDenominador()==fraccion2.getDenominador()){
            this.setNumerador(fraccion2.getNumerador()+this.getNumerador());
        }
    }
    /**
     * metodo que resta a la instancia otra Fraccion
     * @param fraccion2 fraccion que resta
     */
    public void resta (Fraccion fraccion2){
        if(this.getDenominador()==fraccion2.getDenominador()){
            this.setNumerador(fraccion2.getNumerador()-this.getNumerador());
        }
    }
    /**
     * metodo que multiplica la instancia por otra fraccion
     * @param fraccion2 fraccion que multiplica
     */
    public void multiplicacion (Fraccion fraccion2){
        this.setNumerador(fraccion2.getNumerador()*this.getNumerador());
        this.setDenominador(fraccion2.getDenominador()*this.getDenominador());
    }
    /**
     * 
     * @param fraccion2 
     */
    public void division (Fraccion fraccion2){
        this.setNumerador(fraccion2.getDenominador()*this.getNumerador());
        this.setDenominador(fraccion2.getNumerador()*this.getDenominador());
    }
}
