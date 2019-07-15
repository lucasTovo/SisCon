
package model;

public class Apartamento{
    private Morador proprietario;
    private int numApartamento;
    private int andar;
    private Condominio condominio;    

    public Apartamento(Morador proprietario, int numApartamento, int andar, Condominio condominio) {
        this.proprietario = proprietario;
        this.numApartamento = numApartamento;
        this.andar = andar;
        this.condominio = condominio;
    }

    public Morador getProprietario() {
        return proprietario;
    }

    public void setProprietario(Morador proprietario) {
        this.proprietario = proprietario;
    }

    public int getNumApartamento() {
        return numApartamento;
    }

    public void setNumApartamento(int numApartamento) {
        this.numApartamento = numApartamento;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    
    

    
    
    
}
