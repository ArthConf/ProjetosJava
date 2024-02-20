package LP1.ExerciciosCap4.Exercicio7;
import java.util.Scanner;
public class TesteConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Cadastro do Cliente\n");
        conta.agencia = "99229" ;
        conta.cliente = "Arthur";
        conta.numeroConta = 922992;
        System.out.println(conta.recuperaDadosParaImpressao());
        //Como não atribui valor para Data de abertura da conta, o terminal imprimiu com 0 em cada variável.
        System.out.println("-------------------------------------------------------");
        System.out.println("Banco Confessor\n");
        
        System.out.println("-------------------------------------------------------");
        System.out.printf("Selecione uma opção: \n\n1-> Saque\n2-> Depositar\n3-> Calcular Rendimento\n4-> Sair do programa\n\nDigite: ");
        int opc = entrada.nextInt();
        switch(opc){
            case 1:
                System.out.printf("\n\nDigite o valor que deseja sacar: ");
                float vSacar = entrada.nextFloat();
                Conta saque = new Conta();
                System.out.println("\nO valor sacado foi: R$"+vSacar+"\nSaldo atual é: R$"+saque.sacar(vSacar));
                break;
            case 2:
                System.out.printf("\n\nDigite o valor que deseja depositar: ");
                float vDepositar = entrada.nextFloat();
                Conta deposita = new Conta();
                System.out.println("\nO valor depositado foi: R$"+vDepositar+"\nSaldo atual é: R$"+deposita.depositar(vDepositar));
                break;
            case 3:
                Conta rendimento = new Conta();
                System.out.println("Rendimento de: R$"+rendimento.calcularRendimento());
                break;
            case 4:
                System.out.print("\033[H\033[2J"); //Limpando a tela do terminal
                System.out.flush();
                System.out.println("Obrigado por utilizar o Banco Confessor");
                System.exit(0);
        }
    }
    
}
