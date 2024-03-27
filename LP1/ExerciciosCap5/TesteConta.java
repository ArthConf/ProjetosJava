package LP1.ExerciciosCap5;
import java.util.Scanner;
public class TesteConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Cadastro do Cliente\n");
        conta.dataCadastro();
        //Conta dados = conta.recuperaDadosParaImpressao();
        System.out.println("-------------------------------------------------------");
        System.out.println("Banco Confessor\n");
        String nomeC = Teclado.lerString("Digite o Nome: ");//Nome do Cliente
        conta.setCliente(nomeC);//Configurando o nome do cliente
        //Cadastrando a Agência do Cliente
        String ag = Teclado.lerString("Digite a Agência: ");
        conta.setAgencia(ag);
        //Cadastrando o número da Conta Corrente do cliente
        conta.setAgencia(Teclado.lerString("Conta Corrente: "));
        //System.out.println("Data de abertura da conta: "+dados.getdia+"/"+dados.mes+"/"+dados.ano);
        System.out.println("Saldo atual: "+conta.getSaldo());
        System.out.println("-------------------------------------------------------");
        
        int opc = Teclado.lerInteiro("Selecione uma opção: \n\n1-> Saque\n2-> Depositar\n3-> Calcular Rendimento\n4-> Sair do programa\n\nDigite: ");
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
                System.out.println("Rendimento de: R$"+rendimento.getCalcularRendimento());
                break;
            case 4:
                System.out.print("\033[H\033[2J"); //Limpando a tela do terminal
                System.out.flush();
                System.out.println("Obrigado por utilizar o Banco Confessor");
                System.exit(0);
        }
    }
    
}
