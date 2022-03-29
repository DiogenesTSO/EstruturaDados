
public class Nodo{

public int matricula;
public int idade;
public Nodo seguinte;
public Nodo anterior;

Nodo(int mtr, int idd){
    matricula = mtr;
    seguinte = null;
    anterior = null;
    idade = idd;
}

}