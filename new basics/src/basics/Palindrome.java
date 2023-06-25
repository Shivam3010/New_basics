package basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String out="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name :- ");
		String name=sc.next();
		char[]c=name.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			out=out+c[i];
		}
		System.out.println(out);
		
		if(out.equals(name))
		{
			System.out.println("Name is palindrome");
		}
		else
		{
			System.out.println("Name is not palindrome");
		}
	}

}
