
package model;

import java.util.Date;

public class Visitante  {
    private String decricao;
    private Morador responsavel;

  

    
//    public Visitante(String decricao, Morador responsavel, String cpf, String nome, int anoNascimento, String celular) {
//        super(cpf, nome, anoNascimento, celular);
//        this.decricao = decricao;
//        this.responsavel = responsavel;
//    }
    
    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Morador getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Morador responsavel) {
        this.responsavel = responsavel;
    }
    
}
