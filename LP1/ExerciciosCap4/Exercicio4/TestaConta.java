package LP1.ExerciciosCap4.Exercicio4;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();								
        c1.cliente = "Danilo";
        c1.saldo = 100.0;
        Conta c2 = new Conta();								
        c2.cliente = "Danilo";
        c2.saldo = 100.0;
        if(c1==c2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");								
        }
        //Mesmo que os atributos entre elas tenham o mesmo conteúdo, são duas instâncias separadas na memória.
        //Logo, por não estarem no mesmo espaço de memória, a condicional IF entende como se fossem coisas diferentes.
    }
    
}
