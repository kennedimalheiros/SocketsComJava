/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tccrastreador;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author www
 */
public class ClienteTCPBasico {

    public static void main(String[] args) {

        try {
       //     for (int i= 1; i < 200; i++) {
//      Socket cliente = new Socket("177.115.158.129",9000);
                Socket cliente = new Socket("192.168.1.101", 9000);

                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());

                //Date data_atual = (Date)entrada.readObject();
//      JOptionPane.showMessageDialog(null,"Data recebida do servidor:" + retorno.toString());

                //Capturando o entrada e colocando na variavel retorno
                String retorno = entrada.readUTF();
                //mostrando o texto de retorno
                System.out.println("-- " + retorno.toString());

                entrada.close();
         //   }
            System.out.println("Conexão encerrada");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }

    }
}
