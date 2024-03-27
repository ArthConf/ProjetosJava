package CRM_LavaJato;

public class Crm {
    public static void main(String [] args){
        Servicos servico = new Servicos();
        for(int i = 0; i < servico.cliente.length;i++){
            int opc = Teclado.lerInteiro("Selecione uma opção\n\n1-> Cadastrar Clinte\n2-> Alterar dados do cliente\n3-> Consultar Cliente\n4-> Finalizar o sistema\nDigite: ");
            switch(opc){
                case 1:
                    servico.Cadastro();
                    break;

                case 2:
                    servico.alterarCliente(servico.cliente);
                    break;

                case 3:
                    servico.imprimir(servico.cliente);
                    break;
                case 4:
                    System.out.println("-------------------------------\n");
                    System.out.println("Finalizando o sistema..........");
                    System.exit(0);
                    
            }
        }   
    }
    
    
}
