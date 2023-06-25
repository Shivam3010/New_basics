package basics;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		
		/*String out="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name:- ");
		String name=sc.next();
		char ch[]=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			out=out+ch[i];
		}
		System.out.println(out);*/
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any name:- ");
		String name=sc.next();
		StringBuffer sb=new StringBuffer(name);
		System.out.println(	 sb.reverse());
	}

}
