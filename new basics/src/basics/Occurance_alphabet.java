package basics;

import java.util.Scanner;

public class Occurance_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:- ");
		String name=sc.next();
		char b=sc.next().charAt(0);
		char []a=name.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
			{
				z=z+1;
			}
		}
		System.out.println(z);
	}

}
