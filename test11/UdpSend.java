import java.net.*;

/*
1
*/

class UdpSend 
{
	public static void main(String[] args) throws Exception
	{

		DatagramSocket dgs = new DatagramSocket();

		byte[] buf = "udp ge men lai le".getBytes();
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.80"),1000);

		dgs.send(dp);

		dgs.close();

//		System.out.println("Hello World!");
	}
}

// byte to string & string to byte
/**
// Code to convert byte arr to str:
byte[] by_original = {0,1,-2,3,-4,-5,6};
String str1 = new String(by_original);
System.out.println("str1 >> "+str1);

// Code to convert str to byte arr:
byte[] by_new = str1.getBytes();
for(int i=0;i<by_new.length;i++) 
System.out.println("by1["+i+"] >> "+str1);

*/

class UdprRec
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket ds = new DatagramSocket(1000);

		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);

		ds.receive(dp);

		String ip = dp.getAddress().getHostAddress();
		String data = new String(dp.getData(),0,dp.getLength());
		int port = dp.getPort();
		System.out.println(ip+"::"+data+"::"+port);
		ds.close();

	}
}