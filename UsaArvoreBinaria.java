import javax.swing.JOptionPane;

public class UsaArvoreBinaria {

    public static void main(String[] args) {
            
            ArvoreBinaria minha;

            String entra;
            int alt; 

            entra = JOptionPane.showInputDialog("INFORME A ALTURA DA ARVORE");
            alt = Integer.parseInt(entra);
            minha = new ArvoreBinaria(alt);

            minha.carregaArvore();
            System.out.print("\nVEJA A ARVORE EM PRE-ORDEM C/ PREFERENCIA A ESQUERDA: ");
            minha.pre_ordem_esq(0);
            System.out.print("\nVEJA A ARVORE EM POS-ORDEM C/ PREFERENCIA A ESQUERDA: ");   
            minha.pos_ordem_esq(0);
            System.out.print("\nVEJA A ARVORE EM IN-ORDEM C/ PREFERENCIA A ESQUERDA: ");
            minha.in_ordem_esq(0);
    }
    
}
