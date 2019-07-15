/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.util.ArrayList;

/**
 *
 * @author Giovani
 * @param <Classe>
 */
public interface InterfaceDAO <Classe> {
     public void create(Classe obj);

 
    public void update(Classe obj);

   
    public void delete(Classe obj);

    
    public ArrayList<Classe> read();
}
