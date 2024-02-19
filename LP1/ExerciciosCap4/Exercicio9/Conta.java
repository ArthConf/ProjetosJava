package LP1.ExerciciosCap4.Exercicio9;
import java.util.Scanner;
public class Conta {
    int numeroConta,dia,mes,ano;
    String agencia,dtAbertura,cliente;
    Double saldo = 300000.0, rendimentoV=0.1;

    public Conta recuperaDadosParaImpressao(){
        Conta dados = new Conta();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        dados.cliente = entrada.nextLine();
        System.out.print("Digite a agência do cliente: ");
        dados.agencia = entrada.nextLine();
        System.out.print("Digie o número da conta do Cliente: ");
        dados.numeroConta = entrada.nextInt();
        System.out.println("Data de abertura da conta");
        System.out.print("Dia: ");
        dados.dia = entrada.nextInt();
        System.out.print("Mês: ");
        dados.mes = entrada.nextInt();
        System.out.print("Ano: ");
        dados.ano = entrada.nextInt();
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
