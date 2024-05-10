package network;

import java.net.*;

public class Network {

	public static void main(String[] args) throws UnknownHostException{
		InetAddress ip1 = InetAddress.getByName("www.instagram.com");
		
		System.out.println("1. Address of localhost: " + InetAddress.getLocalHost());
		System.out.println("2. Address of string host: " + InetAddress.getByName("www.google.com"));
		
		byte[] ipadd = {5,10,15,20};
		System.out.println("3. Host name for IP address: " + InetAddress.getByAddress(ipadd));
		
		InetAddress[] obj1 = InetAddress.getAllByName("www.google.com");
		for(InetAddress var: obj1) {
			System.out.println("4. Address of the URL: " + var);
		}
		System.out.println("\n");
		System.out.println("5. InetAddress of host with IP address and IP name: " + InetAddress.getByAddress("www.facebook.com", ipadd));
		System.out.println("6. Loopback address: " + InetAddress.getLoopbackAddress());
		System.out.println("7. Host Name: " + ip1.getHostName());
		System.out.println("8. Host address: " + ip1.getHostAddress());
		System.out.println("9. Multicast address or not: " + ip1.isMulticastAddress());
//		System.out.println("10. Unicast address or not: " + ip1.isUniCastAddress);

	}

}
