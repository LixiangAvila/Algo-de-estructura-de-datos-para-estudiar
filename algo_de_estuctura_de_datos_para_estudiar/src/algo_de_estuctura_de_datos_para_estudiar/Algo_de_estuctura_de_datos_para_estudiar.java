
package algo_de_estuctura_de_datos_para_estudiar;

import java.util.Scanner;

class Cola {
    private int fin, inicio;
    private String arreglo[];
    Cola (int x)
    {
        fin=-1;
        arreglo=new String[x];
    }
    
    boolean agregar (String dato)
    {
       if(fin == arreglo.length-1)
           return false;
       fin++;
       arreglo[fin]=dato;
       return true;
    }
    
    void exhibir()
    {
        if(fin == -1)
            System.out.println("cola vacia");
        else
        {
            System.out.println("contenido de la cola");
            for (int i=0; i <= fin; i++)
                System.out.println(i+1 + ".-" + arreglo[i]);
        }
    }
    
    boolean avanzar(String dat[])
    {
        if(fin == -1)
            return false;
        dat[0]=arreglo[0];
        for(int i=0; i < fin; i++)
            arreglo[i]=arreglo[i+1];
        fin--;
        return true;
    }
    
    boolean intercambiar (){
        int posicionPrimerDato, posicionSegundoDato;
        String primerDato, segundoDato;
        if(fin == -1)
            return false;
        for (int i=0; i <= fin; i++){
                System.out.println(i+1+".-"+arreglo[i]);
        }
        System.out.println("Elige la posicicon del primer dato: ");
        Scanner teclado = new Scanner(System.in);
        posicionPrimerDato=teclado.nextInt();
        System.out.println("Elige la posicion del segudno dato: ");
        posicionSegundoDato=teclado.nextInt();
        primerDato=arreglo[posicionPrimerDato-1];
        segundoDato=arreglo[posicionSegundoDato-1];
        arreglo[posicionPrimerDato-1]=segundoDato;
        arreglo[posicionSegundoDato-1]=primerDato;
        return true;
        
    }
    
    boolean editar ()
    {
        int posicionParaEditar; 
        String datoNuevo;
        if (fin == -1)
            return false;
        for (int i=0; i <= fin; i++){
            System.out.println(i+1+".-"+arreglo[i]);   
        }
        System.out.println("Elige la posicion del dato a editar");
        Scanner teclado = new Scanner (System.in);
        posicionParaEditar= teclado.nextInt();
        System.out.println("Ingresa el nuevo dato: ");
        datoNuevo= teclado.nextLine();
        arreglo[posicionParaEditar-1]=datoNuevo;
        System.out.println("Dato editado: ");
        return true;   
    }
    
    boolean avanzarVariosDatos ()
    {
        if (fin == -1)
            return false;
        int numeroDeDatos;
        System.out.println("Escriba cuantos datos va a eliminar");
        Scanner teclado = new Scanner (System.in);
        numeroDeDatos=teclado.nextInt();
        String dato[];
        dato = new String [numeroDeDatos];
        
            for (int i=0; i<=numeroDeDatos-1; i++){
                dato[i]=arreglo[i];
            }
            for (int i=0; i<=fin; i++){
                arreglo[i]=arreglo[i+numeroDeDatos];
                fin--;
            }
        return true;
    }
    
     boolean limpiarTodo ()
    {
        if (fin == -1)
            return false;
        for (int i=0; i <= fin+1; i++){
            arreglo[i]=arreglo[fin+1];
            fin--;
        }
        
     return true;
    }
     boolean buscar ()
     {
         int posicionDeDato;
         String datoParaBuscar;
         posicionDeDato=0;
         System.out.println("Ponga el dato a buscar");
         Scanner teclado = new Scanner(System.in);
         datoParaBuscar=teclado.nextLine();
         for (int i=0 ; i <=fin; i++){
             if(arreglo[i]== datoParaBuscar){
                 posicionDeDato=posicionDeDato + i;
             }
         }
         System.out.println("el dato se encuentra en las posiciones: " + posicionDeDato);
         return true;
     }
}

public class Algo_de_estuctura_de_datos_para_estudiar {
    
    static char menu(Scanner input)
    {
        char opcion;
        System.out.println("\na.-Agregar \nb.-Exhibir \nc.-Avanzar \nd.-Intercambiar \ne.-Editar \nf.-Avanzar varios datos \ng.-Limpiar todo \nh.-Buscar \nx.-Salir");
        opcion=input.nextLine().charAt(0);
        return opcion;
    }
    public static void main(String[] args) {
        int max;
        char opc;
        
        Scanner teclado;
        System.out.println("Pon el tamaño de la cola: ");
        teclado=new Scanner(System.in);
        max=teclado.nextInt();
        
        teclado.nextLine(); // saca la cantidad ingresada
        
        Cola cx;
        cx= new Cola(max);
        
        
        do
        {
            opc=menu(teclado);
            switch(opc)
            {
                case 'a':
                    System.out.println("Pon dato a agregar");
                    String dat;
                    dat=teclado.nextLine();
                                  
                    if (cx.agregar(dat))
                        System.out.println("Dato agregado... ");
                    else
                        System.out.println("Cola llena, no se puede agregar dato");
                break;    
                case 'b':
                    cx.exhibir();
                break;
                case 'c'|'C':
                    String dato[];
                    
                    dato=new String[1];
                    if (cx.avanzar(dato))
                        System.out.println("\n El dato: "+ dato[0] + " avanzo en la cola...");
                    else
                        System.out.println("\nCola vacia...");
                break;
                case 'd'|'D':
                    if(cx.intercambiar())
                        System.out.println("Datos cambiados");
                    else
                        System.out.println("\nCola vacia");
                break;
                case 'e'|'E':
                    if(cx.editar())
                        System.out.println("");
                    else
                        System.out.println("Cola vacia");
                    break;
                case 'f'|'F':
                    if(cx.avanzarVariosDatos())
                        System.out.println("Datos avanzados");
                    else
                        System.out.println("\n Cola vacia");
                    break;
                case 'g'|'G':
                    if(cx.limpiarTodo())
                        System.out.println("todo  eliminado");
                    else
                        System.out.println("cola vacia");
                    break;
                case 'h'|'H':
                    cx.buscar();
                    break;
                default:
                    System.out.println("asdfr");
                break;
                case 'x'|'X':
                    System.out.println("saliendo");
                break;
            }
        }
        while(opc!='x' && opc!='X');
            
        
        
    }
}
