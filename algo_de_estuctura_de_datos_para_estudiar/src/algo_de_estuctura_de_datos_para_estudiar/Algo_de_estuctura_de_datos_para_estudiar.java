
package algo_de_estuctura_de_datos_para_estudiar;

import java.util.Scanner;

class Cola {
    private int arreglo[], fin;
    
    Cola (int x)
    {
        fin=-1;
        arreglo=new int[x];
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
                    

                    
                break;    
                case 'b':
                    System.out.println("exhibe algo");
                break;
                case 'c'|'C':
                    System.out.println("Avanzar dato");
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
