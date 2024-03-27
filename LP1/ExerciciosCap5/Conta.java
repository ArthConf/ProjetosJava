package LP1.ExerciciosCap5;

public class Conta {
    private int numeroConta,dia=29,mes=03,ano=2004;
    private String agencia,cliente;
    private Double saldo = 300000.0, rendimentoV=0.1;


//gets
    public int getNumeroConta(){
        return numeroConta;
    }

    public String getAgencia(){
        return agencia;
    }


    public String getCliente(){
        return cliente;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getRendimento(){
        return rendimentoV;
    }

//Sets
    public void setCliente(String newCliente){
        this.cliente = newCliente;
    }

    public void setNumeroConta(int newNumeroConta){
        this.numeroConta = newNumeroConta;
    }

    public void setAgencia(String newAgencia){
        this.agencia = newAgencia;
    }

    public void setSaldo(double newSaldo){
        this.saldo = newSaldo;
    }

    public void setRendimento(double newRendimento){
        this.rendimentoV = newRendimento;
    }

    /*public Conta recuperaDadosParaImpressao(){
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
    }*/
    public void dataCadastro(){

        System.out.println(dia+"/"+mes+"/"+ano);

    }
    public double sacar(double valorRetirado){
        saldo = saldo - valorRetirado;
        return saldo;
    }
    public double depositar(double valorDepositado){
        saldo = saldo + valorDepositado;
        return saldo;
    }
    public double getCalcularRendimento(){
        return saldo * rendimentoV;
    }

}
