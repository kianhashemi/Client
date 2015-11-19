package org.bihe.main;

import java.io.IOException; 
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


import org.bihe.bean.Person;
import org.bihe.service.HandleCommand;
import org.bihe.service.Service;
import org.bihe.service.entityService.Login;

public class Main {
	

	public static void main(String[] args) {
		Socket socket=new Socket() ;
		try {
			Person p=new Person("siavash", "123");
			Login login=new Login(p);
			socket= new Socket("127.0.0.1", 30000);
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			String hi = "Hi";
			oos.writeObject(login);
			oos.flush();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
