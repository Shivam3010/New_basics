package basics;

import java.util.Scanner;

public class new_reversestring {

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

	}

}
