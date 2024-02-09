package LP1.ExercicicioCap3;
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int x;
        System.out.print("\nDigite um número do tipo inteiro: ");
        x = ent.nextInt();
        System.out.println("Valor digitado pelo usuário: "+x);
        if(x % 2 == 0 ){
            x = x / 2;
            System.out.println("\nValor par modificado: "+x);
        }else{
            x = 3*x+1; 
            System.out.println("\nValor ímpar modificado: "+x);
        }

    }
}
