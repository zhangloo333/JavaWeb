import java.net.*;
import java.io.*;

class  RegServer 
{
	public static void main(String[] args) throws Exception
	{

		ServerSocket ss = new ServerSocket(10009);

		Socket s = ss.accept();
		OutputStream out = s.getOutputStream();

		PrintWriter pw = new PrintWriter(out,true);
		
		pw.println("<font size=? color=green>ni zhuce le</font>");
		s.close();
		ss.close();

		System.out.println("Hello World!");
	}
}
