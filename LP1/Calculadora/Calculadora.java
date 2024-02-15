package LP1.Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int v1,v2;
        System.out.println("Calculadora em Java\n\nSelecione uma opção\n");
        System.out.print("1-> Somar\n2-> Subtrair\n3-> Multiplicar\n4-> Dividir\n\nDigite: ");
        int esc = entrada.nextInt();
        System.out.println("\n\n");
        switch(esc){
            case 1:
                System.out.print("Digite o valor do primeiro número: ");
                v1 = entrada.nextInt();
                System.out.print("\nDigite o valor do segundo número: ");
                v2 = entrada.nextInt();
                Somar sum = new Somar();
                System.out.print("Resultado da soma: "+sum.soma(v1,v2));
                break;
            case 2: 
                System.out.print("Digite o valor do primeiro número: ");
                v1 = entrada.nextInt();
                System.out.print("\nDigite o valor do segundo número: ");
                v2 = entrada.nextInt();
                Subtrair subtrair = new Subtrair();
                System.out.print("Resultado da subtração: "+subtrair.subtracao(v1,v2));
                break;
            case 3:
                System.out.print("Digite o valor do primeiro número: ");
                v1 = entrada.nextInt();
                System.out.print("\nDigite o valor do segundo número: ");
                v2 = entrada.nextInt();
                Multiplicar multiplicar = new Multiplicar();
                System.out.print("Resultado da multiplicação: "+multiplicar.multiplicacao(v1,v2));
                break;
            case 4:
                System.out.print("Digite o valor do primeiro número: ");
                v1 = entrada.nextInt();
                System.out.print("\nDigite o valor do segundo número: ");
                v2 = entrada.nextInt();
                Dividir dividir = new Dividir();
                System.out.print("Resultado da divisão: "+dividir.divisao(v1,v2));
                break;
        }
        
    }
}
