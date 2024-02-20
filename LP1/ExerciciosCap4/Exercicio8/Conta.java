package LP1.ExerciciosCap4.Exercicio8;

public class Conta {
    int numeroConta,dia,mes,ano;
    String agencia,dtAbertura,cliente;
    Double saldo = 300000.0, rendimentoV=0.1;

    public String recuperaDadosParaImpressao(){
        String dados;
        dados = "Cliente: "+cliente+"\nNúmero conta: "+numeroConta+"\nAgencia: "+agencia+"\nData abertura da conta: "+dia+"/"+mes+"/"+ano;
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
