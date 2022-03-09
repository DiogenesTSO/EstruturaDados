

package FifoDinamico;

import javax.swing.JOptionPane;


public class UsaFifo {

     public static void main(String[] args) {

        int opcao, aux, matrp;
        opcao = lerOpcaoDoMenu();

        Fifo fifo = new Fifo();
        
        do {
            switch (opcao) {
                case 1:
                    matrp = Integer.parseInt(JOptionPane.showInputDialog("Dígite a matricula do funcionário."));
                    opcao = lerOpcaoDoMenu();
                    fifo.inserir(matrp);
            
                    break;
            
                case 2: {
                        aux = fifo.retirar();
                        if (aux == -999)
                            System.out.println("A lista está vazia");
                        else
                            System.out.println("\nFoi retirado o funcionário com a matricula " + aux);
    
                        opcao = lerOpcaoDoMenu();
                        break;        
    }
                case 3: {
                            fifo.mostrar();

                            opcao = lerOpcaoDoMenu();
                            break;
    }
                 case 4: {
                            matrp = Integer.parseInt(JOptionPane.showInputDialog("Dígite a matrícula do funcionário que desejas localizar."));
                            if (fifo.procurar(matrp) == -1)
                            System.out.println("Não foi possível localizar a matrícula " + matrp);
                        else
                            System.out.println("Foi localizado a matrícula: " + matrp);

                        opcao = lerOpcaoDoMenu();
                        break;
    }
                case 5: {
                        fifo.detonar();

                        opcao = lerOpcaoDoMenu();
                        break;
    }
            }
     
                } while (opcao != 999);   
            }
            private static Integer lerOpcaoDoMenu() {
                String menu = "[-------- Menu ---------]";
                menu += "\n[1] - Inserir";
                menu += "\n[2] - Retirar";
                menu += "\n[3] - Mostrar";
                menu += "\n[4] - Procurar ";
                menu += "\n[5] - Detonar";
                menu += "\n[6] - Sair";
                

                String strOpcao = JOptionPane.showInputDialog(null, menu);

                return Integer.parseInt(strOpcao);
        }
    }
    
