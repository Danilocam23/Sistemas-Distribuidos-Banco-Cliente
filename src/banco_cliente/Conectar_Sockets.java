

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_cliente;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author xcojcama
 */
public class Conectar_Sockets {
    //Instanciar Objetos    
    Socket cliente;
    //Variables Genericas
    //Puerto de la maquina que se va utilizar
    int puerto = 9000;
    String ip = "127.0.0.1";
    BufferedReader entrada;
    
    //variables de salida
    PrintStream salida;

    public void Datos(String jsDatos) {
        try {
            //se reliza la conecion con el soket            
            cliente = new Socket(ip,puerto);
            
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));          
         
            String envio = jsDatos;
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(envio);
            String msg = entrada.readLine();
              JOptionPane.showMessageDialog(null, msg);
            entrada.close();
            salida.close();
            cliente.close();
        } catch (Exception e) {
        }
    }
}