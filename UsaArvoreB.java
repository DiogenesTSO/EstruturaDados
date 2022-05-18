public class UsaArvoreB {

    public static void main(String[] args) {

        ArvoreB minha;
        minha = new ArvoreB();
        minha.construir(minha.raiz, 'r', 0);
        if (minha.getRaiz() != null){
            System.out.print("\n\nMOSTRANDO A ARVORE EM PRE-ORDEM C/ PREFERENCIA A DIREITA: ");
            minha.varrePreOrdemDireita(minha.getRaiz());
            System.out.print("\n\nMOSTRANDO A ARVORE EM PRE-ORDEM C/ PREFERENCIA A ESQUERDA: ");
            minha.varrePreOrdemEsquerda(minha.getRaiz());
            System.out.print("\n\nMOSTRANDO A ARVORE EM POS-ORDEM C/ PREFERENCIA A DIREITA: ");
            minha.varrePosOrdemDireita(minha.getRaiz());
            System.out.print("\n\nMOSTRANDO A ARVORE EM POS-ORDEM C/ PREFERENCIA A ESQUERDA: ");
            minha.varrePosOrdemEsquerda(minha.getRaiz());
            System.out.print("\n\nMOSTRANDO A ARVORE EM IN-ORDEM C/ PREFERENCIA A DIREITA: ");
            minha.varreInOrdemDireita(minha.getRaiz());
            System.out.print("\n\nMOSTRANDO A ARVORE EM IN-ORDEM C/ PREFERENCIA A ESQUERDA: ");
            minha.varreInOrdemEsquerda(minha.getRaiz());
        }

        else 
            System.out.print("\nNADA NA ARVORE");
        
    }
    
}
