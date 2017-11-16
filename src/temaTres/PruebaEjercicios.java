/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temaTres;

import java.math.BigInteger;

/**
 *
 * @author likendero
 */
public class PruebaEjercicios {
    public static void main(String[] args) {
        Hora hora=new Hora(23,43,59);
        hora.sumarSegundo();
        System.out.println(hora.mostrarHora());
        hora.segundoAnterior();
        System.out.println(hora.mostrarHora());
        System.out.println(hora.validarHora()?"la hora es correcta":"la hora es "
                + "incorrecta");
        /*
        long n=10l;
        int factorial=1;
        int suma=0;
        for(int i=1;i<=n;i++){
            factorial=1;
            for(int j=1;j<=i;j++){
                factorial*=j;
                System.out.println("factorial: "+factorial);
            }
            suma+=factorial;
        }
        System.out.println(suma);
        */
        
    }
}
