package basics;

import java.util.Scanner;

public class Reverse_string {
	
	public String getdata(String input)
	{
		String out="";
		char[]c=input.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			out=out+c[i];
		}
		return out;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_string ob=new Reverse_string();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		String z=ob.getdata(name);
		System.out.println(z);
		
		
	}

}
