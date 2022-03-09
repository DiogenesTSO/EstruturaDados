package LifoDinamico;

public class Lifo {
    private Nodo topo;

    Lifo(){
        topo = null;
    }

    public void inserir(int quem){
        Nodo aux;
        aux = new Nodo(quem);
        aux.vizinho = topo;
        topo = aux;
    }

    public int retirar(){
        int aux = -999;
            if(topo == null){
                aux = topo.matricula;
                topo = topo.vizinho;
         }

         return aux;        

    }

    public void mostrar(){
        Nodo aux;
        if(topo == null){
            System.out.println("Lista vazia");
            return;
        }
        System.out.println("\nVeja a lista: ");
        aux = topo;
        while (aux != null){
            System.out.println(" "+aux.matricula);
            aux = aux.vizinho;
        }
        
    }

    public void detonar(){
        topo = null;
    }
    
}
