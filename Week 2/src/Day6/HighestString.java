package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class HighestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 String s =sc.nextLine();
System.out.println(printHighest( s));
	}
public static String printHighest(String s)
{
	String arr[]=s.split(" ");
	int l=0;
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i].length()>l)
		{
			l=arr[i].length();
		}
		
	}
	String fina="";
	for(int i=0;i<arr.length;i++)
	{
	 if(arr[i].length()==l)
	 {
		fina=fina+arr[i]+" ";
	 }
	}
	return fina;
}
}
