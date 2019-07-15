
package model;

import java.util.ArrayList;
import java.util.Date;

public class Historico {
    private Cartao cartao;
    private Date registro;

    public Historico(Cartao cartao, Date registro) {
        this.cartao = cartao;
        this.registro = registro;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    

    
    
    
}
