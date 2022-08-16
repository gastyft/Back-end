/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Logica;

import Sockets.Servidor;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class SocketServidor {

    public static void main(String[] args) throws IOException {
      Servidor servi= new Servidor();
      System.out.println("iniciando el servidor... \n");
      servi.startServer();
    }
}
