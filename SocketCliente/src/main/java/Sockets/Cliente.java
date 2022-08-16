/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Cliente extends ConexionSockets{
    
    public Cliente() throws IOException{
    super("cliente");
    
    }
    
    public void startClient(){
    try{
    salidaServidor = new DataOutputStream(socketCliente.getOutputStream());
   
    
    for (int i=0; i<3; i++){
    salidaServidor.writeUTF("Este es el mensaje número"+ (i+1) + "\n" );
    }
    socketCliente.close();
    }
    catch(IOException e){
    System.out.println(e.getMessage());
     }
    }
}
