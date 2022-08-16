/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Logica;

import Sockets.Cliente;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class SocketCliente {

    public static void main(String[] args) throws IOException {
        Cliente cli = new Cliente();
        System.out.println("iniciando cliente \n");
        cli.startClient();
        
    }
}
