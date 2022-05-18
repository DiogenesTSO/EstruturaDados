import javax.swing.JOptionPane;

public class ArvoreBinaria{

    private int arvore[];

    ArvoreBinaria(int altura){
        int tam = 1, n;
            for (n = 1; n <= altura + 2; n++)
                tam = tam * 2;
            arvore = new int[tam - 1];
                }

                
public void carregaArvore(){
    int i;
    String entra;

        for (i = 0; i < arvore.length; i++){
            if (i == 0){
                entra = JOptionPane.showInputDialog("Informe a raiz");
                arvore[0] = Integer.parseInt(entra);
                }
        else    
                { 
                    if ((i % 2) == 1){
                        if (arvore[(i - 1) / 2] != 0){
                            entra = JOptionPane.showInputDialog("INFORME FILHO ESQUERDO DE " + arvore[(i - 1) / 2] + "/ ZERO PARA INEXISTENTE");
                            arvore[i] = Integer.parseInt(entra);   
                        }
                        else 
                            arvore[i] = 0;
                    }
                    else {
                        if (arvore[(i - 1) / 2] !=0){
                            entra = JOptionPane.showInputDialog("INFORME O FILHO DIREITO DE " +arvore[(i - 1) / 2] + "/ ZERO PARA INEXISTENTE");
                            arvore[i] = Integer.parseInt(entra);
                        }
                        else 
                            arvore[i] = 0;
                    }


                }
        }
        
}
        
                        public void pre_ordem_esq(int i){
                            if (arvore[i] !=0){
                                System.out.print("" +arvore[i]);
                                pre_ordem_esq(i * 2 + 1);
                                pre_ordem_esq(i * 2 + 2);
                            }
                        }

                        public void pre_ordem_dir(int i){
                            if (arvore[i] !=0){
                                System.out.print("" +arvore[i]);
                                pre_ordem_dir(i * 2 + 2);
                                pre_ordem_dir(i * 2 + 1);
                        }
                    }

                        public void pos_ordem_esq(int i){
                            if (arvore[i] !=0){
                                pos_ordem_esq(i * 2 + 1);
                                pos_ordem_esq(i * 2 + 2);
                                System.out.print("" +arvore[i]);
                            }
                        }

                        public void pos_ordem_dir(int i){
                            if (arvore[i] !=0){
                                pos_ordem_dir(i * 2 + 2);
                                pos_ordem_dir(i * 2 + 10);
                                System.out.print("" +arvore[i]);
                            }
                        }

                        public void in_ordem_esq (int i){
                            if (arvore[i] !=0){
                                in_ordem_esq(i * 2 + 1);
                                System.out.print("" +arvore[i]);
                                in_ordem_esq(i * 2 + 2);

                            }
                        }

                       
                    
    }

