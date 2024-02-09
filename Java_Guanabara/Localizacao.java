package Java_Guanabara;

import java.util.Locale;

public class Localizacao {
    public static void main(String[] args){
        Locale locale = Locale.getDefault();
        System.out.println("O sistema do usuário esta em: ");
        System.out.print(locale.toString());

    }
    
}
