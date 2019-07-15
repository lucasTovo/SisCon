
package model;

import java.util.ArrayList;

public class Condominio {
    
    private int idCondominio;
    private String nome;
    private ArrayList<Apartamento> apartamentos;
    private ArrayList<Area> areas;

    public Condominio(int idCondominio, String nome, ArrayList<Apartamento> apartamentos, ArrayList<Area> areas) {
        this.idCondominio = idCondominio;
        this.nome = nome;
        this.apartamentos = apartamentos;
        this.areas = areas;
    }
    
    
    
    public int getIdCondominio() {
        return idCondominio;
    }

    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }
    
    
}
