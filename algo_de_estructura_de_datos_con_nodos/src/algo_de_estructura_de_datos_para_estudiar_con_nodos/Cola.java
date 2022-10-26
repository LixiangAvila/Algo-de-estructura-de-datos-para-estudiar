
package algo_de_estructura_de_datos_para_estudiar_con_nodos;


public class Cola {
    
    class Nodo {
        
    }
    NodoCola inicio,fin;
    int tamaño;
    public Cola(){
        inicio=fin=null;
        tamaño=0;
    }
    
    public boolean vacia ()
    {
        
        return inicio == null;
    }
    
    public void insertar (char elemento)
    {
        NodoCola nuevo = new NodoCola(elemento);
        if(vacia())
        {
            inicio=nuevo;
        }else{
            fin.sig=nuevo;
        }
        fin=nuevo;
        tamaño++;
    }
    
    public int quitar()
    {
        int aux=inicio.dato;
        inicio=inicio.sig;
        tamaño--;
        return aux;
    }
    public int iniCola()
    {
        return inicio.dato;
    }
    
    public int tamCola()
    {
        return tamaño;
    }
}
