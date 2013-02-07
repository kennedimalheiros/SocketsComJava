/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tccrastreador;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author www
 */
public class ServidorTCPBasico {

  public static void main(String[] args) {

    try {

      // Instancia o ServerSocket ouvindo a porta 9000

      ServerSocket servidor = new ServerSocket(9000);

      System.out.println("Servidor ouvindo a porta 9000");

      while(true) {

        // o método accept() bloqueia a execução até que

        // o servidor receba um pedido de conexão

        Socket cliente = servidor.accept();

        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

        ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());

        saida.flush();

//        saida.writeObject(new Date());
        saida.writeUTF("testando kenned");
        saida.close();

        cliente.close();

      }  

    }   

    catch(Exception e) {

       System.out.println("Erro: " + e.getMessage());

    }

    finally {
    }  

  }     

}

