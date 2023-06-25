package basics;

import java.util.Scanner;

public class Reverse_integer {

	public void getdata()
	{	
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :- ");
		int a=sc.nextInt();
		while (a>0)
		{
			i=a%10;
			a=a/10;
			System.out.print(i);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse_integer ob=new Reverse_integer();
		ob.getdata();
	}

}


