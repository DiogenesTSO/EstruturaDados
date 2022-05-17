import javax.swing.JOptionPane;

public class Principal
		{public static void main(String[] args)
			{
				int Opcao = 0;
				int setorproc, quantproc;
				
				String EntraOpcao;
				
				Metodos arvore;
				
				arvore = new Metodos();
				
				arvore.Construir(arvore.getRaiz() , 'r' , 0, Opcao);
				
				do
					{					EntraOpcao = JOptionPane.showInputDialog("\t Menu \n\n 1.Achar Setor \n 2.Achar Quantidade \n 3.Media \n 4.Achar Maior \n 5.Achar Menor \n 6.Mostrar Tudo Pre \n 7.Mostrar Tudo Pos \n\n\t9.Vazar\n\n\tEscolha a opcao:");
					 Opcao = Integer.parseInt(EntraOpcao);
					 
					 switch(Opcao)
						{case 1:
								EntraOpcao = JOptionPane.showInputDialog("Informe O Setor");
								setorproc = Integer.parseInt(EntraOpcao);
								arvore.ProcurarSetor(arvore.getRaiz(), setorproc); 
								
								break;
								
						 case 2: //achar quantidade
							 	EntraOpcao = JOptionPane.showInputDialog("Informe O Setor");
								quantproc = Integer.parseInt(EntraOpcao);
								arvore.ProcurarQuantidade(arvore.getRaiz(), quantproc); 
								
								break;
								
						 case 3: //Calcular MEdia
							 	arvore.Media(arvore.getRaiz());
							 	arvore.Calcula();
							 	
							 	break;
							
						 case 4: // Mais Funcionario 
							 	arvore.Maior(arvore.getRaiz());
							 	arvore.MostrarMaior();
							 	
							 	break;
							 	
						 case 5: // Menos Funcionario
							 	arvore.Menor(arvore.getRaiz());
							 	arvore.MostrarMenor();
							 	
							 	break;
							 	
						 case 6:
							 if(arvore.getRaiz() != null)
							 	arvore.Pre_Ordem_Preferencia_Esquerda(arvore.getRaiz());
							 else
							 	System.out.println("Insira uma arvore!");
							 break;
							
						 case 7:
							 if(arvore.getRaiz() != null)
							 	arvore.Pos_OrdemEsq(arvore.getRaiz());
							 else
							 	System.out.println("Insira uma arvore!");
							 break;
						}
					 
					 
					}while(Opcao != 9);
			}
		}