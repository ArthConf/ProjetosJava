package CRM_LavaJato;

public class Veiculo {
    
    private String modelo, placa, nomeDono,corCarro,serv;
    private int ano;
    /*public Veiculo(String modelo, String placa, String nomeDono, String corCarro, int ano, int serv){
        this.modelo = modelo;
        this.placa = placa;
        this.nomeDono = nomeDono;
        this.ano = ano;
        this.corCarro = corCarro;
    }*/

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }
    public String getServ() {
        return serv;
    }
    public void setServ(String serv) {
        this.serv = serv;
    }
    
}
