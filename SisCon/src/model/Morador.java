
package model;

import java.util.Date;


public class Morador  {
    private Apartamento apartamento;
    private Cartao cartao;

  


    
//    public Morador(Apartamento apartamento, Cartao cartao, String cpf, String nome, int anoNascimento, String celular) {;
//        super(cpf, nome, anoNascimento, celular);
//        this.apartamento = apartamento;
//        this.cartao = cartao;
//    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
    
}
