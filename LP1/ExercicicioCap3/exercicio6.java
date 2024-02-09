package LP1.ExercicicioCap3;

public class exercicio6 {
    public static void main(String[]args){
        int ant = 0;
        int at  = 1;
        int  proximo = 0;
        System.out.println("Número atual: "+ant);
        while(at <= 100){
            System.out.println("Número atual: "+at);
            proximo = ant + at;
            ant = at;
            at = proximo;
        }
    }
}