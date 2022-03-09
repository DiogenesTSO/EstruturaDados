package FifoDinamico;

public class Fifo {

    private Nodo comeco;
    private Nodo fim;

    Fifo(){
        comeco = null;
        fim = null;
    }

    public  void inserir (int quem){
        Nodo aux;
        aux = new Nodo(quem);
        if (comeco == null)
            comeco = aux;
            else
                fim.seguinte = aux;
                fim = aux;
    }
                
        public int retirar(){
            int aux = -999;
            if (comeco != null){
                aux = comeco.matricula;
                comeco = comeco.seguinte;
                if (comeco == null)
                fim = null;
            }
            return aux;
        }

        public void mostrar(){
            Nodo aux;
            System.out.println("Veja a lista a seguir: ");
            aux = comeco;
            while (aux != null){
                System.out.println("Matricula: " +aux.matricula);
                aux = aux.seguinte;
            }
        }

            public void detonar(){
                comeco = null;
                fim = null;
            }

            public int procurar(int matriculabusca){
                for (Nodo aux = comeco; aux != null; aux = aux.seguinte){
                    if (aux.matricula == matriculabusca){
                        return 1;
                    }
                }
                    return -1;
            }
        }

        //public boolean procurar (int quem){
          //  Nodo aux = comeco;
          //  while (aux != null){
          //      if (aux.matricula == quem)
          //      return true;
           //     aux = aux.seguinte;
         //   }
         //   return false;
     //   }
    
    

