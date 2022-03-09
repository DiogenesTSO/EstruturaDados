package LifoDinamico;

import javax.swing.JOptionPane;

public class UsaLifo {

    public static void main(String[] args) {
    
        Lifo minha = new Lifo();
        int opcao = lerOpcaoDoMenu();

        do {
            int aux;
            switch(opcao){
             case 1: 
                    String entra = JOptionPane.showInputDialog("Informe a matricula");
                    aux = Integer.parseInt(entra);
                    minha.inserir(aux);
                    System.out.println("\nInserida a matricula");
                    opcao = lerOpcaoDoMenu();
                    break;
             case 2:
                    aux = minha.retirar();
                    if(aux == -999){
                        System.out.println("Lista vazia");
                     } else {
                        System.out.println("\n Retirada a matricula" + aux);
                    }  
                    opcao = lerOpcaoDoMenu();
                    break; 
             case 3: 
                    minha.mostrar();
                    opcao = lerOpcaoDoMenu();
                    break;
             case 4:
                    minha.detonar();
                    opcao = lerOpcaoDoMenu();              
            }
        
        } while(opcao !=5);
        
    }

        private static Integer lerOpcaoDoMenu(){
            String menu = "[-------- Menu ---------]";
        menu = menu + "\n[1] - Inserir";
        menu = menu + "\n[2] - Retirar";
        menu = menu + "\n[3] - Mostrar ";
        menu = menu + "\n[4] - Detonar ";
        menu = menu + "\n[5] - Sair";
        menu = menu + "\n[ ------------------------- ]";
        menu = menu + "\nInforme sua opcao: ";
        String strOpcao = JOptionPane.showInputDialog(null, menu);
        return Integer.parseInt(strOpcao);
        }
    
}
