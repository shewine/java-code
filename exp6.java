import java.io.*;
import java.net.*;
import java.util.*;

class exp6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String url="";
		String IP="";
		String choice="";
		System.out.println("1. Enter Host Name. \n2. Enter IP Address.");
		System.out.print("Enter your Choice: ");
		choice = sc.next();
		try{
			switch(choice){
				case "1":
					System.out.println("Enter the Host name: ");
					url = sc.next();
					InetAddress ip = InetAddress.getByName(url);
					System.out.println("IP Address: " + ip.getHostAddress());
					break;
				case "2":
					System.out.println("Enter the IP Address: ");
					IP = sc.next();
					InetAddress host = InetAddress.getByName(IP);
					System.out.println("Host Name: " + host.getHostName());
					System.out.println("Host Address: " + host.getHostAddress());
					break;
			}		
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
