package LP1;
import java.util.Scanner;

public class Par {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = entrada.nextInt();
        int result = numero % 2;
        if(result == 0){
            System.out.println("O número "+numero+" é par");
        }else{
            System.out.println("O número "+numero+" nao e par");
        }
        

    }
    
}
