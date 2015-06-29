package br.com.caelum.servidor;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Servidor {

	public static void main(String[] args) throws IOException {
	    // ServerSocket servidor = new ServerSocket(12345);
	 
	     ServerSocket servidor2 = new ServerSocket(123456);
	     System.out.println("Porta 123456 aberta!");
	  //   Socket cliente = servidor.accept();
	     Socket cliente2 = servidor2.accept();
	     System.out.println("Nova conexão com o cliente " +   
	       cliente2.getInetAddress().getHostAddress()
	     );
	     
	     Scanner s = new Scanner(cliente2.getInputStream());
	     while (s.hasNextLine()) {
	       System.out.println(s.nextLine());
	     }
	     
	     s.close();
	     servidor2.close();
	     cliente2.close();
	   }
}

