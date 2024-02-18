package LP1.ExerciciosCap4.Exercicio1e2;

public class Conta {
    String cliente = "Arthur";
    int numeroConta = 02020202;
    String agencia = "12231-4";
    Double saldo = 300000.0;
    String dtAbertura = "11/02/2022";
    double rendimentoV = 0.1;

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
