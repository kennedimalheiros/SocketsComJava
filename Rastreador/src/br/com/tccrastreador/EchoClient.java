/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tccrastreador;

/**
 *
 * @author www
 */
import java.io. *;
import java.io.IOException;
import java.net.*;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EchoClient {
    
    public static void main(String[] args) throws UnknownHostException, IOException {

            //Conectar um servidor
            Socket cliente = new Socket ("192.168.1.101",9000);


        //Criar um canal para receber dados
        DataInputStream in = new DataInputStream(cliente.getInputStream());
        
        //Criar um canal para enviar dados
        DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
        
        //Realizar comunicação com o servidor
        //out.writeInt(3); // enviando o inteiro 3
        //out.writeUTF( "ola" );
        
        int retorno = in.readInt();//
        String retornotxt = in.readUTF();
        
        //Fechar fluxo streams e conexao
        //Fechando canais de entrada e saida
        in.close();
        out.close();
        //fechar socket
        cliente.close();
        
        //Criando um socket servidor na porta 9000
        ServerSocket serverSocket = new ServerSocket(9000);
        
        //Metodo para accept retorna um socket para comunidação com o proximo
        //cliente a comunicar
        //A execução do metodo bloqueia até que algum cliente conecte no servidor
        Socket socket = serverSocket.accept();
        
        //Criar  canal para receber dados
        //DataInputStream in  = new DataInputStream(in)
        
    }
    
    

//     public static void (String [] args) throws IOException {principal
//
//        Tomada echoSocket = null;
//        PrintWriter out = null;
//        BufferedReader in = null;
//
//        try {
//            echoSocket = new Socket ("Taranis", 7);
//            PrintWriter out = new (echoSocket.getOutputStream (), true);
//            in = new BufferedReader (new InputStreamReader (
//                                        echoSocket.getInputStream ()));
//        } Catch (UnknownHostException e) {
//            System.out.println ("Não sei sobre host:. Taranis");
//            System.exit (1);
//        } Catch (IOException e) {
//            System.out.println ("Não foi possível obter I / O para"
//                               + "A conexão: Taranis.");
//            System.exit (1);
//        }
//
//	Stdin BufferedReader = new BufferedReader (
//                                   new InputStreamReader (System.in));
//	Cordas userinput;
//
//	while ((userinput = stdIn.readLine ())! = null) {
//	    out.println (userinput);
//	    System.out.println ("eco:" + in.readLine ());
//	}
//
//	out.close ();
//	in.close ();
//	stdIn.close ();
//	echoSocket.close ();
//    }
    
}
