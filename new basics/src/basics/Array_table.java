package basics;

import java.util.Scanner;

public class Array_table {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 numbers:- ");
		
		/*for (int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		
		for(int j=1;j<=10;j++)
		{
			int z=a[i]*j;
			System.out.println(z);
		}
		System.out.println("********************");*/
		
		for (int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<=4;j++)
		{
			for(int k=1;k<=10;k++)
			{
				int z=a[j]*k;
				System.out.println(a[j]+" * "+k+" = "+z);
			}
			System.out.println("***********************");
			
		}
	
	}
}
