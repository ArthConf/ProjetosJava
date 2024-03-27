package CRM_LavaJato;

public class Servicos {
    Veiculo[] cliente = new Veiculo[10];

    public void Cadastro() {
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] == null) {
                System.out.println("-------------------------------");
                String nome = Teclado.lerString("Digite o nome do Cliente: ");
                cliente[i] = new Veiculo(); // Inicializa o cliente[i] antes de usar
                cliente[i].setNomeDono(nome);
                String modelo = Teclado.lerString("Digite o modelo do carro: ");
                cliente[i].setModelo(modelo);
                String placa = Teclado.lerString("Digite a placa do carro: ");
                cliente[i].setPlaca(placa);
                String cor = Teclado.lerString("Digite a cor do carro: ");
                cliente[i].setCorCarro(cor);
                servicos(cliente[i]);
                break; // Sai do loop depois de cadastrar um cliente
            }
        }
    }

    public void servicos(Veiculo cliente) {
        String serv;
        System.out.println("\nSelecione o serviço\n\n1-> Lavagem Simples(Externo)\n2-> Lavagem Completa(Externo e Interno)\n3-> Lavagem do Motor\n4-> Lavagem completa + Polimento\n5-> Lavagem Completa + Cristalização");
        int opc = Teclado.lerInteiro("Digite: ");
        System.err.println("\n---------------------------------\n");
        switch (opc) {
            case 1:
                serv = "Lavagem Simples(Externo)";
                cliente.setServ(serv);
                break;
            case 2:
                serv = "Lavagem Completa(Externo e interno)";
                cliente.setServ(serv);
                break;
            case 3:
                serv = "Lavagem do Motor";
                cliente.setServ(serv);
                break;
            case 4: 
                serv = "Lavagem completa + Polimento";
                cliente.setServ(serv);
                break;
            case 5:
                serv = "Lavagem Completa + Cristalização";
                cliente.setServ(serv);
                break;
            default:
                System.out.println("Opção de serviço inválido");
                break;
            }
    }

    public void imprimir(Veiculo[] cliente){
        String consulta = Teclado.lerString("Digite a placa do carro: ");
        for(int i = 0; i < 10 ; i++){
            if(cliente[i]!=null && consulta.equals(cliente[i].getPlaca())){
                System.err.println("\n---------------------------------\n");
                System.out.println("Consulta");
                System.out.print("\nCliente: "+cliente[i].getNomeDono()+"\nModelo do carro: "+cliente[i].getModelo()+"\nCor do carro: "+cliente[i].getCorCarro()+"\nAno do carro: "+cliente[i].getAno()+"\nPlaca do carro: "+cliente[i].getPlaca()+"\nServiço feito no carro: "+cliente[i].getServ());
                System.err.println("\n\n---------------------------------\n");
            }
        }
    }

    public void alterarCliente(Veiculo [] cliente){
        System.err.println("\n---------------------------------\n");
        String consulta = Teclado.lerString("Digite a placa do carro: ");
        for(int i = 0; i < 10 ; i++){
            if(cliente[i]!=null && consulta.equals(cliente[i].getPlaca())){
                System.out.println("Alterar");
                String nomeAlt = Teclado.lerString("Nome do Cliente: ");
                if(nomeAlt.length()>0){
                    this.cliente[i].setNomeDono(nomeAlt);
                }

                String modeloAlt = Teclado.lerString("Modelo do carro: ");
                if(modeloAlt.length()>0){
                    cliente[i].setModelo(modeloAlt);
                }

                String corAlt = Teclado.lerString("Cor do carro: ");
                if(corAlt.length()>0 ){
                    cliente[i].setCorCarro(corAlt);
                }

                int anoAlt = Teclado.lerInteiro("Ano do carro: ");
                if(anoAlt != 0){
                    cliente[i].setAno(anoAlt);
                }
                servicos(cliente[i]);
                break;
            }
        }
    }
}

    