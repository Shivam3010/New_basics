package basics;

import java.util.Scanner;

public class Reverse_string_same_position {
	
	public String getdata(String input) {
		
		String out="";
		String[]s=input.split(" ");
		for(int i=0;i<=s.length-1;i++)
		{
			String data=s[i];
			char[]c=data.toCharArray();
			for(int j=c.length-1;j>=0;j--)
			{
				out=out+c[j];
			}
			out=out+" ";
		}
		return out;
	}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_string_same_position ob=new Reverse_string_same_position();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any sentence :- ");
		String input=sc.nextLine();
		String rev=ob.getdata(input);
		System.out.println(rev);
		
		
		
	}

}
