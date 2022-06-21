package step01.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01IP {
	public static void main(String[] args) {
		// IP 주소 : java.net.xxx
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostName());
			System.out.println(local.getHostAddress());
			
			// 외부 정보
			InetAddress[] inetAddress =  InetAddress.getAllByName("google.com");
			System.out.println(inetAddress);
			for(InetAddress i : inetAddress) {
				System.out.println(i);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
