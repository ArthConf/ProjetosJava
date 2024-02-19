package LP1.ExerciciosCap4.Exercicio5;

public class TesteConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();								
        c1.cliente = "Danilo";
        c1.saldo = 100.0;
        Conta c2 = new Conta();								
        c2 = c1;
        if(c1==c2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");								
        }
        //O resultado agora é "iguais". O motivo disso, se refere a linha 9, na qual c2 recebe c1, portanto, apontado
        //para o mesmo espaço de memória, logo, se referindo ao mesmo objeto.
    }
    
}
