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
                    int idd = Integer.parseInt(JOptionPane.showInputDialog("Dígite a idade do funcionário."));
                    fifo.inserir(matrp, idd);

                    opcao = lerOpcaoDoMenu();
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
                    fifo.mostrarInvertido();

                    opcao = lerOpcaoDoMenu();
                    break;
                }
                case 5: {
                    fifo.detonar();

                    opcao = lerOpcaoDoMenu();
                    break;
                }
                case 6: {
                    matrp = Integer.parseInt(JOptionPane.showInputDialog("Dígite a matrícula do funcionário que desejas localizar."));

                    
                    if (fifo.procurar(matrp) == -1) 
                        System.out.println("Não foi possível localizar a matrícula " + matrp);
                    else
                        System.out.println("Foi localizado a matrícula: " + matrp);

                    opcao = lerOpcaoDoMenu();
                    break;
                }

                case 7: {
                    System.out.println("A matrícula do funcionário mais velho é: " + fifo.maisVelho());

                    opcao = lerOpcaoDoMenu();
                    break;
                }

                case 8: {
                    System.out.println("A média de idade dos funcionários é: " + fifo.mediaIdade());

                    opcao = lerOpcaoDoMenu();
                    break;
                }
                case 9: {
                    System.out.println("A primeira matrícula da fila é: " + fifo.cabeca());

                    opcao = lerOpcaoDoMenu();
                    break;
                }
                case 10: {
                    System.out.println(+fifo.ultimo());

                    opcao = lerOpcaoDoMenu();
                    break;
                }
                
                
            }
        } while (opcao != 99);
            System.out.println("Obrigado por usar meu sistema SysDidi");
    }
    
    private static Integer lerOpcaoDoMenu() {
        String menu = "[-------- Menu ---------]";
        menu += "\n[1] - Inserir";
        menu += "\n[2] - Retirar";
        menu += "\n[3] - Mostrar na ordem";
        menu += "\n[4] - Mostrar invertido ";
        menu += "\n[5] - Detonar";
        menu += "\n[6] - Procurar Matricula ";
        menu += "\n[7] - Mais Velho ";
        menu += "\n[8] - Média Idade ";
        menu += "\n[9] - Cabeça ";
        menu += "\n[10] - Ultimo ";    
        menu += "\n[99] - Sair ";
        menu += "\n[ ------------------------- ]";
        menu += "\nInforme sua opção: ";

        String strOpcao = JOptionPane.showInputDialog(null, menu);

        return Integer.parseInt(strOpcao);
    
    }
}





    

    
