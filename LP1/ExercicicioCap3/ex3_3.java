
package LP1.ExercicicioCap3;
import java.util.Scanner;
public class ex3_3 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        float[] gasto = new float[30];
        float soma=0;
        System.out.println("Gastos mensais: ");
        for(int i = 1; i<=4; i++){
            System.out.println("Digite o valor gasto: ");
            gasto[i] = valor.nextFloat();
            soma = gasto[i] + soma;
        }
        System.out.println("\n\nTotal gasto R$"+soma);
    }
    
}
