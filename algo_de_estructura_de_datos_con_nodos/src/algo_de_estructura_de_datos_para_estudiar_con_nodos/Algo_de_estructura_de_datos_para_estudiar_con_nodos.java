package algo_de_estructura_de_datos_para_estudiar_con_nodos;

import java.util.Scanner;

public class Algo_de_estructura_de_datos_para_estudiar_con_nodos {
    
    static char menu(Scanner input)
    {
        char opcion;
        System.out.println("\na.-Agregar \nb.-Exhibir \nc.-Avanzar \nd.-Intercambiar \ne.-Editar \nf.-Avanzar varios datos \ng.-Limpiar todo \nh.-Buscar \nx.-Salir");
        opcion=input.nextLine().charAt(0);
        return opcion;
    }

    public static void main(String[] args) {
        char opc;
        
        Scanner teclado;
        System.out.println("Pon el tamaño de la cola: ");
        teclado=new Scanner(System.in);
        
        teclado.nextLine(); // saca la cantidad ingresada
        
        
        do
        {
            opc=menu(teclado);
            switch(opc)
            {
                case 'a':
                    System.out.println("Pon dato a agregar");
                break;    
                case 'b':
                   
                break;
                case 'c'|'C':
                    
                break;
                case 'd'|'D':
                    
                break;
                case 'e'|'E':
                   
                case 'f'|'F':
                    
                case 'g'|'G':
                    
                    break;
                case 'h'|'H':
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
            
        
        //Recordar acomodar el menu para la clase cola, y la clase nodo cola dentro de la otra clase
    
    }
    
}
