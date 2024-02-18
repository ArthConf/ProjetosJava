package LP1.ExerciciosCap4.Exercicio3;
import java.util.Scanner;
public class Conta {
    String cliente;
    int numeroConta;
    String agencia;
    Double saldo = 300000.0;
    String dtAbertura;
    double rendimentoV = 0.1;

    public Conta recuperaDadosParaImpressao(){
        Conta dados = new Conta();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        dados.cliente = entrada.nextLine();
        System.out.print("Digite a agência do cliente: ");
        dados.agencia = entrada.nextLine();
        System.out.print("Digie o número da conta do Cliente: ");
        dados.numeroConta = entrada.nextInt();
        System.out.print("Digite a data de abertura da conta: ");
        dados.dtAbertura = entrada.next();
        return dados;
    }
    public double sacar(double valorRetirado){
        saldo = saldo - valorRetirado;
        return saldo;
    }
    public double depositar(double valorDepositado){
        saldo = saldo + valorDepositado;
        return saldo;
    }
    public double calcularRendimento(){
        return saldo * rendimentoV;
    }

}
