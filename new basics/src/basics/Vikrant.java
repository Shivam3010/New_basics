package basics;

import java.util.Scanner;

public class Vikrant {

	public static void main(String[] args) {
		
		String out="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any statement:- ");
		String statement=sc.nextLine();
		String word[]=statement.split(" ");
		for(int i=0;i<=word.length-1;i++)
		{
			char[]alp=word[i].toCharArray();
			for(int j=alp.length-1;j>=0;j--)
			{
				out=out+alp[j];
			}
			out=out+" ";
		}
		System.out.println(out);

	}

}
