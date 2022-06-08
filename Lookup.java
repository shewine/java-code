import java.util.*;
import java.io.*;
public class Lookup
{
public static void main(String args[])throws Exception
{
int flag=-1;
String[][] arr=new String[5][6];
arr[0][0]="125.125.125.125";arr[0][1]="135.135.135.135";arr[0][2]="145.145.145.145";arr[0][3]="155.155.155.155";arr[0][4]="165.165.165.165";

arr[1][0]="google.com";arr[1][1]="reddit.com";arr[1][2]="yahoo.com";arr[1][3]="gmail.com";arr[1][4]="watumull.edu";
for(int i=0; i<2; i++)
{
	for(int j=0; j<5; j++)
		{
			System.out.println(arr[i][j]);
		}
}

			InputStreamReader r=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(r);
			String input=br.readLine();
for(int j=0; j<5; j++)
{
	if(input.compareTo(arr[0][j])==0)
		{
			System.out.println(arr[1][j]);
			flag=0;
			break;
		}
	
       else if(input.compareTo(arr[1][j])==0)
		{
			System.out.println(arr[0][j]);
			break;
		}
	
}
	if(flag==-1)
		{
			System.out.println("Entry unavailable");
		}
br.close();
}
}
