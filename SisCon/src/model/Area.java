
package model;

import java.util.ArrayList;

public class Area {
    private int idArea;
    private String nome;
    private String descricao;
    private int capMax;
    private boolean isDisponivel;
    private Cartao cartao;

    public Area(int idArea, String nome, String descricao, int capMax, boolean isDisponivel, Cartao cartao) {
        this.idArea = idArea;
        this.nome = nome;
        this.descricao = descricao;
        this.capMax = capMax;
        this.isDisponivel = isDisponivel;
        this.cartao = cartao;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public boolean isIsDisponivel() {
        return isDisponivel;
    }

    public void setIsDisponivel(boolean isDisponivel) {
        this.isDisponivel = isDisponivel;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
    
    

    

}
