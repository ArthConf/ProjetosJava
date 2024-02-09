package LP1.ExercicicioCap3;

public class exercicio5 {
    public static void main(String[] args) {
        int fat = 1;
        long fat2 = 1;
        for(int i = 1; i<=30;i++){
            fat = fat * i;
            fat2 = fat2 * i;
            System.out.println(" INTEIRO: O fatorial de "+i+" é "+fat);
            System.out.println(" LONG: o fatorial de "+i+" é "+fat2);
            System.out.println("");
        }
    }
}
/*A partir do 13, ocorre uma diferença entre a variável do tipo INT e outro do tipo LONG.
Isso ocorre por conta da quantidade de bits que os dois possuem de tamanho, sendo que int armazena 32 bits
, e long tem um tamanho de 64 bits, ou seja, long possui um tamanho maior que int.
Com isso, quando int chega ao seu limite, os números contidos na variável desse tipo, começa a ficar errado
,aí surge a disparidade que ocorreu no numero 13. */ 
