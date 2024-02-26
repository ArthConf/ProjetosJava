package CadastroUser;

public class Cadastro {
	
    public static void main(String[] args) {
        String consult;
        Pessoa[] user = new Pessoa[10];
        System.out.println("Bem vindo ao Sistema de Cadastro\n\n");
        for(int i = 0; i<10 ; i++) {
        	int opc=0,cont=0;
        	 opc = Teclado.lerInteiro("Selecione uma opção:\n\n1-> Cadastro\n2-> Alterar\n3-> Excluir\n4-> Consultar\n5-> Finalizar\n\nDigite: ");
        	switch(opc) {
        		case 1: 
                    Pessoa dado = new Pessoa();
        			dado.nome = Teclado.lerString("Digite seu nome: ");
        			dado.cpf = Teclado.lerString("Digite seu CPF: ");
        			user[i]= dado;
        			break;
        		case 2:
        		
        			int opc1 = Teclado.lerInteiro("Alterar\n\n1->Pesquisar usuário pelo nome\n2-> Pesquisar usuário pelo CPF\n\nDigite: ");
        			switch(opc1) {
        				case 1:
        					consult = Teclado.lerString("Digite o nome do usuário: ");
        					for(int j = 0; j < 10 ; j++) {
        						if(user[j] !=null && consult.equals(user[j].nome)) {
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();
        							user[j].nome = Teclado.lerString("Digite o novo nome: ");
       	        					user[j].cpf = Teclado.lerString("Digite o novo CPF: ");
                                    cont = 1;
        						}
        					}
        					if(cont == 0) {
        						System.out.println("Nome não Encontrado");
        					}
                            break;
        				case 2:
       	        		 	consult = Teclado.lerString("Digite o CPF do usuário: ");
       	        			for(int j = 0; j < 10 ; j++) {
       	        				if(user[j] != null && consult.equals(user[j].nome)) {
                                    user[j].nome = Teclado.lerString("Digite o novo nome: ");
                                    user[j].cpf = Teclado.lerString("Digite o novo CPF: ");
                                    cont = 1;
       	        				}
       	        			}
       	        			if(cont == 0) {
       	        			    System.out.println("CPF não Encontrado");
       	        			}
                            break;
                        }
                    break;
        		case 3:
        			int opc3 = Teclado.lerInteiro("Consulta\n\n1-> Consultar pelo nome\n2-> Consultar pelo CPF\n\nDigite: ");
        	        switch(opc3) {
        	            case 1:
        	        	    consult = Teclado.lerString("Digite o nome: ");
        	        		for(int j = 0; j < 10 ; j++) {
        	        			if(consult.equals(user[j].nome)) {
        	        				user[j].nome = Teclado.lerString(null);
                                    user[j].cpf = Teclado.lerString(null);
        	        			}
        	        		}
        	        		if(cont == 0) {
        	        			System.out.println("Nome não Encontrado");
        	        		}
        	        		break;	
        	        	case 2:
        	        		consult = Teclado.lerString("Digite o CPF: ");
        	        		for(int j = 0; j < 10 ; j++) {
        	        			if(consult.equals(user[j].cpf)) {
        	        				user[j].nome = Teclado.lerString(null);
        	        				user[j].cpf = Teclado.lerString(null);
        	        				break;
        	        			}
        	        		}
        	        		if(cont == 0 ) {
        	        			System.out.println("CPF não Encontrado");
        	        			break;
        	        		}
        	        }
        	        	
        		case 4:
                    int opc4 = Teclado.lerInteiro("Consultar\n\n1-> Consultar pelo nome\n2-> Consultar pelo CPF\n\nDigite: ");
                    switch(opc4){
                        case 1:
                            consult = Teclado.lerString("Digite o nome do usuário: ");
                            for(int j = 0; j < 10; j++){
                                if(user[j] != null && consult.equals(user[j].nome)){
                                    System.out.println("Nome: "+user[j].nome+"\nCPF: "+user[j].cpf);
                                    cont = 1;
                                    
                                }
                            }
         					if(cont == 0 ) {
         						System.out.println("Nome não Encontrado");
         						
         					}
        				 break;
                        case 2:
                            consult = Teclado.lerString("Digite o CPF do usuário: ");
                            for(int j = 0 ; j < 10 ; j++){
                                if(user[j] != null && consult.equals(user[j].cpf)){
                                    System.out.println("Nome: "+user[j].nome+"\nCPF: "+user[j].cpf);
                                }
                            }
                        break;
                    }
                    break;
        		case 5:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
        			System.out.println("Sistema Finalizado");
        			return;
        					 
        		default:
        		    System.out.println("OPÇÃO INVÁLIDA");
        		    break;
        	}
        			
        }
    }
}

