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
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.0.80"),1000);

		dgs.sent(dp);

		dgs.close();

		System.out.println("Hello World!");
	}
}
