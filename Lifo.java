public class Lifo{

    private int topo;
	private int lista[];
		
	Lifo(int tam){
		topo = -1;
		lista = new int [tam];
	}
	
	public boolean retirar(){
		if(topo >= 0){
			topo --;
			return true;
		}
		return false;
	}

	public boolean inserir(int quem){
		if(topo < (lista.length -1)){
			topo ++;
			lista[topo] = quem;
			return true;
		}
		return false;
	}
	
	public void detonar(){
		topo = -1;
	}
	
	public void mostrar(){
		int aux;
		if(topo >= 0){
			System.out.print("\nVeja a lista Lifo");
			for(aux = topo; aux >=0; aux--)
			System.out.print("\n"+lista[aux]);
		}
		else
			System.out.println("\nLista vazia");
	}


}