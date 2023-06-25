package basics;

import java.util.Scanner;

public class Reversestring2 {

	public static void main(String[] args) {
		
		String out="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String name=sc.next();
		char[]a=name.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			out=out+a[i];
		}
		System.out.println(out);
		if(name.equals(out))
		{
			System.out.println("name is palindrome");
		}
		else
		{
			System.out.println("name is not palindrome");
		}
	}

}
