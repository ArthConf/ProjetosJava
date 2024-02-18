package LP1.ExerciciosCap4.Exercicio3;
import java.util.Scanner;
public class TesteConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Cadastro do Cliente\n");
        Conta dados = conta.recuperaDadosParaImpressao();
        System.out.println("-------------------------------------------------------");
        System.out.println("Banco Confessor\n");
        System.out.println("Nome: "+dados.cliente);
        System.out.println("Agência: "+dados.agencia);
        System.out.println(("Conta Corrente: "+dados.numeroConta));
        System.out.println("Data de abertura da conta: "+dados.dtAbertura);
        System.out.println("Saldo atual: "+conta.saldo);
        System.out.println("-------------------------------------------------------");
        System.out.printf("Selecione uma opção: \n\n1-> Saque\n2-> Depositar\n3-> Calcular Rendimento\n\nDigite: ");
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
        }
    }
    
}
