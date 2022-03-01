import javax.swing.JOptionPane;

public class UsaFifo {

	public static void main(String[] args) {

        String entra;
        int idade, opcao, aux;
        Fifo minhaFila;

        entra = JOptionPane.showInputDialog("Informe o tamanho da fila");
        aux = Integer.parseInt(entra);
        minhaFila = new Fifo(aux);

        do {
			entra = JOptionPane.showInputDialog("\n\n\nSistema para fila"+ "\n\n\t\t\tMenu\n\n\t1. Inserir\n\t2. Retirar"+
												"\n\t3. Mostrar\n\t4. Detonar\n\t9. Sair\n\n\tDigite sua opcao");
			opcao = Integer.parseInt(entra);

            switch(opcao){
                case 1: entra = JOptionPane.showInputDialog("Informe a idade");
                idade = Integer.parseInt(entra);
                if(minhaFila.inserir(idade) == true)
                System.out.println("\nIdade inserida com sucesso");
                else
                System.out.println("\nImpossivel inserir - OVERFLOW");
                break;
                case 2: aux = minhaFila.retirar();
                if(aux == -999)
                System.out.println("A lista está vazia");
                else 
                System.out.println("\nFoi retirado o primeiro elemento da fila" + aux);
                break;
                case 3: minhaFila.mostrar();
		        break;
				case 4: minhaFila.detonar();
                break;
		}
			
			} while (opcao != 9);
		System.out.println("\nValeu");
            
            }
    
    
}


