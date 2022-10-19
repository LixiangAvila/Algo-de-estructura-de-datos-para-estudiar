
package algo_de_estuctura_de_datos_para_estudiar;

import java.util.Scanner;

class Cola {
    private int arreglo[], fin;
    
    Cola (int x)
    {
        fin=-1;
        arreglo=new int[x];
    }
    
    boolean agregar (int dato)
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
                System.out.println(arreglo[i]);
        }
    }
    
    boolean avanzar(int dat[])
    {
        if(fin == -1)
            return false;
        dat[0]=arreglo[0];
        for(int i=0; i < fin; i++)
            arreglo[i]=arreglo[i+1];
        fin--;
        return true;
    }
}

public class Algo_de_estuctura_de_datos_para_estudiar {
    
    static char menu(Scanner input)
    {
        char opcion;
        System.out.println("\na.-Agregar \nb.-Exhibir \nc.-Avanzar \nd.-Buscar \ne.-Limpiar \nf.-Modificar \ng.-Intercambiar \nh.-Eliminar \nx.-Salir");
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
                    int dat;
                    dat=teclado.nextInt();
                    
                    teclado.nextLine();     //extrae el dato
              
                    if (cx.agregar(dat))
                        System.out.println("Dato agregado... ");
                    else
                        System.out.println("Cola llena, no se puede agregar dato");
                break;    
                case 'b':
                    cx.exhibir();
                break;
                case 'c'|'C':
                    int dato[];
                    
                    dato=new int[1];
                    if (cx.avanzar(dato))
                        System.out.println("\n El dato: "+ dato[0] + " avanzo en la cola...");
                    else
                        System.out.println("\nCola vacia...");
                break;
                case 'd'|'D':
                    System.out.println("buscar dato");
                break;
                case 'e'|'E':
                    System.out.println("limpiar datos");
                    break;
                case 'f'|'F':
                    System.out.println("modificar dato");
                    break;
                case 'g'|'G':
                    System.out.println("intercambiar dato");
                    break;
                case 'h'|'H':
                    System.out.println("eliminar dato");
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
