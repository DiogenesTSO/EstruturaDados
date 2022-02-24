import javax.swing.JOptionPane;

public class UsaLifo {

	public static void main(String[] args) {
		
		String entra;
		int idade, opcao, aux;
		Lifo minhaPilha;
		
		entra = JOptionPane.showInputDialog("Informe o tamanho da lista");
		aux = Integer.parseInt(entra);
		minhaPilha = new Lifo(aux);
		
		do {
			entra = JOptionPane.showInputDialog("\n\n\nSistema para pilha"+ "\n\n\t\t\tMenu\n\n\t1. Inserir\n\t2. Retirar"+
												"\n\t3. Mostrar\n\t4. Detonar\n\t9. Sair\n\n\tDigite sua opcao");
			opcao = Integer.parseInt(entra);
			
			switch (opcao){
				case 1: entra = JOptionPane.showInputDialog("Informe a idade");
				idade = Integer.parseInt(entra);
				if (minhaPilha.inserir(idade)== true)
				System.out.print("\nIdade inserida com sucesso");
			else
				System.out.print("\nImpossivel inserir - OVERFLOW ");
			break;
			
				case 2:	if (minhaPilha.retirar()== true)
				System.out.print("\nElemento retirado do topo");
		else
				System.out.print("\nImpossivel retirar - UNDERFLOW ");
		break;
				case 3: minhaPilha.mostrar();
		break;
				case 4: minhaPilha.detonar();
		}
			
			} while (opcao != 9);
		System.out.println("\nValeu");
	}
}