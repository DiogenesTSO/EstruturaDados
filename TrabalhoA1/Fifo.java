public class Fifo {

    private Nodo comeco;
    private Nodo fim;

    Fifo(){
        comeco = null;
        fim = null;
    }

        public void inserir(int mtr, int idd){
            Nodo aux;

            aux = new Nodo(mtr, idd);
            aux.anterior = null;
            aux.seguinte = null;

            if (comeco == null)
                comeco = aux;
            else
                fim.seguinte = aux;
                aux.anterior = fim;
                fim = aux;
            
        }

        public int retirar(){
            int aux = -999;

            if (comeco != null){
                aux = comeco.matricula;
                comeco = comeco.seguinte;
                comeco.anterior = null;

                if (comeco == null)
                    fim = null;
            }
            return aux;
        }

        public void mostrar(){
            Nodo aux;
            System.out.println("Veja a lista FIFO a seguir: ");
            aux = comeco;

            while (aux != null){
                System.out.println("Matricula: " +aux.matricula);
                aux = aux.seguinte;
            }
        }

        public void mostrarInvertido(){
            Nodo aux;
            System.out.println("Veja a lista FIFO invertida a seguir: ");
            aux = fim;
            while (aux != null){
                System.out.println("Matricula: " +aux.matricula);
                aux = aux.anterior;
            }
        }

        public void detonar(){
            comeco = null;
            fim = null;
        }

        public int procurar(int matriculaBusca) {
            for (Nodo aux = comeco; aux != null; aux = aux.seguinte) {
                if (aux.matricula == matriculaBusca) {
                    return 1;
                }
            }
            return -1;
        }
        
    
        public int maisVelho(){
            int idade = 0;
            int mtr = 0;

            for (Nodo aux = comeco; aux != null; aux = aux.seguinte){
                if (aux.idade > idade){
                    idade = aux.idade;
                    mtr = aux.matricula;
                }
            }
            return mtr;
        }

        public int mediaIdade(){
            int qtd = 0, totalIdade = 0;

            for (Nodo aux = comeco; aux != null; aux = aux.seguinte){
                if (comeco == null){
                    return 0;
                }

                qtd = qtd + 1;
                totalIdade = totalIdade + aux.idade;
            }
                return totalIdade / qtd;
        }

        public int cabeca(){
            if (comeco == null)
                return -999;
            return comeco.matricula;
            }

               
            public int ultimo(){
                Nodo aux;
                System.out.println("A ultima matricula da fila é: ");
                aux = fim;
                while (aux != null) {
                    aux = aux.seguinte;
                }
                return fim.matricula;


            }
}
