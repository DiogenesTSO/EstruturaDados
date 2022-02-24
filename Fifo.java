public class Fifo {

    private int comeco;
	private int fim;
	private int fila[];
	
	Fifo(){
		fila = new int[20];
		comeco = -1;
		fim = -1;
	}
	
    public Fifo(int aux) {
    }

    //Inserir um elemento na fila.
	public boolean inserir(int veio){
		int aux;
		aux = (fim + 1) % fila.length;
		if (aux != comeco){
			fim = aux;
			fila[aux] = veio;
			if(comeco < 0)
				comeco = 0;

			return true;
	}
			return false;
	}
	
    //Retirar o primeiro elemento da fila.
		public int retirar(){
			int volta = -999;
			if(comeco >= 0){
				volta = fila[comeco];
				if(comeco == fim){
					comeco = -1;
					fim = -1;
				}
				else
					comeco = (comeco + 1) % fila.length;
			}
			return volta;
		}
		
        //Mostrar os elementos da fila.
		public void mostrar(){
			int aux;
			if(comeco < 0){
				System.out.println("\nLista vazia: ");
                return;
            }
                aux = comeco;
                System.out.print("" +fila[aux]);
                while (aux != fim){
				aux = (aux + 1) % fila.length;
                System.out.print(""+fila[aux]);
                }
            }
        
		
		//Excluir a fila.
		public void detonar(){
			comeco = -1;
			fim = -1;
		}
}
