/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Usuario
 */
public class ConexionSockets {
    
    private final int puerto = 8080;
    private final String host ="localhost";
    protected String mensajeServidor;
    protected ServerSocket socketServidor;
    protected Socket socketCliente;
    protected DataOutputStream salidaServidor, salidaCliente;

public ConexionSockets(String tipo)throws IOException{
if(tipo.equalsIgnoreCase("servidor"))
{
socketServidor = new ServerSocket(puerto);
socketCliente = new Socket();
}
else
{
socketCliente = new Socket(host,puerto);
}
}

}
