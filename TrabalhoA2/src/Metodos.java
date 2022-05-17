
	import javax.swing.JOptionPane;

	public class Metodos
		{
			private Nodo Raiz;
			Metodos ()
				{Raiz = null;
				}
			
			public Nodo getRaiz()
				{return Raiz;
				}
			
			public void Construir(Nodo Filho, char Lado, int Setor, int Funcionario)
				{String Entra;
				 int Lido,Lido2=0;
				 Nodo Onde;
				 
				 
				 if(Lado == 'r') {
				 	Entra = JOptionPane.showInputDialog("Informe o Setor!");
				 	Lido = Integer.parseInt(Entra);
				 	Entra = JOptionPane.showInputDialog("Informe a Quantidade!");
				 	Lido2 = Integer.parseInt(Entra);
				 }
				 	 else
				 		 {if(Lado == 'e') {
				 		 	Entra = JOptionPane.showInputDialog("Informe o Setor esquerdo de " + Setor);
				 		 	Lido = Integer.parseInt(Entra);
				 		 	if (Lido !=0) {
				 		 		Entra = JOptionPane.showInputDialog("Informe a Quantidade do setor esquerdo de " + Setor);
				 		 		Lido2 = Integer.parseInt(Entra);
				 		 		}			 		 	
				 		 }
				 		 	 	else {
				 		 	 		Entra = JOptionPane.showInputDialog("Informe o setor Direito de " + Setor);
				 		 	 		Lido = Integer.parseInt(Entra);
				 		 	 		if (Lido !=0) {
						 		 		Entra = JOptionPane.showInputDialog("Informe a Quantidade do setor esquerdo de " + Setor);
						 		 		Lido2 = Integer.parseInt(Entra);
						 		 		}	
				 		 	 	}
				 		 } 	
				 if(Lido != 0)
				 	{Onde = Coloca(Filho, Lido,Lido2,Lado);
				 	 Construir(Onde, 'e', Lido,Lido2);
				 	 Construir(Onde, 'd', Lido,Lido2);
				 	}
				}
			
			public Nodo Coloca(Nodo Atual, int Setor, int Funcionario, char ld)
				{Nodo Alocou;
				 Alocou = new Nodo(Setor, Funcionario);
				 
				 if(Raiz == null)
					 Raiz = Alocou;
				 else
				 	{if(ld == 'e')
				 		Atual.FilhoEsquerdo = Alocou;
				 	 else
				 		Atual.FilhoDireito = Alocou;
				 	}
				 return Alocou;
				}
			
			public void Pre_Ordem_Preferencia_Esquerda(Nodo Raiz)
				{if(Raiz != null)
					{System.out.println(" " + Raiz.Setor);
					 Pre_Ordem_Preferencia_Esquerda(Raiz.FilhoEsquerdo);
					 Pre_Ordem_Preferencia_Esquerda(Raiz.FilhoDireito);
					}
				}
			
			
			public void Pos_OrdemEsq(Nodo Raiz)
				{if(Raiz != null)
					{Pos_OrdemEsq(Raiz.FilhoEsquerdo);
					 Pos_OrdemEsq(Raiz.FilhoDireito);
					 System.out.println("" + Raiz.Setor);
					}
				}
			
			
			
			public void ProcurarSetor(Nodo Raiz, int procurado) {
				if (Raiz != null) {
					if (Raiz.Setor == procurado) {
						System.out.println("Setor Encontrado");
						}
					ProcurarSetor(Raiz.FilhoEsquerdo, procurado);
					ProcurarSetor(Raiz.FilhoDireito, procurado);
				}
			}
			
			
			public void ProcurarQuantidade(Nodo Raiz, int procurado) {
				if (Raiz != null) {
					if (Raiz.Setor == procurado) {
						System.out.println("O numero de funcionarios neste setor é: " + Raiz.Funcionario);
						}
					ProcurarQuantidade(Raiz.FilhoDireito, procurado);
					ProcurarQuantidade(Raiz.FilhoEsquerdo, procurado);
				}
			}
			
			int somasetor,somaquant;
			
			public void Media (Nodo Raiz) {
				if (Raiz !=null) {
					Media(Raiz.FilhoEsquerdo);
					Media(Raiz.FilhoDireito);
					somasetor++;
					somaquant = somaquant + Raiz.Funcionario;
				}
			}
			
			public void Calcula() {
				int total;
				total = somaquant / somasetor;
				System.out.println("Media é: " +total);
				
			}
			
			int Maior=0,Setormaior;
			
			public void Maior(Nodo Raiz) {
				if (Raiz != null) {
					Maior(Raiz.FilhoDireito);
					Maior(Raiz.FilhoEsquerdo);
					if(Maior < Raiz.Funcionario) {
						Maior = Raiz.Funcionario;
						Setormaior = Raiz.Setor;
					}
				}
			}
			
			public void MostrarMaior() {
				System.out.println("O Setor com mais Funcionarios é : " +Setormaior+ " Que Possui: "+Maior);
			}
			
			int Menor=999,Setormenor;
			
			public void Menor(Nodo Raiz) {
					if (Raiz != null) {
						Menor(Raiz.FilhoEsquerdo);
						if(Menor > Raiz.Funcionario) {
							Menor = Raiz.Funcionario;
							Setormenor = Raiz.Setor;
						}
						Menor(Raiz.FilhoDireito);
				}
			}
			
			public void MostrarMenor() {
				System.out.println("O Setor com menos Funcionarios é : " +Setormenor+ " Que Possui: "+Menor);
			}
			
			
		}