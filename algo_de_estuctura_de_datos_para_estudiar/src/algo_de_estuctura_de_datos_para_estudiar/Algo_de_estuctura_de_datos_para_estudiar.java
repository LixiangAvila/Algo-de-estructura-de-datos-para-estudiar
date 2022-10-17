
package algo_de_estuctura_de_datos_para_estudiar;

import java.util.Scanner;

class Cola {
    
}

public class Algo_de_estuctura_de_datos_para_estudiar {
    
    static char menu(Scanner input)
    {
        char opcion;
        System.out.println("Elige algo");
        opcion=input.nextLine().charAt(0);
        return opcion;
    }
    public static void main(String[] args) {

        char opc;
        
        Scanner teclado;
        
        teclado=new Scanner(System.in);
        int max=teclado.nextInt();
        
        teclado.nextLine(); // saca la cantidad ingresada
        
        opc=menu(teclado);
                
    }
}
