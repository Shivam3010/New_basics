package basics;

import java.util.Scanner;

public class reverse_same_position {

	
	public String getdata(String input)
	{
		
		String out="";
		String s[]=input.split(" ");
		for (int i=0;i<s.length;i++)
		{
			char c[]=s[i].toCharArray();
			for (int j=c.length-1;j>=0;j--)
			{
				out=out+c[j];
			}
			out=out+" ";
		}
		
		return out;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse_same_position ob=new reverse_same_position();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any statement:- ");
		String data=sc.nextLine();
		String z=ob.getdata(data);
		System.out.println(z);
	}

}
