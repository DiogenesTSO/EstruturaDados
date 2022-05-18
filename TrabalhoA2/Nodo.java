package TrabalhoA2;

public class Nodo
		{
			public int Setor;
			public int Funcionario;
			public Nodo FilhoEsquerdo;
			public Nodo FilhoDireito;

			Nodo(int Set, int Quant)
				{Setor = Set;
				 Funcionario = Quant;
				 FilhoEsquerdo = null;
				 FilhoDireito = null;
				}
		}
