package basics;

import java.util.Scanner;

public class Armstrong_number_anydigit {
	
	public int getdata(int input)
	{
		int count = 0;
		while(input>0)
		{
			input=input/10;
			count++;
		}
		return count;
	}
	
	public void armstrong(int input)
	{
		int temp=input;
		int count=getdata(input);
		int out=0;
		while(input>0) 
		{
		int a=input%10;
		input=input/10;
		int sum=1;
		for(int i=1;i<=count;i++)
		{
			sum=(sum*a);
		}
		out=out+sum;
		}
		if(temp==out)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armstrong_number_anydigit ob=new Armstrong_number_anydigit();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :- ");
		int a=sc.nextInt();
		ob.getdata(a);
		ob.armstrong(a);

	}

}
