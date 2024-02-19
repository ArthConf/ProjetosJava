package LP1.ExerciciosCap4.Exercicio8;
import java.util.Scanner;
public class TesteConta {
    public static void main(String[] args) {
        
        Conta.cliente = "arthur";
        //Como Conta não foi instanciado, haverá um erro de compilação.
        Conta.calcularRendimento();
        // O mesmo ocorre aqui. Antes de chamar o método, devemos instaciar a classe na qual este método está armazenado.
    }
    
}
