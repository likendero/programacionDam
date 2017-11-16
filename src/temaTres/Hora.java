
package temaTres;

/*
->constructores
por defecto =1 de la tarde
constructor de clase
copia
->metodos
setter y getters
2 tostring, el clasico y escribe la hora con formato HH:MM:SS
validar la hora 
hora seguendo siguiente 
hora segundo anterior 
*/
/**
 *
 * @author liken
 */
public class Hora {
    private int hora;
    private int segundos;
    private int minutos;
    /**
     * constructor por defecto
     */
    public Hora(){
        super();
        this.hora=0;
        this.minutos=0;
        this.segundos=0;
    }
    /**
     * constructor completo con todos los datos, 
     * @param hora dato entero con la hora, minimo 0 y menor que 24
     * @param minutos dato entero que almacena los minutos, minimo  0 y menor que 60
     * @param segundos dato entero que almacena los segundos, minimo  0 y menor que 60 
     */
    public Hora(int hora,int minutos,int segundos){
        super();
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    /**
     * constructor que copia a otra instancia del objeto Hora
     * @param hora2 Hora a copiar
     */
    public Hora(Hora hora2){
        super();
        this.hora=hora2.hora;
        this.segundos=hora2.segundos;
        this.minutos=hora2.minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    @Override
    public String toString(){
        return "hora: "+hora+" minutos: "+minutos+" segundos: "+segundos;
    }
    /**
     * formateo de la hora
     * @return la hora con formato HH:MM:SS
     */
    public String mostrarHora(){
        String fh="";
        String fm="";
        String fs="";
        if(segundos>=9){
            fs+=segundos;
        }else{
            fs+=0;
            fs+=segundos;
        }
        if(minutos>=9){
            fm+=minutos;
        }else{
            fm+=0;
            fm+=minutos;
        }
        if(hora>=9){
            fh+=hora;
        }else{
            fh+=0;
            fh+=hora;
        }
        return fh+":"+fm+":"+fs;
    }
    /**
     * comprobacion de la hora
     * @return devuelve true o false segun si la hora es valida
     */
    public boolean validarHora(){
        
        if(hora>=24 || hora<0)return false;
        if(minutos>59 || minutos<0)return false;
        if(segundos>59 || segundos<0)return false;
        return true;
    }
    /**
     * suma un segundo a la hora cuadrandola para que sea correcta
     */
    public void sumarSegundo(){
        
        if(segundos==59){
            segundos=0;
            minutos+=1;
        }else segundos+=1;
        if(minutos==60){
            minutos=0;
            hora+=1;
        }
        if( hora==24)hora=0;
    }
    /**
     * resta un segundo a la hora cuadrandola para que sea correcta
     */
    public void segundoAnterior(){
        if(segundos==0){
            segundos=59;
            minutos-=1;
        }else segundos-=1;
        if(minutos==-1){
            minutos=59;
            hora-=1;
        }
        if(hora==-1){
            hora=23;
        }
    }
}
