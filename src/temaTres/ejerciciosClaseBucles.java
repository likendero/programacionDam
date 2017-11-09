package temaTres;
    import java.util.Scanner;
/**
 *
 * @author likendero
 */
/*
estos son los ejercicos de clase de bucles, hay que hacerlos con los 3 bucles
*/
public class ejerciciosClaseBucles {
    public static void main(String[] args) {
        try (Scanner ent=new Scanner(System.in)){
            //numerosHastaDiez();
            //notasHastaCero(ent);
            primosEntreIntroducidos(ent);
            ent.close();
        }
    }
    public static void numerosHastaDiez(){
        //variables
        int cont=1;
        while(cont<=10){
            System.out.println(cont++);
        }
        System.out.println("fin while");
        cont=0;
        do{
            System.out.println(cont++);
        }while(cont<=10);
        System.out.println("fin do while");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("fin for");
    }
    public static void notasHastaCero(Scanner ent){
        //variables
       int notas,suma,cont;
        notas=1;
        suma=0;
        cont=0;
        //cuerpo
        while(notas>0){
            System.out.println("introduce una nota");
            notas=ent.nextInt();
            if(notas>0 && notas<=10){
                suma+=notas;
                cont++;
            }
            if(notas>10)System.out.println("nota no valida");
        }
        System.out.println("la nota media es "+(double)suma/(double)cont);
        cont=0;
        suma=0;
        System.out.println("fin while");
        do{
            System.out.println("introduce una nota");
            notas=ent.nextInt();
            if(notas>0 && notas<=10){
                suma+=notas;
                cont++;
            }
            if(notas>10)System.out.println("nota no valida");
        }while(notas>0);
        System.out.println("la nota media es "+(double)suma/(double)cont);
        cont=0;
        suma=0;
        System.out.println("fin do while");
        for (;notas>0;) {
            System.out.println("introduce una nota");
            notas=ent.nextInt();
            if(notas>0 && notas<=10){
                suma+=notas;
                cont++;
            }
            if(notas>10)System.out.println("nota no valida");
        }
        System.out.println("la nota media es "+(double)suma/(double)cont);
        System.out.println("fin for");
    }
    public static void primosEntreIntroducidos(Scanner ent){
        //variables
        int primoInf,primoSup,cont;
        boolean esPrimo;
        primoInf=0;
        primoSup=0;
        cont=2;
        esPrimo=true;
        //cuerpo
        while(primoInf>=primoSup || primoInf<2){
            System.out.println("introduce la cota inferior(mayor que 2)");
            primoInf=ent.nextInt();
            System.out.println("Introduce la cota superior(mayor que la inferior)");
            primoSup=ent.nextInt();
        }
        while(primoInf<=primoSup){
            while(cont<primoInf){
                if(primoInf%cont==0){
                    esPrimo=false;
                    cont=primoInf;
                }
                cont++;
            }
            if(esPrimo)System.out.println(primoInf+"es primo");
            cont=2;
            primoInf++;
            esPrimo=true;
        }
    }
  }
    

