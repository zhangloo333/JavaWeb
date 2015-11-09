import java.net.*;

class IPDemo 
{
	public static void main(String[] args) throws Exception
	{
//		InetAddress ip = InetAddress.getLocalHost();
//		System.out.println(ip.toString());
//		System.out.println("address"+ip.getHostName());

		InetAddress ia = InetAddress.getByName("cc.bearhk.info/index.php?u=238665&vcencode=9477144173");
		System.out.println("address:" + ia.getHostAddress());
		System.out.println("name:"+ia.getHostName());

		
	}
}
