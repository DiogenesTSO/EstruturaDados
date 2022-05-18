import javax.swing.JOptionPane;

public class ArvoreB {

    Nodo raiz;

    ArvoreB(){
        raiz = null;
    }

    public Nodo getRaiz(){
        return raiz;
    }

    public void construir(Nodo setor, char lado, int quem){
        String entra;
        int lido;
        Nodo onde;

        if (lado == 'r')
            entra = JOptionPane.showInputDialog("INFORME A RAIZ");
            else {
                if (lado == 'e')
                entra = JOptionPane.showInputDialog("INFORME O FILHO ESQUERDO DE " +quem);
                else 
                entra = JOptionPane.showInputDialog("INFORME O FILHO DIREITO DE " +quem);

            }

            lido = Integer.parseInt(entra);
            if (lido != 0){
                onde = coloca(filho, lido, lado);
                construir(onde, 'e', lido);
                construir(onde, 'd', lido);
            }
        }

    public Nodo coloca (Nodo atual, int quem, char id){
        Nodo alocou;
        alocou = new Nodo(quem);
            if (raiz == null)
                raiz = alocou;
            else {
                if (id =='e')
                    atual.filhoEsq = alocou;
                else
                    atual.filhoDir = alocou; 

        }
        return alocou;

    }        

        public void varrePreOrdemDireita(Nodo raiz){
            if (raiz != null){
                System.out.print("" +raiz.dado);
                varrePreOrdemDireita(raiz.filhoDir);
                varrePreOrdemDireita(raiz.filhoEsq);
            }
        }

        public void varrePreOrdemEsquerda(Nodo raiz){
            if (raiz != null){
                System.out.print("" +raiz.dado);
                varrePreOrdemEsquerda(raiz.filhoEsq);
                varrePreOrdemEsquerda(raiz.filhoDir);
            }
        }

        public void varrePosOrdemEsquerda(Nodo raiz){
            if (raiz != null){
                varrePosOrdemEsquerda(raiz.filhoEsq);
                varrePosOrdemEsquerda(raiz.filhoDir);
                System.out.print("" +raiz.dado);
            }
        }

        public void varrePosOrdemDireita(Nodo raiz){
            if (raiz != null){                
                varrePosOrdemDireita(raiz.filhoDir);
                varrePosOrdemDireita(raiz.filhoEsq);
                System.out.print("" +raiz.dado);
            }
        }

        public void varreInOrdemDireita(Nodo raiz){
            if (raiz != null){                
                varrePosOrdemDireita(raiz.filhoDir);
                System.out.print("" +raiz.dado);
                varrePosOrdemDireita(raiz.filhoEsq);                
            }
        }

        public void varreInOrdemEsquerda(Nodo raiz){
            if (raiz != null){                
                varrePosOrdemEsquerda(raiz.filhoEsq);
                System.out.print("" +raiz.dado);
                varrePosOrdemEsquerda(raiz.filhoDir);                
            }
        }


        
        

    
    }
    

