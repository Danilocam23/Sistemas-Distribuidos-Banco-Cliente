/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_cliente;

import JF_Interface.JF_Banco;

/**
 *
 * @author xcojcama
 */
public class Banco_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Conectar_Sockets c = new Conectar_Sockets();
        c.inicio();*/
        
        JF_Banco jfb = new JF_Banco();
        jfb.show();
  
                
    }
    
}
