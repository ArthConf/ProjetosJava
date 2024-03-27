package CadastroUser;

public class Funcoes {
    
    public void alterar (Pessoa[] usuario, String consulta){
        //consult = Teclado.lerString("Digite o nome do usuário: ");
        int cont = 0;
		for(int j = 0; j < 10 ; j++) {
			if(usuario[j] !=null && consulta.equals(usuario[j].nome)) {
				System.out.print("\033[H\033[2J");
				System.out.flush();
				usuario[j].nome = Teclado.lerString("Digite o novo nome: ");
				usuario[j].cpf = Teclado.lerString("Digite o novo CPF: ");
				cont = 1;
			}
		}
	    if(cont == 0) {
		    System.out.println("Nome não Encontrado");
		}
    }

	public void excluir (Pessoa[] usuario, String consulta){

        int opc = Teclado.lerInteiro("Consulta\n\n1-> Consultar pelo nome\n2-> Consultar pelo CPF\n\nDigite: ");
		int cont = 0;
        switch(opc) {
        	case 1:
        	    consulta = Teclado.lerString("Digite o nome: ");
        	    for(int j = 0; j < 10 ; j++) {
        	        if(usuario[j] != null && consulta.equals(usuario[j].nome)){
						String userExcluido = usuario[j].nome;
        	        	usuario[j] = null;	
						cont = cont + 1;
						System.out.print("\033[H\033[2J");
                    	System.out.flush();
						System.out.println("Usuário "+userExcluido+" foi excluído");
						break;
									
        	        }
        	    }
        	    if(cont == 0) {
        	        System.out.println("Nome não Encontrado");
        	    }
				break;
        	case 2:
        	    consulta = Teclado.lerString("Digite o CPF: ");
        	    for(int j = 0; j < 10 ; j++) {
        	    	if(usuario[j] != null && consulta.equals(usuario[j].cpf)){
						String userExcluido = usuario[j].nome;
        	        	usuario[j] = null;	
						cont = cont + 1;
						System.out.print("\033[H\033[2J");
                    	System.out.flush();
						System.out.println("Usuário "+userExcluido+" foi excluído");
						break;
									
        	        }
        	    }
        	    if(cont == 0 ) {
        	        System.out.println("CPF não Encontrado");
        	    }
        }
        	        
	}
}